package module2.basicjava;

import java.util.Arrays;
import java.util.Scanner;

public class CopyOneArrayIntoAnother 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of an array:--> ");
		int array1[]=new int[s.nextInt()];
		int array2[]=new int[array1.length];
		for(int i=0;i<array1.length;i++)
		{
			System.out.println("Enter the value of index position "+i);
			array1[i]=s.nextInt();
			array2[i]=array1[i];
		}
		System.out.print("Input array is-->");
		System.out.println(Arrays.toString(array1));
		System.out.print("Output array is-->");
		System.out.println(Arrays.toString(array2));
		s.close();
	}
}
