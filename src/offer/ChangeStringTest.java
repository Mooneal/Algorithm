package offer;

public class ChangeStringTest {

	static String s="we are happy.";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChangeString c=new ChangeString();
	//	s=c.changeStr(s);//这是重新给s变量赋值。
	//	System.out.println(s);  //所以输出的是返回值。
		ChangeStringTest cs=new ChangeStringTest();
		cs.str(s);         //这里调用，实际上在str方法中，又创建了一个s引用的副本用来存储“sbcd”，当str方法运行完，这个副本就消失了
		System.out.println(s);        //所以没有改变原来s指向的字符串。
		
		
	}
	public void str(String s){
		s="sbcd";
		this.s="sbcd";            //这里明确指明了，把“sbcd”复制给类成员s。而不是赋值给它的副本引用。
	}

}
