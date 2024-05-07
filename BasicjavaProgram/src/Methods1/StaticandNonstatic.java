package Methods1;

public class StaticandNonstatic {
	
	int x = 20;
	
	void m1()
	{
		System.out.println("The Value of X is : " +x);
	}
	
	static void m2()
	{
		System.out.println("Hi I am from M2 Method");
	}
	
	

	public static void main(String[] args) {
		StaticandNonstatic S = new StaticandNonstatic();
		S.m1();
		System.out.println(S.x);
		m2();

	}

}
