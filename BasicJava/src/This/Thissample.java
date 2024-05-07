package This;

public class Thissample {
	int x = 45;
	
	void m1()
	{
		int y = 55;
		System.out.println("X value is : " +x);
		System.out.println("Y value is : " +y);
	}

	public static void main(String[] args) {
		Thissample t = new Thissample();
		
		t.m1();
	}

}
