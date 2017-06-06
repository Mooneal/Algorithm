package dynamicProgramming;

import java.util.Random;

public class Lcs {
	public static void main(String[] args){
		//设置字符串长度
		int substringLength1 = 20;
		int substringLength2 = 20; //具体大小可自行设置
		// 随机生成字符串
		String x = getRandomString(substringLength1);
		String y = getRandomString(substringLength2);
		Long startTime = System.nanoTime();
		// 构造二维数组记录子问题x[i]和y[i]的LCS的长度
		int[][] opt = new int[substringLength1 + 1][substringLength2 + 1];
		// 动态规划计算所有子问题
		for (int i = substringLength1 - 1; i >= 0; i--){
		for (int j = substringLength2 - 1; j >= 0; j--){
		if (x.charAt(i) == y.charAt(j))
		opt[i][j] = opt[i + 1][j + 1] + 1; //参考上文我给的公式。
		else
		opt[i][j] = Math.max(opt[i + 1][j], opt[i][j + 1]); //参考上文我给的公式。
		}
		}
	}
	
	//随机生成字符串
	public static String getRandomString(int length) { //length表示生成字符串的长度
	    String base = "abcdefghijklmnopqrstuvwxyz0123456789";   
	    Random random = new Random();   
	    StringBuffer sb = new StringBuffer();   
	    for (int i = 0; i < length; i++) {   
	        int number = random.nextInt(base.length());   
	        sb.append(base.charAt(number));   
	    }   
	    return sb.toString();   
	}
}

