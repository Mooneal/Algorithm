package dataQingHua;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class test4 {
	/*小易有一个长度为n序列，小易想移除掉里面的重复元素，但是小易想是对于每种元素保留最后出现的那个。小易遇到了困难,希望你来帮助他。
	输入描述:

	输入包括两行：
	第一行为序列长度n(1 ≤ n ≤ 50)
	第二行为n个数sequence[i](1 ≤ sequence[i] ≤ 1000)，以空格分隔*/
	
	/*
	 * 算法实现：
	 * 1.实现一个ArrayList， 对序列n从后往前遍历，如果ArrayList不包括，那就把元素放入ArrayList中。最后打印出来。
	 * 
	 * 2.从后到前遍历，每个数和它后面不为0的数比较，如果有相同的，就把那个数变成0  ，最后遍历数组，打印出不为0的数。
	 * */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] list=new int[n];
		for(int i=0;i<n;i++){
			list[i]=sc.nextInt();
		}
	
		
		
		int[] temp=new int[n];
		int k=1;
		
		for(int i=list.length-1;i>=0;i--){
			int key=list[i];
			for(int j=n-1;j>n-1-k;j--){
				if(key!=temp[j]){
					temp[n-k]=list[i];
					k++;
					break;
				}
			}
		
		}
		
		for(int i=n-k;i<n;i++){
			if(i<n-1){
				System.out.print(temp[i]+" ");
			}else
				System.out.print(temp[i]);
			
		}
		
	}
}
