package BasicJavaprograms;

public class ClassandObject {
	
	void tenthclass()
	{
		System.out.println("Hi Iam a method with name as TENTHCLASS");
	}
		
	void salary()
	{
		System.out.println("Hi My salary is 12000");
	}
	
	
	
	public static void main(String[] args) {
		
		ClassandObject Obj1 = new ClassandObject();
		
		Obj1.tenthclass();
		Obj1.city();
		Obj1.salary();
		
		
		ClassandObject Obj2 = new ClassandObject();
		
		Obj2.city();
		

	}
	
	
	void city()
	{
		System.out.println("Hi my city name is HYDERABAD");
	}

}
