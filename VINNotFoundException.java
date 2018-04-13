//Alexander Stoyanov
//Rental Vehicle Agency Program
//Completed 10/27/2016
//COSC 237-181
import java.lang.Exception;

public class VINNotFoundException extends Exception
{
	public VINNotFoundException()
	{
		super();
	}
	
	public VINNotFoundException(String message)
	{
		super(message);
	}
}
