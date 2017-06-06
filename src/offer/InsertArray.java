package offer;

import java.util.Arrays;

public class InsertArray {
	/*
	 * 需求：有两个排序的数组a1和a2，请实现一个函数，把a2中的所有数字插入到a1中，并且所有的数字是排序的。
	 * */
	public int[] insertSort(int[] arr1,int [] arr2){
	/*	if(arr1!=null && arr2!=null){
			int i=arr1.length-1;                        //记录原数组1的最后一个元素的下表
			int newLength=arr1.length+arr2.length;           
			arr1=Arrays.copyOf(arr1, newLength);    //将数组1扩展为长度为两个数组之和。
			int j=arr2.length-1;                 //记录数组2最后一个元素的下标
			int k=arr1.length-1;                //记录新数组最后一个元素下标。
			while(j>=0){                        //因为是插入数组2，所以数组2没有遍历完，就要一直循环。
				if(arr2[j]>arr1[i]){           //如果数组1元素大于数组2元素，就把数组2元素存放到新数组1里去。
					arr1[k--]=arr2[j--];
				}else if(arr2[j]==arr1[i]){             
					arr1[k--]=arr2[j--];
					arr1[k--]=arr1[i--];
				}else{
					arr1[k--]=arr1[i--];
				}
			}
			return arr1;
		}else
			throw new RuntimeException("传入的数组有误");*/
		
		if(arr1!=null && arr2!=null){
			int i=arr1.length-1;
			int j=arr2.length-1;
			int x=i+j+1;
			arr1=Arrays.copyOf(arr1, x+1);
			while( j>=0){
				if(arr1[i]>arr2[j]){
					arr1[x--]=arr1[i--];
				}else if(arr2[j]==arr1[i]){             
					arr1[x--]=arr2[j--];
					arr1[x--]=arr1[i--];
					}
				else{
					arr1[x--]=arr2[j--];
				}
			}
			return arr1;
		}else
			throw new RuntimeException("传入的数组有误");
		
	}
}
