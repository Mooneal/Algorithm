package dataQingHua;

import java.util.Stack;

public class Catlan {   
	  
    private int count = 0;   
    private int total = 0;   
    private Stack<Integer> place = new Stack<Integer>();   
  
    public Catlan(int total) {   
        this.total = total;   
    }   
  
    private void firstOrder(int order, int level) {   
        place.add(order);   
        if (level >= total / 2) {   
            //计数叶结点并打印路径   
            count++;   
            for (Integer i : place)   
                System.out.print(i + " ");   
            System.out.println();   
            place.pop();   
            return;   
        }   
  
        //展开编号为order的节点的子树，并进入下一层 level+1   
        for (int i = order + 1; i < 2 * (level + 1); i++)   
            firstOrder(i, level + 1);   
        place.pop();   
    }   
  
    public void firstOrder() {   
        firstOrder(1, 1);   
        System.out.println("第一排一共有" + count + "种排列");   
    }   
  
    public static void main(String[] args) {   
    	Catlan q = new Catlan(12);   
        q.firstOrder();   
    }   
}  