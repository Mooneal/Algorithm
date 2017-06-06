package algorithm.ch3;

public class SelectSort {
	private int[] arr;
	public SelectSort(int[] arr){
		this.arr=arr;
	}
	/*
	 * 优化的选择排序，每一次遍历都找到这次遍历的序列的最大数和最小数，并把它们放入这个序列的最后和最前。
	 * 这里要注意的是，因为每次都要比较整个序列，所以必须从第一个元素到最后一个元素。
	 * 而不是像一般的选择排序那样，每次从选定元素的后一个元素比较。
	 * */
	
	public void sort(){
		int maxIndex;
		int minIndex;
		for(int i=0,j=arr.length-1;i<j;i++,j--){       
			minIndex=i;
			maxIndex=j;
			for(int k=i;k<=j;k++){
				if(arr[minIndex]>arr[k]){
					minIndex=k;
				}
				if(arr[maxIndex]<arr[k]){
					maxIndex=k;
				}
			}
			if(maxIndex!=j){
				int temp=arr[j];
				arr[j]=arr[maxIndex];
				arr[maxIndex]=temp;
			}
			if(minIndex!=i){
				int temp=arr[i];
				arr[i]=arr[minIndex];
				arr[minIndex]=temp;
			}
			
		}
	}
	
	public void sort2(){
		int maxIndex;
		for(int i=arr.length-1;i>0;i--){
			maxIndex=i;
			for(int j=i-1;j>=0;j--){
				if(arr[maxIndex]<arr[j]){
					maxIndex=j;
				}
			}
			if(maxIndex!=i){
				int temp=arr[i];
				arr[i]=arr[maxIndex];
				arr[maxIndex]=temp;
			}
		}
	}
	
	public void print(){
		for(int x:arr){
			System.err.print(x+",");
		}
	}
}
