package algorithm.ch3;

public class QuickSortTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={5,9,1,9,11,3,7,6,5};
		QuickSort q=new QuickSort(arr);
		q.sort();
		q.print();
	}

}
