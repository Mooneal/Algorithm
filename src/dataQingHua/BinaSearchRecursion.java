package dataQingHua;

public class BinaSearchRecursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr={1,2,3,4,5,6,7,8,9};
		
		System.out.println(BinaSearch(10, arr, 0, arr.length));

	}
	public static int BinaSearch(int key,int[] arr,int start,int end){
		
		while(start<end){
			int mid=(start+end)/2;
			
			if(arr[mid]>key){
				end=mid;
				
			}else if(arr[mid]<key){
				start=mid+1;
			}else{
				return arr[mid];
			}
		}
		
		
		return -1;
		
		
	}

}
