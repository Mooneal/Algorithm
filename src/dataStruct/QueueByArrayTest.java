package dataStruct;

public class QueueByArrayTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			QueueByArray que=new QueueByArray(10);
			System.out.println(que.deletEnd());
			que.addFirst(3);
			que.addFirst(4);
			que.addFirst(5);
			que.addFirst(6);
			que.addFirst(7);
			que.addFirst(8);
			que.addFirst(9);
			que.addFirst(10);
			que.addFirst(11);
			que.addFirst(12);
			System.out.println(que.addFirst(13));
			System.out.println(que.isFull());
			que.deletEnd();
			System.out.println(que.isFull());
			System.out.println(que.addFirst(13));
			que.deletEnd();
			que.deletEnd();
			que.deletEnd();
			que.printQueue();
	}

}
