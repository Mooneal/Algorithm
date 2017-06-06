package algorithm.ch3;

public class QuickSort {
	private int[] arr;
	public QuickSort(int[] arr){
		this.arr=arr;
	}
	
	public void quickSort(int[] arr,int begin,int end){
		if(begin<end){
			int key=arr[begin];                      //设定基准值。
			int i=begin;                      
			int j=end;
			while(i<j){
				while(i<j && arr[j]>=key){          //
					j--;
				}
				if(i<j){
					arr[i]=arr[j];
					i++;
				}
				while(i<j && arr[i]<=key){
					i++;
				}
				if(i<j){
					arr[j]=arr[i];
					j--;
				}
			}
			arr[i]=key;
			quickSort(arr,begin,i-1);
			quickSort(arr,i+1,end);
		}
		
	}
	
	public void sort(){
		quickSort(arr, 0, arr.length-1);
	}

	private void swap(int[] arr2, int i, int j) {
		// TODO Auto-generated method stub
		int temp=arr2[i];
		arr2[i]=arr2[j];
		arr2[j]=temp;
	}
	
	public void print(){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

	
}
/*
 * 每次从无序的序列中找出一个数作为中间点（可以把第一个数作为中间点），然后把小于中间点的数放在中间点的左边，
 * 把大于中间点的数放在中间点的右边；对以上过程重复log(n)次得到有序的序列。
 * */
