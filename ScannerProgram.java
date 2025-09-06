package module1.basicjava;

import java.util.Scanner;

public class ScannerProgram 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in); //constructor
		System.out.print("Please enter the value of a:->");
		int a=s1.nextInt();
		System.out.print("Please enter the value of b:->");
		int b=s1.nextInt();
		System.out.print("The sum of the two number:->");
		int sum=a+b;
		System.out.println(sum);
		s1.close();
	}

}

