package Ifcondition;

public class Ifclass3 {
	public static void main(String[] args) {
		int marks = 50;
		// 35< fail     35 to 50 third  50 to 60 second   60 to 90 first   90 distinction
		if (marks<35)
		{
			System.out.println("Student is FAILED");
		}
		if (marks>=35 && marks<50)
		{
			System.out.println("Student got THIRD class");
		}
		if (marks>=50 && marks<60)
		{
			System.out.println("Student got SECOND class");
		}
		if (marks>=60 && marks<90)
		{
			System.out.println("Student got FIRST class");
		}
		if (marks>=90)
		{
			System.out.println("Student got DISTINCTION class");
		}

	}

}
