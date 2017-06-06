package offer;

public class BinArraysTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		int key=6;
		BinArrays b=new BinArrays();
		boolean x=b.Find(arr, key);
		System.out.println(x);
	}

}
