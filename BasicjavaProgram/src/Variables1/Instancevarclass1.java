package Variables1;

public class Instancevarclass1 {
	
	int  X = 123;   //instance variables
	String s = "Soumya";//instance variables
	boolean k = false; //instance variables
		
	void pavan()
	{
		System.out.println("Hi I am Pavan");
	}

	public static void main(String[] args) {
		Instancevarclass1 I = new Instancevarclass1();
		I.pavan();   //calling method
		System.out.println(I.X);  //print variable
		System.out.println(I.s);
		System.out.println(I.k);
	}
		
	void rani()
	{
		System.out.println("Hi I am Rani");
	}

}
