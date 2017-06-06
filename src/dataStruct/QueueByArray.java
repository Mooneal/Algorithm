package dataStruct;

public class QueueByArray {
	private int[] arr;
	private int front=0;
	private int rear=0;
	private int count=0;
	public QueueByArray(){
		this.arr=new int[10];
	}
	public QueueByArray(int init){
		if(init<=0)
			init=10;
		this.arr=new int[init];
	}
	
	public boolean isFull(){
		return count==arr.length;
	}
	public boolean isEmpty(){
		return count==0;
	}
	public boolean addFirst(int data){        //入队
		if(isFull())
			return false;
		if(front==arr.length)
			front=0;
		arr[front++]=data;
		count++;
		return true;
	}
	public boolean deletEnd(){
		if(isEmpty())
			return false;
		if(rear==arr.length)
			rear=0;
		rear++;
		count--;
		return true;
	}
	public void printQueue(){
		int temp=rear;               //用一个临时变量代替队尾，防止遍历过程中改变队尾的值。
		while(temp!=front){
			if(temp==arr.length)
				temp=0;
			System.out.println(arr[temp++]);
		}
		/*
		 * 这里我们从队尾开始打印，即从先进入队的元素开始打印。
		 * */
	}
	
	
}
