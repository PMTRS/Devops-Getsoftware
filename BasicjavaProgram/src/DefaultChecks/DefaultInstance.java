package DefaultChecks;

public class DefaultInstance {
	
	float d;
	boolean b1;
	char d1;
	int g;
	
	void def()
	{
		System.out.println("The Value of D is " +d);
		System.out.println("The Value of B1 is " +b1);
		System.out.println("The Value of D1 is " +d1);
		System.out.println("The Value of G is " +g);
	}
	

	public static void main(String[] args) {
		
		DefaultInstance D = new DefaultInstance();
		
		D.def();
		

	}

}
