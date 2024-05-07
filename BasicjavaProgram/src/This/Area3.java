package This;

public class Area3 {
	
	Area3()
	{
		this(8);  //calling one parameter constructor
	 
		System.out.println("Hai All I am from Default Constructor");
		
	}
	
	Area3(int a)
	{
		this(8, 10); //calling two parameter constructor
		System.out.println("Area of Square is : " +(a*a));
	}
	
	Area3(int a, int b)
	{
		this(8, 10, 21); //calling three parameter constructor
		System.out.println("Area of Rectangle is  : " +(a*b));
		
	}
	
	Area3(int a, int b, int c)
	{
		System.out.println("Perimeter of Triangle  is  : " +(a+b+c));
	}
	
	
	

	public static void main(String[] args) {
	
		new Area3();

	}

}
