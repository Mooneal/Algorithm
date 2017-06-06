package dataQingHua.tree.binTree;

public class BinNode {
	/*
	 * 一个二叉树节点 需要 什么呢？
	 * 1.数据域 data
	 * 2.父节点域 parent
	 * 3.左节点域 lChild
	 * 4.右节点域 rChild
	 * 
	 * 5.节点的高度 height ，用于二叉搜索树       
	 * 7.节点的颜色 color  ，用于红黑树
	 * */
	
	public BinNode(int data,BinNode parent){
		this.data=data;
		this.parent=parent;
	}
	BinNode parent,lChild,rChild;
	int data;
	int height;
}
