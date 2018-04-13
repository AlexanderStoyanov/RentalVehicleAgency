//Alexander Stoyanov
//Rental Vehicle Agency Program
//Completed 10/27/2016
//COSC 237-181
public class Truck extends Vehicle
{
	public Truck(String description, int mpg, int num, String vin) 
	{
		super(description, mpg, num, vin);
	}
	
	public String getDescription()
	{
		return "Description:" + super.getName() + " MPG:" + super.getMPG() + " Num Rooms Capacity:" + super.getNum() + " VIN:" + super.getVIN();
	}
}
