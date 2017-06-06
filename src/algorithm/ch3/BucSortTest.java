package algorithm.ch3;


public class BucSortTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={5,1,4,6,2};
		BucketSort b=new BucketSort(7,arr);
		b.sort();
		b.print();
	}

}
