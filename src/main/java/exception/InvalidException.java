package exception;

@SuppressWarnings("serial")
public class InvalidException extends Exception
{
	public InvalidException(String message)
	{
		super(message);
	}
	
	public InvalidException(String message, Throwable cause)
	{
		super(message,cause);
	}
}