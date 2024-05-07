package This;

public class Area {
	
	Area(int a, int b)
	{
		this();
	
		System.out.println("Area of Rectangle is : " +(a*b));
		this.areas();
	}
	
	Area()
	{
		System.out.println("Hai I am Default Constructor called from THIS");
	}
	
	void areas()
	{
		System.out.println("Hurray I calculated RECTANGLE AREA");
	}

	public static void main(String[] args) {
	
		new Area(10,20);

	}

}
