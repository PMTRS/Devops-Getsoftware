package Ifcondition;

public class NestedIf {

	public static void main(String[] args) {
		
		int a = 30;
		int b = 13;
		int c = 40;
		
		if(a>c)
		{
			System.out.println("A is LESS THAN C");
			if(b>a)
			{
				System.out.println("A is LESS THAN B");
				if(c>b)
				{
					System.out.println("C is GREATER THAN B");
				}
				
			}
		}

	}

}
