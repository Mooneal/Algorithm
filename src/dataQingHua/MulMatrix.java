package dataQingHua;

import java.util.Arrays;
import java.util.Scanner;
 
public class MulMatrix {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
       
        while(scan.hasNext()){
            int n = scan.nextInt();        //Scanner默认的分割符号是 空格  enter键入也算是一个空格。 这是输入的值。
            int m = scan.nextInt();
            int[][] help = new int[n][m];
            for(int i=0;i<n;i++)
                Arrays.fill(help[i], 1);   //利用Arrays中的方法初始化数组。
            //计算
            for(int i =0;i<n;i++){                    //下面的暴力方法，会出现多个元素被重复相乘，为了提高效率，我们采用下面的方法，使得，在键入元素的时候，就把他乘到相应的位置，这样当输入所有
            										//元素时，一张完整的乘好的矩阵表也出来了。最好把整个表的元素做个比较就好了。
                for(int j=0;j<m;j++){
                    int value = scan.nextInt();
                    int temp=0;
                   for(temp=0;temp<j;temp++){
                	   help[i][temp]*=value;
                   }
                   for( temp=j+1;temp<m;temp++){
                	   help[i][temp]*=value;
                   }
                   for(temp=0;temp<i;temp++){
                	   help[temp][j]*=value;
                   }
                   for(temp=i+1;temp<n;temp++){
                	   help[temp][j]*=value;
                   }            
                }
            }
            //获得最大值
            int max = Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(help[i][j]>max)
                        max = help[i][j];
                }
            }
            System.out.println(max);
        }
        scan.close();
    }
}
/*
import java.util.Scanner;

public class MulMatrix {

	/**
	 题目
	矩阵元素相乘
	
	A[n,m]是一个n行m列的矩阵，a[i,j]表示A的第i行j列的元素，定义x[i,j]为A的第i行和第j列除了a[i,j]之外所有元素(共n+m-2个)的乘积，即x[i,j]=a[i,1]*a[i,2]*...*a[i,j-1]*...*a[i,m]*a[1,j]*a[2,j]...*a[i-1,j]*a[i+1,j]...*a[n,j],现输入非负整形的矩阵A[n,m]，求MAX(x[i,j])，即所有的x[i,j]中的最大值。
	
	输入描述:
	第一行两个整数n和m。之后n行输入矩阵，均为非负整数。
	
	输出描述:
	一行输出答案。
	
	输入例子:
	3 5
	5 1 8 5 2
	1 3 10 3 3
	7 8 5 5 16
	
	输出例子:
	358400
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			String[] line=in.nextLine().split(" ");
			int n=Integer.valueOf(line[0]);
			int m=Integer.valueOf(line[1]);
			int[][] arr=new int[n][m];
			for(int i=0;i<n;i++){
				
			}
		}
		int max=1;
		int[][] arr={{5,1,8,5,2},{1,3,10,3,3},{7,8,5,5,16}};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				int subSum=sum(arr,i,j);
				max = subSum >max?subSum:max;
			}
		}
		
		System.out.println(max);

	}
	
	public static int sum(int[][] arr, int i,int j){
		int sum=1;
		for(int x=0;x<arr.length;x++){
			if(i==x)
				continue;
			sum*=arr[x][j];
		}
		
		for(int y=0;y<arr[i].length;y++){
			if(j==y)
				continue;
			sum*=arr[i][y];
		}
		return sum;
	}

}*/
