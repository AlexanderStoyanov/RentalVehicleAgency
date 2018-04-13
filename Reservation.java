//Alexander Stoyanov
//Rental Vehicle Agency Program
//Completed 10/27/2016
//COSC 237-181
public class Reservation
{
	private String companyName;
	private String creditCardNum;
	private String rentalPeriodType;
	private String rentalTime;
	private boolean insurance;
	
	public Reservation(String companyName, String creditCardNum, String rentalPeriodType, String rentalTime, boolean insurance) throws InvalidCreditCardException
	{
		this.companyName = companyName;
		this.creditCardNum = creditCardNum;
		this.rentalPeriodType = rentalPeriodType;
		this.rentalTime = rentalTime;
		this.insurance = insurance;
		try
		{
			long temp = Long.valueOf(creditCardNum);
			int length = String.valueOf(temp).length();
			if (length != 16)
			{
				throw new InvalidCreditCardException("Credit card number should contain exactly 16 digits!");
			}
		} catch (NumberFormatException e)
		{
			throw new InvalidCreditCardException("Credit card number should contain digits only!");
		}
	}
	
	public String getCompanyName()
	{ return companyName; }
	public String getCreditCardNum()
	{ return creditCardNum; }
	public String getRentalPeriodType()
	{ return rentalPeriodType; }
	public String getRentalTime()
	{ return rentalTime; }
	
	public String toString()
	{ return "Company name:" + companyName + ", Credit Card Numer:" + creditCardNum + 
			", Type of rent:" + (rentalPeriodType.equals("1") ? "daily, Time:" + rentalTime + " days" : "") 
			+ (rentalPeriodType.equals("2") ? "weekly, Time:" + rentalTime + " weeks" : "")
			+ (rentalPeriodType.equals("3") ? "monthly, Time:" + rentalTime + " months" : "")
			+ (insurance == false ? ", without" : ", with") + " insurance."; }
	
}
