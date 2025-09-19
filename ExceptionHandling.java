package module3.basicjava;

public class ExceptionHandling 
{

	public static void main(String[] args) 
	{
		try
		{
			int a=1/0;
			System.out.println(a);
		}
		catch(ArithmeticException p)
		{
			System.out.println("Handled the exception");
		}

	}

}
