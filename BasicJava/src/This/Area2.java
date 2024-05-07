package This;

public class Area2 {
	
	Area2()
	{
		this(8);  //calling one parameter constructor
	 
		System.out.println("Hai All I am from Default Constructor");
		this.areas();
	}
	
	Area2(int a)
	{
		this(8, 10); //calling two parameter constructor
		System.out.println("Area of Square is : " +(a*a));
	}
	
	Area2(int a, int b)
	{
		this(8, 10, 21); //calling three parameter constructor
		System.out.println("Area of Rectangle is  : " +(a*b));
	}
	
	Area2(int a, int b, int c)
	{
		System.out.println("Perimeter of Triangle  is  : " +(a+b+c));
	}
	
	
	void areas()
	{
		System.out.println("Hurray I calculated FORMULAS");
	}

	public static void main(String[] args) {
	
		new Area2();

	}

}
