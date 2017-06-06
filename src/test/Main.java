package test;

	import java.util.*;
	public class Main{
	    public static void main(String[] args){
	     /*   Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();                      //第一行输入打车点个数
	        int[] tX = new int[n];                     //设置一个数组，装打车点横坐标
	        int[] tY = new int[n];                    //设置一个数组，装打车点纵坐标
	        for(int i = 0; i < n; i++){
	            tX[i] = sc.nextInt();
	        }
	        for(int i = 0; i < n; i++){
	            tY[i] = sc.nextInt();
	        }                                
	        int gx = sc.nextInt();                      //公司地址横坐标
	        int gy = sc.nextInt();                      //公司地址纵坐标
	        int walkTime = sc.nextInt();                //走路时间
	        int taxiTime = sc.nextInt();                //打车时间
	        // 走路到公司
	        int walktowork = (Math.abs(gx) + Math.abs(gy)) * walkTime;         //不打车，只走路的时间。
	        // 走路到打车点再打车
	        // min 记录最小时间
	        int min = Math.min(walktowork, (Math.abs(tX[0]) + Math.abs(tY[0])) * walkTime + (Math.abs(tX[0] - gx) + Math.abs(tY[0] - gy)) * taxiTime);
	        for(int i = 1; i < n; i++){
	            int walktotaxi = (Math.abs(tX[i]) + Math.abs(tY[i])) * walkTime;
	            int taxitowork = (Math.abs(tX[i] - gx) + Math.abs(tY[i] - gy)) * taxiTime;
	            int cur = walktotaxi + taxitowork;
	            if (cur < min)
	                min = cur;
	        }
	        sc.close();
	        System.out.println(Math.min(walktowork, min));*/
	    	zk();
	    }
	    
	    public static void  zk(){
	    	Scanner sc=new Scanner(System.in);
	    	int n=sc.nextInt();
	    	int[] tx=new int[n];
	    	int[] ty=new int[n];
	    	for(int i=0;i<n;i++){
	    		tx[i]=sc.nextInt();
	    	}
	    	for(int i=0;i<n;i++){
	    		ty[i]=sc.nextInt();
	    	}
	    	int gx=sc.nextInt();
	    	int gy=sc.nextInt();
	    	
	    	int walkTime=sc.nextInt();
	    	int taxiTime=sc.nextInt();
	    	
	    	//1.第一种情况，只走路去公司
	    	int onlyWalk=(Math.abs(gx)+Math.abs(gy))*walkTime;
	    	//2.先走路再坐车。  算出每一种情况，并获得最小值。 取一个打车点作为参照。这里要把只走路的情况算进去比较。
	    	int min=Math.min(((Math.abs(gx-tx[0])+Math.abs(gy-ty[0]))*taxiTime+(Math.abs(tx[0])+Math.abs(ty[0]))*walkTime),onlyWalk);
	    	
	    	for(int i=1;i<n;i++){
	    		int taxiAndWalk=(Math.abs(gx-tx[i])+Math.abs(gy-ty[i]))*taxiTime+(Math.abs(tx[i])+Math.abs(ty[i]))*walkTime;
	    		if(taxiAndWalk<min){
	    			min=taxiAndWalk;
	    		}
	    	}
	    	System.out.println(min);
	    	
	    }
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	