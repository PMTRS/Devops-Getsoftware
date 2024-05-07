package Constructors1;

public class Defaultconstructor {
	int floor;
	String buildingname;
	int population;
	
	Defaultconstructor()
	{
		floor = 3;
		buildingname = "Meghana";
		population = 300;
	}
	
	
	
	void buildingdetails()
	{
		System.out.println("Number of Floors = " +floor);
		System.out.println("Building name  = " +buildingname);
		System.out.println("Number of People living = " +population);
	}
	
	public static void main(String[] args) {
	
		Defaultconstructor B = new Defaultconstructor();
		B.buildingdetails();
		
		Defaultconstructor B1 = new Defaultconstructor();
		B1.buildingdetails();
	
	}

}
