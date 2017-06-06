package dataQingHua.chapter4.stack;

import java.util.Stack;

public class checkBrace {
	public static void main(String[] args) {
		String str="{({[]})}";
		System.out.println(braceMatrix(str));
	}
	public static boolean braceMatrix(String str){                       //str.charAt(index)要记住用这种算法。
		
		String[] braces={"(","{","}",")"};
		Stack<String> stack=new Stack<String>();
		
		for(int i=0;i<braces.length;i++){
			if(braces[i].equals("(") || braces[i].equals("[") || braces[i].equals("{")){
				stack.push(braces[i]);
			}else{
				if(stack.isEmpty())
				{
					return false;
				}
				else {
					String s=stack.peek();
					String newStr=s+braces[i];
					if(newStr.equals("()") || newStr.equals("[]") || newStr.equals("{}")){
						stack.pop();
					}else{
						return false;
					}
				}
					
			}
		}
	
			return stack.isEmpty();
	}
}
