package dataQingHua.graph;


public class GraphEdge {
	int data;         //数据
	int weight;           //权重
	EStatus status;         //枚举类型
	
	public GraphEdge(int data,int w) {
		this.data=data;
		this.weight=w;
		this.status=EStatus.UNDETERMINED;
	}
}
