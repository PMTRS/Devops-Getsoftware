package Constructors1;

public class PMconstructor {
	int floor;
	String buildingname;
	int population;
	
	PMconstructor()
	{
		floor = 3;
		buildingname = "Meghana";
		population = 300;
	}
	
	PMconstructor(int f)  //6
	{
		floor =f; //6
		buildingname = "Sridhar";
		population = 350;
	}
	
	PMconstructor(String name)  //Srividya
	{
		floor =7; 
		buildingname = name; //Srividya
		population = 399;
	}
	
	PMconstructor(int a, int b, int c, int d, int e, int f, int j) 
	{
		floor =111; 
		buildingname = "MYHOME"; 
		population = 4000;
	}
	
	void buildingdetails()
	{
		System.out.println("Number of Floors = " +floor);
		System.out.println("Building name  = " +buildingname);
		System.out.println("Number of People living = " +population);
	}
	
	public static void main(String[] args) {
	
		//PMconstructor B1 = new PMconstructor();
		//B1.buildingdetails();
		
		PMconstructor B2 = new PMconstructor(6);
		B2.buildingdetails();
		
		PMconstructor B3 = new PMconstructor("Srividya");
		B3.buildingdetails();
		
		PMconstructor B4 = new PMconstructor(1, 2, 3, 4, 5, 6, 21325364);
		B4.buildingdetails();
		
	
	}

}
