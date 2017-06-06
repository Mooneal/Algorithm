package test;

import java.util.ArrayList;
import java.util.LinkedList;

public class StrIn {
	
	

	    public static void main(String[] args) {  

	     char buf[]={'a','b','c','c'};  

	 

	      perm(buf,0,buf.length-1);  
	        
//	        String str="abc";
//	        LinkedList<String>  list=  permutation(str);
//	        
//	        for(String str1:list){
//	        	System.out.println(str1);
//	        }

	    }  

	    public static void perm(char[] buf,int start,int end){  
	    	
	    	ArrayList<Character> list=new ArrayList<Character>();

	//这个判断很关键，每次递归到最后的时候，就是START每次都等于END的时候，就是要打印出相 //应的全排列字符串的时候，
	        if(start==end){//这个判断用于递归到最后的时候输出相应的字符串  

	        	
	        	
	        	
	        	
	            for(int i=0;i<=end;i++){  

	                System.out.print(buf[i]);  

	            }  

	            System.out.println();     

	        }  

	        else{//这个else块的作用有1：交换第一个位置的字符，比如第一个位置的全排列字符串全部打印后

	        					//就把第一个字符和第二个交换；2：递归打印每次第一个字符串的全排列字符串；3：每次

	        		//递归的时候都会传递一个字符串数组，最后三行代码就是控制这个字符串数组不变，意思就是

	        		//什么样子传递出去，就什么样子传递回来，一点不能变化，因为最后三行代码不是用于改变

	        		//字符串数组的

	            for(int i=start;i<=end;i++){  
	            	
	            	if(  !isRepeat(buf, i,start))
	            	{
	            	
	                char temp=buf[start];//这三行代码用于控制第一个位置的字符，就是作用1  
	                buf[start]=buf[i]; //比如,第一次时的第一个字符的全排列输出完后, //然后把第一个和第二个字符进行交换,交换后,再排列     
	                buf[i]=temp;  //刚被交换到第一个位置字符的 全排列字符串                 
	                perm(buf,start+1,end);//通过start控制要被输出的字符串，对应作用2

	                temp=buf[start];//这三行是把变换后的字符串顺序进行还原,能够变换字符串顺序的，对应作用3  //代码就在递归函数perm()上面三行，用于交换字符串顺序来    
	                buf[start]=buf[i];  //交换出所需的全排列字符串
	                buf[i]=temp;  
	            	}

	            }  

	        }  

	    }  
	    
	    public static boolean isRepeat(char[] buf,int i,int start){
	    	for(int x=start;x<i;x++){
	    		if(buf[i]==buf[x]){
	    			return true;
	    		}
	    	}
	    	return false;
	    }
	    
	    
	    public static LinkedList<String> permutation(String str) {  
	          
	        LinkedList<String> linkedString = new LinkedList<String>();   
	        if (str.length() <= 1) {  
	            linkedString.add(str);  
	            return linkedString;  
	        }   
	        for (int i = 0; i < str.length() ; i++) {  
	            char ch = str.charAt(i);  
	            //consider the case in which the characters may be duplicated.  
	            if (i > 0 && ch == str.charAt(i - 1)) {  
	                continue;  
	            }  
	            String newStr = remove(str, i);  
	            LinkedList<String> newStrList= permutation(newStr);   
	            for (int j = 0; j < newStrList.size(); j++) {  
	                linkedString.add(ch + newStrList.get(j));  
	            }  
	        }  
	        return linkedString;  
	    }  
	    //remove the ith character from the string  
	    public static String remove(String str, int i) {  
	        if (i == 0) return str.substring(1, str.length());  
	        if (i == str.length() - 1) return str.substring(0, i );  
	        return str.substring(0, i) + str.substring(i + 1, str.length());  
	    }  
	    
	   

}
