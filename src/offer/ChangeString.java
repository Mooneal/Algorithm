package offer;

import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;

import javax.xml.crypto.Data;
/*
 * 需求：把字符串中的空格，用%20来代替。
 * */
public class ChangeString {
	
	/*第一种：这是通过把String类转换成字符数组操作，但是java中自带一个StringBuffer类。
	public void change(String s){
		
		 * 
		 * char[] chs=s.toCharArray();
		int initIndex=chs.length-1;           //原数组最后一位索引
		int count=0;                        //记录空格的个数。
		for(int i=0;i<chs.length;i++){
			if(chs[i]==' ')
				count++;
		}
		int newLength=chs.length+count*2;
		
		chs=Arrays.copyOf(chs, newLength);    //扩展数组。
		int laterIndex=chs.length -1;            //扩展后数组最后一位索引；
		for(int i=initIndex, j=laterIndex;i>=0;i--){
			if(chs[i]!=' '){                         //若果不是空格，那么就直接赋值。
				chs[j]=chs[i];
				j--;
			}else{
				chs[j--]='0';
				chs[j--]='2';
				chs[j--]='%';
			}
		}
		String str=new String(chs);     //将char数组转换成string
		System.out.println(str);	
	}*/
	
	//第二种：用StringBuffer来处理。
	public String changeStr(String s){
		Date date=new Date();
		DateFormat df=DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL);
		String time1=df.format(date);
		long begain=System.nanoTime();
		System.out.println(begain);
		System.out.println(time1);
		StringBuffer sb=new StringBuffer(s);
		int spaceNum=0;
		for(int i=0;i<sb.length();i++){
			if(sb.charAt(i)==' ')
				spaceNum++;
		}
		int initIndex=sb.length()-1;
		int newLength=sb.length()+spaceNum*2;
		sb.setLength(newLength);
		int laterIndex=sb.length()-1;
		for(;initIndex>=0 && laterIndex>=initIndex;initIndex--){
			if(sb.charAt(initIndex)!=' '){
				sb.setCharAt(laterIndex--, sb.charAt(initIndex));
			}else{
				sb.setCharAt(laterIndex--, '0');
				sb.setCharAt(laterIndex--, '2');
				sb.setCharAt(laterIndex--, '%');
			}
		}
		String str=sb.toString();
		Date date1=new Date();
		DateFormat df1=DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL);
		String time2=df.format(date1);
		long last=System.nanoTime();
		System.out.println(last);
		System.out.println(time2);
		System.out.println(last-begain);
		
		
		return str;
	}
}











