package test;

public class ClearSpaceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="   ac bb  ";
		System.out.println(s);
		ClearSpace c=new ClearSpace();
		String s1=c.clear(s);
		System.out.println(s1);
	}

}
