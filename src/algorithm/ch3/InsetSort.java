package algorithm.ch3;

public class InsetSort {
	private int[] arr;
	public InsetSort(int[] arr){
		this.arr=arr;
	}
	public void sort(){
		if(arr==null){
			throw new RuntimeException("没有这个数组");
		}
		int j;
		for(int i=1;i<arr.length;i++){         //插入排序就是，把利用挖坑，取出目标值，并且和前面有序的元素比较，找到一个坑往里面填。
			 int key=arr[i];
			 j=i;
			 while(j>0 && key<arr[j-1]){
				 arr[j]=arr[j-1];
				 j--;
			 }
			 arr[j]=key;
		}
	}
	
	public void print(){
		for(int i:arr){
			System.out.print(i+",");
		}
	}
}
