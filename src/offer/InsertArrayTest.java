package offer;

public class InsertArrayTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1={1,2,4,8,19,25};
		int[] arr2={3,6,7,12,19,35};
		InsertArray iArray=new InsertArray();
		arr1=iArray.insertSort(arr1, arr2);
		for(int x:arr1){
			System.out.print(x+",");
		}
	}

}
