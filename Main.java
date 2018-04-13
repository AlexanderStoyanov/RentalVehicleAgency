//Alexander Stoyanov
//Rental Vehicle Agency Program
//Completed 10/27/2016
//COSC 237-181
import java.util.*;

public class Main 
{
	private final static double dailyRateCar = 24.95;
	private final static double weeklyRateCar = 149.95;
	private final static double monthlyRateCar = 514.95;
	
	private final static double dailyRateSUV = 29.95;
	private final static double weeklyRateSUV = 189.95;
	private final static double monthlyRateSUV = 679.95;
	
	private final static double dailyRateTruck = 34.95;
	private final static double weeklyRateTruck = 224.95;
	private final static double monthlyRateTruck = 797.95;
	
	private final static double perMileCharge = .15;
	private final static double insuranceRate = 14.95;
	
	static Vehicle car1 = new Car("Chevrolet Camaro", 30, 2, "WG8JM5392DY");
	static Vehicle car2 = new Car("Chevrolet Camaro", 30, 2, "KH4GM4564GD");
	static Vehicle car3 = new Car("Ford Fusion", 34, 4, "AB4FG5689GM");
	static Vehicle car4 = new Car("Ford Fusion Hybrid", 35, 4, "GH2KL4278TK");
	static Vehicle car5 = new Car("Ford Fusion Hybrid", 32, 4, "KU4EG3245RW");
	static Vehicle car6 = new Car("Chevrolet Impala", 36, 4, "QD4BK7394Jl");
	static Vehicle car7 = new Car("Chevrolet Impala", 30, 4, "RK3BM4256YH");
	
	static Vehicle SUV1 = new SUV("Chrysler Town&Country", 25, 3, "DK3KG8312UF");
	static Vehicle SUV2 = new SUV("Chrysler Town&Country", 25, 3, "VM9RE2645TD");
	static Vehicle SUV3 = new SUV("Chrysler Town&Country", 25, 3, "WK8BF4287DX");
	static Vehicle SUV4 = new SUV("Dodge Caravan ", 25, 2, "QK3FL4278ME");
	static Vehicle SUV5 = new SUV("Dodge Caravan ", 25, 2, "KY8EW2053XT");
	static Vehicle SUV6 = new SUV("Ford Expedition ", 20, 2, "JK2RT8364HY");
	static Vehicle SUV7 = new SUV("Ford Expedition ", 20, 2, "KH4ME4216XW");
	
	static Vehicle truck1 = new Truck("Ten-Foot", 30, 2, "EJ5KU2435BC");
	static Vehicle truck2 = new Truck("Ten-Foot", 30, 2, "KF8JP7293EK");
	static Vehicle truck3 = new Truck("Seventeen-Foot", 30, 2, "KG4DM5472RK");
	static Vehicle truck4 = new Truck("Seventeen-Foot", 30, 2, "PR8JH4891WQ");
	static Vehicle truck5 = new Truck("Twenty-Four-Foot", 30, 2, "EP2WR3182QB");
	static Vehicle truck6 = new Truck("Twenty-Four-Foot", 30, 2, "TY3GH4290EK");
	static Vehicle truck7 = new Truck("Twenty-Four-Foot", 30, 2, "KU9FL4235RH");
	
