package module3.basicjava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling3
{
	public static void main(String[] args) 
		{
			try
			{
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter the size of Array:");
			
			int array1[]=new int[s1.nextInt()];
			s1.close();
			}
			catch(NegativeArraySizeException a1)
			{
				System.out.println("Please do not enter negative value");
				Scanner s1=new Scanner(System.in);
				System.out.println("Enter the size of Array but it should be of int value only:");
				
				int array1[]=new int[s1.nextInt()];
			}
			catch(InputMismatchException a2)
			{
				System.out.println("Please do not enter String value");
				Scanner s1=new Scanner(System.in);
				System.out.println("Enter the size of Array but it should be of int value only:");
				
				int array1[]=new int[s1.nextInt()];
			}
			finally
			{
				System.out.println("CLose the connection");
			}
		}
}
