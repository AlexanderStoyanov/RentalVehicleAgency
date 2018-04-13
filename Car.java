//Alexander Stoyanov
//Rental Vehicle Agency Program
//Completed 10/27/2016
//COSC 237-181
public class Car extends Vehicle
{
	/*Vehicle car1 = new Car("Chevrolet Camaro", 30, 2, "W");
	Vehicle car2 = new Car("Chevrolet Camaro", 30, 2, "W");
	Vehicle car3 = new Car("Ford Fusion", 34, 4, "W");
	Vehicle car4 = new Car("Ford Fusion Hybrid", 35, 4, "W");
	Vehicle car5 = new Car("Ford Fusion Hybrid", 32, 4, "W");
	Vehicle car6 = new Car("Chevrolet Impala", 36, 4, "W");
	Vehicle car7 = new Car("Chevrolet Impala", 30, 4, "W");*/
	
	public Car(String description, int mpg, int num, String vin) 
	{
		super(description, mpg, num, vin);
	}
	
	public String getDescription()
	{
		return "Description:" + super.getName() + " MPG:" + super.getMPG() + " Num Seats:" + super.getNum() + " VIN:" + super.getVIN();
	}
}
