package This;

public class Thissample2 {
	int x = 45;
	
	 void m1()
	{
		int x = 55;
		System.out.println("X value as Instance : " +this.x);
		System.out.println("Y value as Local  : " +x);
	}

	public static void main(String[] args) {
		Thissample2 t = new Thissample2();
		
		t.m1();
	}

}
