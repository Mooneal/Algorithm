package dataStruct;

public class QueueByLinked {
	/*
	 * 需求：用链表实现队列
	 * 思路：1.添加节点只能从链表尾部开始添加，
	 * 		2.删除节点只能从链表头部开始删除。
	 * */
	Node front;
	Node rear;
	public QueueByLinked(){
		this.front=null;
		this.rear=null;
	}  
	
	public void addLast(int var){
		if(rear==null && front==null){
			rear=new Node();
			front=rear;
			front.setData(var);
		}else{
			Node pNew=new Node();
			pNew.setData(var);
			rear.setNext(pNew);
			rear=pNew;
		}
			
	}
	
	public int deleteFirst(){
		if(front==null)
			return 0;
		if(front==rear && rear!=null){
			Node temp=front;
			front=null;
			rear=null;
			return temp.getData();
		}
		int var =front.getData();
		front=front.getNext();
		return var;
		
	}
}
