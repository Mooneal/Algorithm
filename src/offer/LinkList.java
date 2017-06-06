package offer;

import java.util.Stack;

public class LinkList {
	ListNode pHead;
//	ListNode pTail=pHead; //错误，直接对类成员初始化，给对象初始化必须在构造函数中
							//静态代码块，给类初始化的，比如有的类不能实例化，就只有通过静态代码块来对它的成员初始化。
	ListNode pTail;
	
	int count=0;
	                       //只有在方法中，在可以调用函数。在类中是可以定义一个对象引用，并实例化它。
							//但想通过实例对象调用方法，调用成员，必须在方法中。
	public LinkList(ListNode pHead){
		this.pHead=pHead;
		pTail=pHead;
	}
	
	public void add(int var){                     //往链表中追加元素。
		
		ListNode pNew=new ListNode();
		pNew.data=var;
		pTail.next=pNew;
		pNew.next=null;
		pTail=pNew;
		count++;
		
	}
	
	public void insert(int index,int var){          //往下标为index插入节点。
		if(index>0){
			ListNode pLast=pHead;
			for(int i=0;i<index;i++){
				pLast=pLast.next;
			}
			ListNode temp=pLast.next;
			ListNode pNew=new ListNode();
			pNew.data=var;
			pNew.next=temp;
			pLast.next=pNew;
			count++;
		}
		
	}
	
	public int deletEle(int index){
		
		if(index>0){
			ListNode pLast=pHead;
			for(int i=1;i<index;i++){
				pLast=pLast.next;
			}
			int value=pLast.next.data;
			pLast.next=pLast.next.next;
			return value;
		}
		return -1;
	}
	
	public void print(){                               //这是顺序打印。
		ListNode pLast;
		int i;
		pLast=pHead;
		while((pLast=pLast.next)!=null){
			i=pLast.data;
			System.out.print(i);
		}
		System.out.println("");
	}
	
	public void rePrint(){
		Stack<Integer> s=new Stack<Integer>();
		ListNode pLast;
		pLast=pHead;
		while((pLast=pLast.next)!=null){                     //通过栈逆序输出。
															//通过递归逆序输出。
			s.push(pLast.data);
		}
		while(!s.isEmpty())
			System.out.println(s.pop());
	}
	
}
