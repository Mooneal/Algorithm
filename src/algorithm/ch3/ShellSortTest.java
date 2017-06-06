package algorithm.ch3;

public class ShellSortTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={2,1,3,0,12,3,7,4};
		ShellSort s=new ShellSort(arr);
		s.sort();
		s.print();
	}

}
