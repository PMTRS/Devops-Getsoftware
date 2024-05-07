package Variables1;

public class Staticvariables {
	
	static int  X = 123;   //static variables
	String s = "Soumya";//instance variables
	boolean k = false; //instance variables
		
	void pavan()
	{
		System.out.println("Hi I am Pavan");
		System.out.println("Access Static Varaible in PAVAN METHOD : " +X);
	}

	public static void main(String[] args) {
		Staticvariables I = new Staticvariables();
		I.pavan();   //calling method
		System.out.println(X);  //print static variable
		System.out.println(I.s);
		System.out.println(I.k);
	}
		
	void rani()
	{
		System.out.println("Hi I am Rani");
	}

}
