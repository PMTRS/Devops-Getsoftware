package Ifcondition;

public class NestedIfelse {

	public static void main(String[] args) {
		
		int marks = 10;
		
		if(marks>90)
		{
			System.out.println("Student got Distinction");
		}
		
		else if (marks<=90 && marks>60)
		       {
					System.out.println("Student got FIRST class");
		       }
		    else if (marks<=60 && marks>50)
		    		{
		    			System.out.println("Student for Second Class");
		    		}
		    	else if (marks<=50 && marks>35) 
		    			{
		    				System.out.println("Student got Third Class");
		    			}
		    		else
		    		{
		    			System.out.println("Student Got Failed");
		    		}

	}

}
