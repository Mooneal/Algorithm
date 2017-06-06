package dataStruct;

public class MaxSubSquence {
	/*
	 * 给定一个序列，求出它的最大子序列。并求和。
	 * */
	private int[] arr;
	public MaxSubSquence(int[] arr){
		this.arr=arr;
	}
	public int method1(){
		int maxSum=0;
		for(int i=0;i<arr.length;i++){
			int thisSum=0;
			for(int j=i;j<arr.length;j++){
				thisSum+=arr[j];
				if(thisSum>maxSum)
					maxSum=thisSum;
			}
		}
		return maxSum;
	}
	
	public int method2(){
		int maxSum=0;
		int thisSum=0;
		for(int i=0;i<arr.length;i++){
			thisSum+=arr[i];
			if(thisSum>maxSum)
				maxSum=thisSum;
			else if(thisSum<0)
				thisSum=0;
		}
		return maxSum;
	}
}
