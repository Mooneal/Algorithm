package test;

public class ClearSpace {
	public String clear(String str){
		int start=0;
		int end=str.length()-1;
		while(str.charAt(start)==' ')
			start++;
		while(str.charAt(end)==' ')
			end--;
		
		String str1=str.substring(start, end+1);             //这里很重要的一点，起始索引包括，结束索引不包括，所以这里要加1
		return str1;
		
		
	}
}
