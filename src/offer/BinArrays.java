package offer;

public class BinArrays {
	
	    public boolean Find(int [][] array,int target) {
	        boolean flag=false;
			if(array!=null){
	            int row=0;
	            int col=array[0].length-1;
	            while(row<=array.length-1 && col>=0){
	                if(array[row][col]==target){
	                    flag=true;
	                	break;
	                }
	                else if(array[row][col]>target)
	                    col--;
	                else
	                    row++;
	            }
	           
	        }
	       return flag;
	    }
}
