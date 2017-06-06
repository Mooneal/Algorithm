package dataQingHua;

import java.util.ArrayList;
import java.util.Stack;

/*
 * 十进制转化成其他进制
 * */
public class HexConverter {
	public static void main(String[] args) {
		String str=converter(2013,16);
		System.out.println(str);
	}
	
	public static String converter(int num,int hex){
		
		char[] digit={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		//注意，用下标来表示其他 。
		Stack<Character> stack=new Stack<Character>();
		while(num>0){
		
			stack.push(digit[num%hex]);
			num/=hex;
		}
		StringBuilder sb=new StringBuilder();
		while(!stack.isEmpty()){
			sb.append(stack.pop());
		}
		
		return sb.toString();
	}
	
}
