//Alexander Stoyanov
//Rental Vehicle Agency Program
//Completed 10/27/2016
//COSC 237-181
public class InvalidCreditCardException extends Exception
{
	public InvalidCreditCardException()
	{
		super();
	}
	
	public InvalidCreditCardException(String message)
	{
		super(message);
	}
}