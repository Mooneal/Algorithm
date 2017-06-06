package dataQingHua;

public class OnlyingArray {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr={3,1,2,3,5,6,2};
		int [] arr1=only(arr);
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+",");
		}
	}
	
	//1.蛮力算法
	public static int[] only(int [] arr){
		//1.创立一个和原数组一样大小的数组
		int[] arr1=new int[arr.length];
		//2.
		for(int i=0;i<arr1.length;i++){
			arr1[i]=1;
		}
		for(int i=0;i<arr.length-1 && arr1[i]!=0;i++){
			for(int j=i+1;j<arr.length ;j++){
				if(arr[i]==arr[j]){
					arr1[i]++;
					arr1[j]=0;
				}
			}
		}
		int length=0;
		for(int i=0;i<arr1.length;i++){
			if(arr1[i]!=0){
				length++;
			}
		}	
		int[] arr2=new int[length];	
		for(int i=0, j=0;i<arr1.length;i++){
			if(arr1[i]!=0){
				arr2[j++]=arr[i];
			}
		}
		return arr2;
	}

}
