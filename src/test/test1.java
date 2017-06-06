package test;
import java.util.Arrays;
import java.util.Scanner;

/*
 * 把序列GBGBGBGB变成了 GGGGBBB或者BBBGGGG 最少移动次数，而且只能两个相邻的移动。
 * 
 * */
public class test1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		char[] chx=str.toCharArray();
		int x=0;
		for(int i=0;i<chx.length;i++){
			if(chx[i]=='G'){
				x++;
			}
		}
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		for(int j=0;j<x;j++){
			if(chx[j]=='B'){
				count1+=j;
			}
		}
		for(int j=x;j<chx.length;j++){
			if(chx[j]=='G'){
				count2+=j;
			}
		}
		count3=count2-count1;
		count1=0;
		count2=0;
		
		for(int j=0;j<(chx.length-x);j++){
			if(chx[j]=='G'){
				count1+=j;
			}
		}
		for(int j=(chx.length-x);j<chx.length;j++){
			if(chx[j]=='B'){
				count2+=j;
			}
		}
		count4=count2-count1;
		
		int sum=(count4>count3)?count3:count4;
		System.out.println(sum);
	}
	
	
	}

