package test;

import java.util.Scanner;

public class test3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		
		while(k>0){
			int[] temp=new int[n];
			for(int i=0;i<n-1;i++){
				if(arr[i]>=100){
					temp[i]=arr[i]/100;
				}else{
					temp[i]=arr[i]+arr[i+1];
				}
			}
			if(arr[n-1]>=100){
				temp[n-1]=arr[n-1]/100;
			}else{
				temp[n-1]=arr[n-1]+arr[0];
			}
			k--;
			arr=temp;
		}
		
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