	public static void main(String[] args) //System.out.println();
	{
		Scanner in = new Scanner(System.in);
		int choice = 0;
		int typeRent = 0;
		int period = 0;
		boolean insurance = false;
		String vin = "";
		String enter = "";
		String compName = "";
		boolean done = false;
		System.out.println("*****************************************************\n  "
				+ "* Welcome to the Friendly Vehicle Rental Agancy * \n"
				+ "*****************************************************\n");
		while (!done)
		{
		System.out.println("\n\n<<< MAIN MENU >>>\n"
							+ "1 - Display rental rates\n"
							+ "2 - Display available vehicles\n"
							+ "3 - Display specific rental cost\n"
							+ "4 - Make a reservation\n"
							+ "5 - Cancel a reservation\n"
							+ "6 - Display company reservations\n"
							+ "7 - Quit");
		Vehicles vehiclesArray = new Vehicles();
		vehiclesArray.addVehicle(car1);
		vehiclesArray.addVehicle(car2);
		vehiclesArray.addVehicle(car3);
		vehiclesArray.addVehicle(car4);
		vehiclesArray.addVehicle(car5);
		vehiclesArray.addVehicle(car6);
		vehiclesArray.addVehicle(car7);
		vehiclesArray.addVehicle(SUV1);
		vehiclesArray.addVehicle(SUV2);
		vehiclesArray.addVehicle(SUV3);
		vehiclesArray.addVehicle(SUV4);
		vehiclesArray.addVehicle(SUV5);
		vehiclesArray.addVehicle(SUV6);
		vehiclesArray.addVehicle(SUV7);
		vehiclesArray.addVehicle(truck1);
		vehiclesArray.addVehicle(truck2);
		vehiclesArray.addVehicle(truck3);
		vehiclesArray.addVehicle(truck4);
		vehiclesArray.addVehicle(truck5);
		vehiclesArray.addVehicle(truck6);
		vehiclesArray.addVehicle(truck7);
		//System.out.println("size is ");
		System.out.print("Enter: ");
		choice = in.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("		Daily		Weekly		Monthly\n"
							 + "Cars		$24.95		$149.95		$514.95\n"
							 + "SUV		$29.95		$189.95		$679.95\n"
							 + "Truck		$34.95		$224.95		$797.95");
			break;
		case 2:
			System.out.print("Car(1), SUV(2), or Truck(3): ");
			int choice2 = in.nextInt();
			switch(choice2)
			{
			case 1:
				System.out.println("--------------------------- Available Cars ------------------------");
				while (vehiclesArray.hasNextVehicle())
				{
					if (vehiclesArray.nextVehicle() instanceof Car)
					{
						vehiclesArray.currentIndex--;
						if (!vehiclesArray.nextVehicle().isReserved())
						{
							vehiclesArray.currentIndex--;
							System.out.println(vehiclesArray.nextVehicle().getDescription());
						}
					}
				}
				break;
			case 2:
				System.out.println("--------------------------- Available SUVs ------------------------");
				while (vehiclesArray.hasNextVehicle())
				{
					if (vehiclesArray.nextVehicle() instanceof SUV)
					{
						vehiclesArray.currentIndex--;
						if (!vehiclesArray.nextVehicle().isReserved())
						{
							vehiclesArray.currentIndex--;
							System.out.println(vehiclesArray.nextVehicle().getDescription());
						}
					}
				}
				break;
			case 3:
				System.out.println("--------------------------- Available Trucks ------------------------");
				while (vehiclesArray.hasNextVehicle())
				{
					if (vehiclesArray.nextVehicle() instanceof Truck)
					{
						vehiclesArray.currentIndex--;
						if (!vehiclesArray.nextVehicle().isReserved())
						{
							vehiclesArray.currentIndex--;
							System.out.println(vehiclesArray.nextVehicle().getDescription());
						}
					}
				}
				break;
			}
			break;
		case 3:
			System.out.print("Pelase enter VIN: ");
			vin = in.next();
			try
			{
				Vehicle toRent = vehiclesArray.getVehicle(vin);
				System.out.println(toRent.getName());
				double estCost = 0;
				System.out.print("Do you wish to rent by day (1), week (2) or month (3): ");
				typeRent = in.nextInt();
				if (typeRent == 1)
				{
					System.out.print("How many days do you plan to rent?: ");
					period = in.nextInt();
					if (toRent instanceof Car)
					{
						estCost += period*dailyRateCar;
					}
					else if (toRent instanceof SUV)
					{
						estCost += period*dailyRateSUV;
					}
					else if (toRent instanceof Truck)
					{
						estCost += period*dailyRateTruck;
					}
				} else if (typeRent == 2)
				{
					System.out.print("How many weeks do you plan to rent?: ");
					period = in.nextInt();
					if (toRent instanceof Car)
					{
						estCost += period*weeklyRateCar;
					}
					else if (toRent instanceof SUV)
					{
						estCost += period*weeklyRateSUV;
					}
					else if (toRent instanceof Truck)
					{
						estCost += period*weeklyRateTruck;
					}
				} else if (typeRent == 3)
				{
					System.out.print("How many months do you plan to rent?: ");
					period = in.nextInt();
					if (toRent instanceof Car)
					{
						estCost += period*monthlyRateCar;
					}
					else if (toRent instanceof SUV)
					{
						estCost += period*monthlyRateSUV;
					}
					else if (toRent instanceof Truck)
					{
						estCost += period*monthlyRateTruck;
					}
				}
				System.out.print("What is the estimated number of miles you plan to drive?: ");
				int miles = in.nextInt();
				System.out.print("Do you wish the optional insurance ($14.95/day)?: ");
				enter = in.next();
				insurance = false;
				estCost += miles*perMileCharge;
				if(enter.toLowerCase().equals("yes"))
					insurance = true;
				if (insurance)
					estCost += insuranceRate;
				System.out.print("The rental cost of this vehicle for " + period + (typeRent == 1 ? " days" : "")
						+ (typeRent == 2 ? " weeks" : "") + (typeRent == 3 ? " months" : "")
						+ " with an estimated miles of " + miles + " and "
						+ (insurance == false ? "no insurance: $" : "insurance: $"));
				System.out.printf("%.2f", estCost);
				System.out.println();
				break;
			}
			catch (VINNotFoundException e)
			{
				System.out.println("No vehicle with VIN: " + vin + " found.");
				break;
			}
		case 4:
			System.out.print("Pelase enter VIN: ");
			vin = in.next();
			try
			{
				System.out.println(vehiclesArray.getVehicle(vin).getDescription() + "\n");
				Vehicle toReserve = vehiclesArray.getVehicle(vin);
				System.out.print("Enter a company name: ");
				compName = in.next();
				System.out.print("Enter a credit card number (no spaces): ");
				String creditCardNum = in.next();
				System.out.print("\nDaily (1), Weekly (2) or Monthly (3)?: ");
				typeRent = in.nextInt();
				String rent = String.valueOf(typeRent);
				System.out.print("How many days/weeks/months?: ");
				period = in.nextInt();
				String periodCopy = String.valueOf(period);
				System.out.print("Do you wish to add the optional insurance at $14.99/day (y/n): ");
				enter = in.next();
				if (enter.toLowerCase().equals("y"))
					insurance = true;
				try
				{
					toReserve.reserve(vin, compName, creditCardNum, rent, periodCopy, insurance);
					System.out.println("* Reservation Made *");
				}
				catch (ReservedVehicleException e)
				{
					System.out.println("Vehicle is already reserved.");
				}
				break;
			}
			catch (VINNotFoundException e)
			{
				System.out.println("No vehicle with VIN: " + vin + " found.");
				break;
			}
		case 5:
			System.out.print("Pelase enter VIN: ");
			vin = in.next();
			System.out.println("RESERVATION INFORMATION");
			try
			{
				System.out.println(vehiclesArray.getVehicle(vin).getReservation());
				System.out.print("Confirm cancelation (y/n)?: ");
				enter = in.next();
				if (enter.toLowerCase().equals("y"))
				{
					vehiclesArray.getVehicle(vin).cancelReservation();
					System.out.println(" *Reservation canceled *");
				}
			}
			catch (VINNotFoundException e)
			{
				System.out.println("Vin was not found.");
			}
			catch (UnreservedVehicleException e)
			{
				System.out.println("Vehicle is unreserved.");
			}
			break;
		case 6:
			System.out.print("Pelase enter a company name: ");
			compName = in.next();
			try
			{
				System.out.println("The following vehicles are currently reserved for the " + compName + " company:\n");
				vehiclesArray.getReservations(compName);
			}
			catch (CompanyNotFoundException e)
			{
				System.out.println("Company was not found.");
			}
			break;
		case 7:
			System.out.println("Thank you for using the Friendly Rental Agency");
			in.close();
			done = true;
			break;
		}
		}
	}
}
