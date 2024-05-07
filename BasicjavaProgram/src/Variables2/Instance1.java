package Variables2;

public class Instance1 {
	
	String c;
	int x;
	
	void m1()
	{
		System.out.println("The Value of C is : " +c);
		System.out.println("The value of X is : " +x);
		
	}

	public static void main(String[] args) {
	
		Instance1 I = new Instance1();
		I.m1();
		I.c = "Car";
		I.x = 567;
		I.m1();

	}

}
