//Alexander Stoyanov
//Rental Vehicle Agency Program
//Completed 10/27/2016
//COSC 237-181
public abstract class Vehicle
{
	private String name;
	private int mpg;
	private int num;
	private String vin;
	private Reservation resv;
	
	public Vehicle(String name, int mpg, int num, String vin)
	{
		this.name = name;
		this.mpg = mpg;
		this.num = num;
		this.vin = vin;
		resv = null;
	}
	
	public abstract String getDescription();
	public boolean isReserved()
	{
		if (resv != null)
			return true;
		else
			return false;
	}
	
	public void reserve(String vin, String companyName, String creditCardNum, String rentalPeriodType, String rentalTime, boolean insurance) throws ReservedVehicleException
	{
		if (resv != null)
		{
			throw new ReservedVehicleException("Vehicle is already reserved!");
		} else
		{
			try
			{
				resv = new Reservation(companyName, creditCardNum, rentalPeriodType, rentalTime, insurance);
			} catch (InvalidCreditCardException e)
			{
				System.out.println("Not valid credit card number!");
			}
		}
	}
	
	public void cancelReservation() throws UnreservedVehicleException
	{
		if(resv != null)
			resv = null;
		else
			throw new UnreservedVehicleException("This vehicle is not reserved.");
	}
	
	public String getName()
	{ return name; }
	public int getMPG()
	{ return mpg; }
	public int getNum()
	{ return num; }
	public String getVIN()
	{ return vin; }
	
	public Reservation getReservation() throws UnreservedVehicleException
	{ 
		if(resv != null)
			return resv;
		else
			throw new UnreservedVehicleException("This vehicle is not reserved.");
	}
}
