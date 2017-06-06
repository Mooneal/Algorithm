package dataQingHua.chapter4.stack;

import java.util.Scanner;
import java.util.Stack;

public class IsStackArrangement {

	/*
		 给一个初始的入栈序列，其次序即为元素的入栈次序，栈顶元素可以随时出栈，每个元素只能入栈依次。输入一个入栈序列，后面依次输入多个序列，请判断这些序列是否为所给入栈序列合法的出栈序列。
		例如序列1，2，3，4，5是某栈的压入顺序，序列4，5，3，2，1是该压栈序列对应的一个出栈序列，但4，3，5，1，2就不可能是该序列的出栈序列。假设压入栈的所有数字均不相等。
		输入
 		第一行输入整数n(1<=n<=10000)，表示序列的长度。
		第二行输入n个整数，表示栈的压入顺序。
		第三行输入整数t（1<=t<=10）。
		后面依次输入t行，每行n个整数，表示要判断的每一个出栈序列。
	输出
 	对应每个测试案例输出一行，如果由初始入栈序列可以得到该出栈序列，则输出yes，否则输出no。

		 * 分析：要证明一个序列是否是 栈混洗 后的序列，那么只要 模拟 栈混洗的过程就好了。
		 * 1>栈混洗只能入栈出栈，因此绝对不能取到栈顶以下的元素。所以判断是否为栈混洗的条件就是
		 * 	1.我们希望从栈中出栈的元素不在栈顶，且初始栈又是空栈。那么此时就可以判断是错误序列了。
		 *  
		 * */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isStack1();
	}
	
	public static void isStack1(){
		
		Stack<Integer> a=new Stack<Integer>();
		
		Stack<Integer> o=new Stack<Integer>();
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();              //原始序列的长度。
		int t=0;
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			t=sc.nextInt();
			arr[i]=t;
		}
		
		
		int m=sc.nextInt();
		
		while (m-->0)
		{
			for(int i=arr.length-1;i>=0;i--){
				a.push(arr[i]);
			}
			int  c; 
					boolean flag = false;       
			for (int i = 0; i<n; i++)
			{
				t=sc.nextInt();          //
				if (flag)
					continue;               
				if (o.empty())        
				{
					/*if (a.empty())            //这里其实不需要
					{
						flag = true;         
						continue;
					}*/
					o.push(a.peek());        
					a.pop();
				}
				while (!o.empty())          
				{
					c = o.peek();      
					if (c == t)             //如果栈顶元素和我们期望的元素一致，那么就出栈，并判断下一个数。
					{
						o.pop();
						break;             
					}
					else             //如果不一致，看看a中是否还有元素，没有的话，判断 不符合，跳出循环。
					{
						if (a.empty())
						{
							flag = true;
							break;
						}
						o.push(a.peek());    //有就继续，往o中压栈，改变o的栈顶。继续循环。
						a.pop();
					}
				}
			}
			
			if(!o.empty()){
				o.pop();
			}
			if(!a.empty()){
				a.pop();
			}
			if (flag)
				System.out.println("no");
			else
				System.out.println("yes");
			
		}
	
	}
	

}
