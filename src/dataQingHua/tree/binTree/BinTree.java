package dataQingHua.tree.binTree;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinTree {
	/*
	 * BinTree 有什么借口呢？
	 * */
	private int _size;                  //二叉树的规模
	private BinNode root;				//根节点
	
	public BinTree(int size,BinNode root){
		this._size=size;
		this.root=root;
	}
	
	public int size(){               //得到规模
		return _size;
	}
	
	public BinNode root(){              //得到树根
		return root;
	}
	
	public boolean isEmpty(){                //判断空
		if(root!=null){
			return false;
		}else{
			return true;
		}
	}
	/*
	 * 节点高度，以及改变树后节点高度更新算法
	 * */
	//1.节点高度
	public int nodeHeigh(BinNode node){
		return (node!=null)?node.height:-1;        //约定空树高度为-1，只有根节点高度为0；
	}
	
	//2.更新节点 x 高度
	public int updateNodeHeigh(BinNode x){
		return x.height=1+Math.max(nodeHeigh(x.lChild),nodeHeigh(x.rChild));
	}
	//3.更新节点 v 以及它的历代祖先的高度。
	public void updateNodeHeighAbove(BinNode v){
		while(v!=null){
			updateNodeHeigh(v);
			v=v.parent;
		}
	}
	
	/*
	 * 子树接入，删除和分离接口
	 * */
	//1.把一个数据当x节点的右节点插入
	public BinNode insertAsRC(int data,BinNode x){
		_size++;                                       //树的整体规模要加一
		x.rChild=new BinNode(data, x);
		updateNodeHeighAbove(x);                 //节点及其祖先高度要更新
		return x.rChild;
	}
	//2.吧一个数据当x节点的左节点插入
	public BinNode insertAsLC(int data,BinNode x){
		_size++;                                       //树的整体规模要加一
		x.lChild=new BinNode(data, x);
		updateNodeHeighAbove(x);                 //节点及其祖先高度要更新
		return x.lChild;
	}
		
	/*
	 * 遍历接口
	 * 先序     中序      后序     层次（自上而下，先左后右）
	 * */
	//1.先序遍历， 根左右             递归形式   
	public void  traverseRevcursion(BinNode x){     
		if(x==null)
			return;
	//	System.out.println(x.data);                  //因为递归对于栈，可能会让栈溢出的风险。所以，如果有可能尽量把递归改为迭代形式。 这种尾递归形式
		traverseRevcursion(x.lChild);
	//	System.out.println(x.data);  
		traverseRevcursion(x.rChild);     
		System.out.println(x.data);  
	}
	
	public void traverseItetator1(BinNode x){
		/*
		 * 思路，把尾递归改成迭代，我们可以用一个栈来实现迭代形式，  这种形式非常简单，但是很难用于 中序遍历 以及 后序遍历 ，因为这两者都要在递归结束后才可以输出。即要深入到递归最里面。
		 * */
		Stack<BinNode> stack=new Stack<BinNode>();
		stack.push(x);
		BinNode y=new BinNode(0, null);
		while(!stack.isEmpty()){
			y=stack.pop();
			System.out.println(y.data);
			if(y.rChild!=null){
				stack.push(y.rChild);
			}
			if(y.lChild!=null){
				stack.push(y.lChild);
			}
		}
	}
	
	public void traverseItetator2(BinNode x){
		Stack<BinNode> stack=new Stack<BinNode>();
		while(true){
			visitLeftBranch(x, stack);
			if(stack.isEmpty())
				break;
			x=stack.pop();
			
		}
	}
	public void visitLeftBranch(BinNode x, Stack<BinNode> stack){
		while(x!=null){
			System.out.println(x.data);
			stack.push(x.rChild);             //右孩子入栈
			x=x.lChild;
		}
		
	}
	
	
	//2.中序遍历   左根右
	public void visitLeftBranch2(BinNode x, Stack<BinNode> stack1){
		while(x!=null){
			stack1.push(x);
			x=x.lChild;
		}
		
	}
	public void traverseInOrderItetator2(BinNode x){
		Stack<BinNode> stack1=new Stack<BinNode>();
	/*	stack1.push(x);
		visitLeftBranch2(x, stack1);
		x=stack1.pop();
		while(true){
			if(x.rChild!=null){
				System.out.println(x.data);
				x=x.rChild;
				visitLeftBranch2(x, stack1);
				x=stack1.pop();
			}else{
				System.out.println(x.data);
				x=stack1.pop();
			}
			if(stack1.isEmpty())
				break;
		}*/
		
		while(true){
			visitLeftBranch2(x, stack1);         //这里根本没有用到任何一个判断 右孩子 是否为空，因为他已经假设他有右孩子了。如果没有，那就继续出栈就好了。
			if(stack1.isEmpty())
				break;
			x=stack1.pop();
			System.out.println(x.data);         //时间复杂度 o（n） ，分摊分析
			x=x.rChild;
		}
		
	}
	
	//后序遍历
	public void traverseOldOrderItetator2(BinNode x){
		Stack<BinNode> stack1=new Stack<BinNode>();
		stack1.push(x);
		while(!stack1.isEmpty()){
			if(stack1.peek()!=x.parent){
				goPost(stack1);
			}
			x=stack1.pop();
			System.out.println(x.data);
		}
	}
	public void goPost(Stack<BinNode> stack1){
		BinNode x=stack1.peek();
		while(x!=null){
			if(x.lChild!=null){
				if(x.rChild!=null)
					stack1.push(x.rChild);
				stack1.push(x.lChild);	
			}else
				stack1.push(x.rChild);
			x=stack1.peek();
		}
		
		stack1.pop();     //这是因为栈顶最后是一个 空  这个空是用来结束while循环的标识。
	}
	
	
	//层次遍历
	public void rankTraverse(BinNode x){
		Queue<BinNode> q=new LinkedList<BinNode>();  //队列是一种特殊的线性表，只允许在表的前段进行删除操作，在表的后端进行插入操作。
		//LinkedList实现了Queue接口，因此可以把这个当Queue用。
		q.offer(x);
		while(!q.isEmpty()){
			x=q.poll();
			System.out.println(x.data);
			if(x.lChild!=null){
				q.offer(x.lChild);
			}
			if(x.rChild!=null){
				q.offer(x.rChild);
			}
		}
		
	}
	
	

	
}
