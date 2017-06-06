package dataQingHua.tree.binTree;

public class BinTreeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinTree tree=new BinTree(1, new BinNode(1,null));
		BinNode a=tree.insertAsLC(2, tree.root());
		BinNode b=tree.insertAsLC(3, a);
		BinNode c=tree.insertAsRC(4, a);
		BinNode d=tree.insertAsRC(5, b);
		BinNode e=tree.insertAsLC(6, b);
		BinNode f=tree.insertAsRC(7, tree.root());
		
	//	tree.traverseRevcursion(tree.root());
	//	tree.traverseItetator2(tree.root());
		tree.rankTraverse(tree.root());
		
		//	tree.traverseOldOrderItetator2(tree.root());
		
	}

}
