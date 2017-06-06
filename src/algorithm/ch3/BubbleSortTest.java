package algorithm.ch3;

public class BubbleSortTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={10,9,8,7,6,5,3,11};
		BubbleSort b=new BubbleSort(arr);
		b.orderSort();
		b.traverse();
		b.revSort();
		b.traverse();
	}

}
