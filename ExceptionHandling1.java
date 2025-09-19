package module3.basicjava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling1 
{

	public static void main(String[] args) 
	{
		try
		{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int rollno[]=new int[s.nextInt()];
		System.out.println(rollno); //Optional i wrote as i got the warning 
		s.close(); //Optional i wrote as i got the warning 
		}
		catch(NegativeArraySizeException a)
		{
			System.out.println("Handled the exception");
		}
		catch(InputMismatchException a)
		{
			System.out.println("Handled the exception");
		}
	}
}
