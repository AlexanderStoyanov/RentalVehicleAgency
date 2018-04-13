//Alexander Stoyanov
//Rental Vehicle Agency Program
//Completed 10/27/2016
//COSC 237-181

import java.util.*;

public class Vehicles 
{
	private Vehicle[] vehicleList;
	private Vehicle ptr = null;
	protected int currentIndex = 1;
	
	public Vehicles()
	{
		vehicleList = new Vehicle[1];
	}
	
	public void addVehicle(Vehicle v)
	{
		vehicleList = Arrays.copyOf(vehicleList, vehicleList.length+1);//starts at [1]
		vehicleList[vehicleList.length-1] = v;
		//System.out.println("Vehicle at " + vehicleList.length + " is " + vehicleList[vehicleList.length-1]);
		//System.out.println("Size is " + vehicleList.length);
	}
	
	public Vehicle getVehicle(String vin) throws VINNotFoundException
	{
		boolean vehicleFound = false;
		for (int i = 1; i < vehicleList.length; i++)
		{
			if (vehicleList[i].getVIN().equals(vin))
			{
				vehicleFound = true;
				return vehicleList[i];
			}
		}
		if (!vehicleFound)
		{
			throw new VINNotFoundException("Not valid VIN.");
		}
		return null;
	}
	
	public void getReservations(String companyName) throws CompanyNotFoundException
	{
		for (int i = 1; i < vehicleList.length; i++)
		{
			try
			{
				if (vehicleList[i].getReservation().getCompanyName().equals(companyName))
				{
					System.out.println(vehicleList[i].getDescription());
				} else
					throw new CompanyNotFoundException();
			} catch(UnreservedVehicleException e)
			{
				//System.out.println("Vehicle is not reserved!");
			}
		}
	}
	
	public void reset()
	{
		currentIndex = 1;
		ptr = vehicleList[currentIndex];
	}
	
	public boolean hasNextVehicle()
	{
		return (currentIndex < vehicleList.length) && (vehicleList[currentIndex] != null);
	}
	
	public Vehicle nextVehicle()
	{
		ptr = vehicleList[currentIndex++];
		return ptr;
	}
	
}
