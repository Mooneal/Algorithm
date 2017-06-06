package algorithm.ch3;

public class SelectSortTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={98,2,5,1,37,28,100};
		SelectSort ss=new SelectSort(arr);
		ss.sort2();
		ss.print();
	}

}
