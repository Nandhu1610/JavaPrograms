package module2.basicjava;

import java.util.Scanner;

public class AveragePrograminArray 
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int array1[]=new int[s.nextInt()];
		int sum=0;
		for(int i=0;i<array1.length;i++)
		{
			System.out.println("Enter the array value of index position: "+i);
			array1[i]=s.nextInt();
			sum=sum+array1[i];
		}
		System.out.println("Sum of an array is--> "+sum);
		double average=sum/array1.length;
		System.out.println("Average of an array is--> "+average);
		s.close();
	}

}
