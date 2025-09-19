package module2.basicjava;

import java.util.Arrays;
import java.util.Scanner;

//WAP to fetch all the values in Array at run time		
public class ArrayProgramHumanInput 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter the size of an array: ");
		int age[]=new int[s.nextInt()];
		for(int i=0;i<age.length;i++)
		{
			System.out.println("Please enter the value at Index Position "+ i);
			age[i]=s.nextInt();
		}
		System.out.print("The Final Output Array is:--> ");
		System.out.println(Arrays.toString(age));
		s.close();
	}
}
