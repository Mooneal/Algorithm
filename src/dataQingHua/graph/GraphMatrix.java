package dataQingHua.graph;


import java.util.LinkedList;
import java.util.Queue;


public class GraphMatrix{
	int n=10;
	private GraphVectex[] V=new GraphVectex[n];           //不支持泛型数组，因为数组是必须明确其类型的
	private GraphEdge[][] E=new GraphEdge[n][n];
	
	public int vertex(int i){
		return V[i].data;
	}
	
	//对于任意顶点i，如何枚举其所有的邻接顶点 neighbor
	public int nextNbr(int i,int j){
		while((-1<j)&& !exists(i,--j));        //循环从一行往前遍历，看是否有相关边存在，没有继续往前遍历。 --j是因为要排除
		return j;
	}

	
	public int firstNbr(int i){         //找到任意顶点i的第一个邻接顶点
		return nextNbr(i,n);
	}
	
	public boolean exists(int i, int j) {
		if(E[i][j]!=null && ( (0<=i) && (i<n)) && ( (0<=j) && (j<n)))
			return true;
		return false;
	}
	
	public void BFS(int v, int clock){
		Queue<GraphVectex> q=new LinkedList<GraphVectex>();
		V[v].status=VStatus.DISCOVERED;
		q.offer(V[v]);
		while(!q.isEmpty()){
			GraphVectex vec=q.poll();
			vec.dTime=++clock;
			for(int u=firstNbr(v);-1<u;u=nextNbr(v,u)){        //考擦v的每一个邻居u
				if(VStatus.UNDISCOVERED==V[u].status){
					V[u].status=VStatus.DISCOVERED;
					
				}
				
			}
			vec.status=VStatus.VISITED;
		}
	}
	
}
