package algorithm.ch3;

public class BubbleSort {
	private int lastPosTemp;
	private int lastPos;
	private int[] arr;
	public BubbleSort(int[] arr){
		this.arr=arr;
	}
	
	public void orderSort(){
		lastPos=arr.length-1;
		for(int i=0;i<arr.length-1;i++){

			lastPosTemp=lastPos;
			for(int j=0;j<lastPosTemp;j++){
				if(arr[j]>arr[j+1]){
					swap(arr,j,j+1);
					lastPos=j;
				}	
			}
			if(lastPosTemp==lastPos)
				break;
			

		}
	}
	
	public void revSort(){
		lastPos=0;
		for(int i=0;i<arr.length-1;i++){
			lastPosTemp=lastPos;
		//	flag=false;
			for(int j=arr.length-1;j>lastPosTemp;j--){
				if(arr[j]>arr[j-1]){
					swap(arr,j,j-1);
					lastPos=j;
				}
			}
			if(lastPos==lastPosTemp)
				break;
//			if(!flag)
//				break;
		}
	}
/*  这样写交换函数是错误的，因为int 是基本数据类型，所以是值传递，应该改成下列方法
	private void swap(int i, int j) {
		// TODO Auto-generated method stub
		int temp=i;
		i=j;
		j=temp;
	}
	*/
	private void swap(int[] arr,int i,int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public void traverse(){
		System.out.print("[");
		for(int i=0;i<arr.length;i++){
			if(i!=arr.length-1)
				System.out.print(arr[i]+",");
			else
				System.out.print(arr[i]+"]");
		}
	}
}
