package Variables2;

public class Static2 {
	
	String stdname;
	int stdid;
	static String stdcollege;
	
	void stddetails()
	{
		System.out.println("The Student Name is : " +stdname);
		System.out.println("The Student ID  is : " +stdid);
		System.out.println("The Student College is : " +stdcollege);
	}

	public static void main(String[] args) {
		
		stdcollege = "New Generation";
	
		Static2 I1 = new Static2();
		I1.stdname = "Srikar";
		I1.stdid = 444;
		I1.stddetails();
		System.out.println("**************************************");
		
		Static2 I2 = new Static2();
		I2.stdname = "Surya";
		I2.stdid = 777;
		I2.stddetails();
		System.out.println("**************************************");
		
		Static2 I3 = new Static2();
		I3.stdname = "Jithendra";
		I3.stdid = 999;
		I3.stddetails();
		
		System.out.println("----------After changing SURYA COLLEGE NAME-------------------");
		
		I2.stdcollege = "LITTLE FLOWERS";
		
		I1.stddetails();
		I2.stddetails();
		I3.stddetails();
		

	}

}
