package module2.basicjava;


import java.util.Arrays;
import java.util.Scanner;

public class CompareTwoArrays 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of an array1");
		int Array1[]=new int[s.nextInt()];
		int Array2[]=new int[Array1.length];
		for(int i=0;i<Array1.length;i++)
		{
			System.out.println("Enter the array1 of index position "+i);
			Array1[i]=s.nextInt();
		}
		for(int i=0;i<Array1.length;i++)
		{
			System.out.println("Enter the array2 of index position "+i);
			Array2[i]=s.nextInt();		
		}
		System.out.print("Input of Array1 is-->");
		System.out.println(Arrays.toString(Array1));
		System.out.print("Input of Array2 is-->");
		System.out.println(Arrays.toString(Array2));
		if(Arrays.equals(Array1, Array2))
		{
			System.out.println("Arrays are Equal");
		}
		else
		{
			System.out.println("Arrays are not Equal");
		}
		s.close();
		
		
	/*	int Array1[]=new int[5];
		int Array2[]=new int[5];
		Array1[0]=21;
		Array1[1]=31;
		Array1[2]=41;
		Array1[3]=51;
		Array1[4]=61;

		Array2[0]=21;
		Array2[1]=31;
		Array2[2]=41;
		Array2[3]=51;
		Array2[4]=61;
		
		if(Arrays.equals(Array1, Array2)==true)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}*/
		}

}
