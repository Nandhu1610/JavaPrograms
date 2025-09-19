package module2.basicjava;

import java.util.Arrays;
import java.util.Scanner;
//WAP to copy one array into another Array in reverse order
//input=[1,2,3,4]
//output=[4,3,2,1]
public class CopyOneArrayIntoAnotherInReverse 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of an array:--> ");
		int array1[]=new int[s.nextInt()];
		int array2[]=new int[array1.length];
		for(int i=0,j=array1.length-1;i<array1.length;i++,j--)
		{
			System.out.println("Enter the index position of array: "+i);
			array1[i]=s.nextInt();
			array2[j]=array1[i];
		}
		System.out.print("Input array is-->");
		System.out.println(Arrays.toString(array1));
		System.out.print("Output array is-->");
		System.out.println(Arrays.toString(array2));
		s.close();
	}

}
