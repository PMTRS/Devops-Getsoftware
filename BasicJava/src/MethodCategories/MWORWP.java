package MethodCategories;

public class MWORWP {
	
	
	
	int add(int b) //89
	{
		int a = 40;
		int y = a+b; //40+89
		return y;
		
	}
	
	String Fight(String s)
	{
		return s;
	}
	
	void triangle(int a, int b, int c)
	
	{
		int x = a+b+c;
		System.out.println("The Perimeter of the triable is : " +(a+b+c));
	}

	public static void main(String[] args) {
		
		
		MWORWP m = new MWORWP();
	   
		System.out.println(m.add(100));
	  System.out.println("The return value for s is : " +m.Fight("Hari")); 
	  
	  m.triangle(12, 21, 10);

	}

}
