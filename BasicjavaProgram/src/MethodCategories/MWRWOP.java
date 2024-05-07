package MethodCategories;

public class MWRWOP {
	
	String Car()  //void is return type which doesn't return anything
	{
		String carname = "FIAT";
		return carname;
		
	}
	
	int add()
	{
		int a = 40;
		int b = 30;
		int y = a+b;
		return a;
	}

	public static void main(String[] args) {
		
		
		MWRWOP m = new MWRWOP();
		System.out.println(m.Car());
		System.out.println(m.add());

	}

}
