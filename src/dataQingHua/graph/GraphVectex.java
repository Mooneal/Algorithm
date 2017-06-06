package dataQingHua.graph;

public class GraphVectex {
	private static final int INT_MAX = 10;           //表示最多有多少个顶点
	int data;   //顶点的数据
	int inDegree;        //顶点有多少 进 度    因为是有向图，所以有进度和出度之分
	int outDegree;      //顶点有多少 出 度  
	
	VStatus status;       //表示状态
	int dTime,fTime;          //时间标签
	GraphVectex parent;       //在遍历树中的父节点
	int priority; 		//在遍历树中的优先级 （最短通路问题）
	
	public GraphVectex(int data){       //构造新顶点
		this.data=data;
		this.inDegree=0;
		this.outDegree=0;
		this.status=VStatus.UNDISCOVERED;
		this.dTime=-1;
		this.fTime=-1;
		this.parent=null;
		this.priority=INT_MAX;
	}
}
