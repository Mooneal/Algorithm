package dataStruct;

public class QueueTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticQueueByArray s=new StaticQueueByArray();
		s.addLast(10);
		traver(s);
		s.addLast(8);
		s.addLast(7);
		s.addLast(12);
		s.addLast(12);
		s.addLast(12);
		s.addLast(12);
		s.addLast(12);
		s.addLast(12);
		traver(s);
		s.addLast(12);
		
		
		for(int x:s.arr){          //测试增加结果是否是对的。
			System.out.print(x+" ");
		}
		System.out.println(" ");
		int count=s.currentSize;
		System.out.println(count);         //测试增加数目是否是对的。
		System.out.println(s.isFull());
		
		boolean b=s.deletFirst();
		
		System.out.println(b);
		System.out.println(s.currentSize);
		System.out.println(s.isFull());
		s.deletFirst();
		s.deletFirst();
		s.deletFirst();
		s.deletFirst();
		s.deletFirst();
		s.deletFirst();
		s.deletFirst();
		s.deletFirst();
		s.deletFirst();
		System.out.println(s.isEmpty());
		
		s.addLast(19);
		System.out.println(s.isEmpty());
		for(int x:s.arr){          //测试增加结果是否是对的。
			System.out.print(x+" ");
		}
		
	}
	public static void traver(StaticQueueByArray s){
		for(int x:s.arr){          //测试增加结果是否是对的。
			System.out.print(x+" ");
		}
		System.out.println(" ");
	}

}
