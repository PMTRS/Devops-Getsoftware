package Variables2;

public class Instance2 {
	
	String stdname;
	int stdid;
	String stdcollege;
	
	void stddetails()
	{
		System.out.println("The Student Name is : " +stdname);
		System.out.println("The Student ID  is : " +stdid);
		System.out.println("The Student College is : " +stdcollege);
	}

	public static void main(String[] args) {
	
		Instance2 I1 = new Instance2();
		I1.stdname = "Srikar";
		I1.stdid = 444;
		I1.stdcollege = "Bhashyam";
		I1.stddetails();
		System.out.println("**************************************");
		
		Instance2 I2 = new Instance2();
		I2.stdname = "Surya";
		I2.stdid = 777;
		I2.stdcollege = "Narayana";
		I2.stddetails();
		System.out.println("**************************************");
		
		Instance2 I3 = new Instance2();
		I3.stdname = "Jithendra";
		I3.stdid = 999;
		I3.stdcollege = "Kuppam";
		I3.stddetails();
		
		System.out.println("----------After changing SURYA COLLEGE NAME-------------------");
		
		I2.stdcollege = "Srichaitanya";
		
		I1.stddetails();
		I2.stddetails();
		I3.stddetails();
		

	}

}
