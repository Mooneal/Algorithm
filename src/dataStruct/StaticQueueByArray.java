package dataStruct;

public class StaticQueueByArray {
	int front;               //定义队头下标
	int rear;                //定义队尾下标
	int currentSize;         //定义当前队列元素个数。
	
	int[] arr;
	public StaticQueueByArray(){
		front=0;
		rear=0;
		arr=new int[10];
	}
	
	public boolean addLast(int var){ //入队
		if(!isFull()){
			arr[rear++]=var;
			if(rear==arr.length)
				rear=0;
			currentSize++;
			return true;
		}
		return false;
		
	}
	
	public boolean isFull() {                           //这里可以是使用
		// TODO Auto-generated method stub
		if(currentSize==arr.length)
			return true;
		else 
			return false;
		
	}

	public boolean deletFirst(){  //出队
		if(!isEmpty()){
			front++;
			if(front==arr.length)
				front=0;
			
			currentSize--;
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(0==currentSize){
			return true;
		}else
			return false;
	}
	
	
}
