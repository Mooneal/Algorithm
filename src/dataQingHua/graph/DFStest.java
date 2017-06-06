package dataQingHua.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DFStest {

	/**
	 * BFS适合此类题目：给定初始状态跟目标状态，要求从初始状态到目标状态的最短路径。
	 * DFS适合寻找：给定初始状态，以及末状态，两者之间是否有解的情况
	 */
	public static void main(String[] args) {
		
		GraphVectex[] v=new GraphVectex[7];
		for(int i=0;i<7;i++){
			v[i]=new GraphVectex(i);
		}
		int[][] edge={{0,1,1,1,0,0,0},{1,0,1,1,1,0,0},
						{1,1,0,0,0,0,1},{1,1,0,0,0,1,0},
						{0,1,0,0,0,0,0},{0,0,0,1,0,0,1},
						{0,0,1,0,0,1,0}};
		
		BFSshort(v, edge, 1,5);
		
		
		

	}
	public static void BFStraverse(GraphVectex[] v,int[][] edge,int i){
		Queue<Integer> q=new LinkedList<Integer>();
		v[i].status=VStatus.DISCOVERED;
		q.offer(i);
		while(!q.isEmpty()){
			int vec=q.poll();
			for(int j=6;j>-1;j--){
				if(edge[vec][j]==1 && v[j].status==VStatus.UNDISCOVERED){
					v[j].status=VStatus.DISCOVERED;
					v[j].parent=v[vec];
					q.offer(j);
				}
			}
			
		//	v[vec].status=VStatus.VISITED;
			System.out.print(vec+" ");
		}
		System.out.println("");
	}
	public static void BFSshort(GraphVectex[] v,int[][] edge,int i,int j){
		BFStraverse(v,edge,i);
		int key=j;
		Stack<Integer> stack=new Stack<Integer>();
		while(v[key].parent!=null){
			stack.push(key);
			key=v[key].parent.data;
		}
		stack.push(i);
		while(!stack.isEmpty()){
			System.out.print(stack.pop()+" ");
		}
	}
	
}
