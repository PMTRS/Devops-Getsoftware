package DefaultChecks;

public class DefaultStatic {
	
	static float d;
	static boolean b1;
	static char d1;
	static int g;
	
	void def()
	{
		System.out.println("The Value of D is " +d);
		System.out.println("The Value of B1 is " +b1);
		System.out.println("The Value of D1 is " +d1);
		System.out.println("The Value of G is " +g);
	}
	

	public static void main(String[] args) {
		
		DefaultStatic D = new DefaultStatic();
		
		D.def();
		

	}

}
