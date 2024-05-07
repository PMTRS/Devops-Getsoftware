package Constructors1;

public class Building {
	int floor;
	String buildingname;
	int population;
	
	Building()
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
	
		Building B = new Building();
		B.buildingdetails();
		
		Building B1 = new Building();
		B1.buildingdetails();
	
	}

}
