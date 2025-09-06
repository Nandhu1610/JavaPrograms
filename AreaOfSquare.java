package module1.basicjava;

import java.util.Scanner;

public class AreaOfSquare 
{

	public static void main(String[] args) 
	{
		System.out.println("Lets find out the area of Sqaure");
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter the value of a");
		int a=s.nextInt();
		int area=a*a;
		System.out.println("Area of Square is:" +area);
		s.close();
	}

}
