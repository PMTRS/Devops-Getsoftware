package Variables1;

public class LocalVaraibles1 {
	
	String s = "Hyberabad";
	
	void student1()
	{
		String s1 = "Karimnagar";  //local variable
		System.out.println(s1);
		System.out.println("Hai Iam from STUDENT 1 MEHTOD");
	}
	
	void student2()
	{
		float f = 12.8f;  //local variable
		int i = 20;
		
	}
	
	String d = "Sathish"; //instance variable
	
	void student3()
	{
		
		
		
	}

	public static void main(String[] args) {
		
		LocalVaraibles1 L = new LocalVaraibles1();
		
		L.student1();
		System.out.println(L.d);
	}

}
