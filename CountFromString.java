package module2.basicjava;

import java.util.Arrays;
import java.util.Scanner;

public class CountFromString 
{
	static int countofalphabet=0;
	static int countofnumeric=0;
	static int countofspace=0;
	static int countofspecialcharacter=0;
	public static void main(String[] args) 
	{
		//String s="K V no 2@";
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the String Name");
		String s2=s1.next();
		char c1[]=s2.toCharArray();
		System.out.println(Arrays.toString(c1));
		for(int i=0;i<c1.length;i++)
		{
			boolean b1=Character.isAlphabetic(c1[i]);
			boolean b2=Character.isDigit(c1[i]);
			boolean b3=Character.isWhitespace(c1[i]);
			if(b1==true)
			{
				countofalphabet++;
			}
			if(b2==true)
			{
				countofnumeric++;
			}
			if(b3==true)
			{
				countofspace++;
			}
		}
		System.out.println("Total count of alphabets in the given string is--> "+countofalphabet);
		System.out.println("Total count of numerics in the given string is--> "+countofnumeric);
		System.out.println("Total count of numerics in the given string is--> "+countofspace);
		countofspecialcharacter=c1.length-(countofalphabet+countofnumeric+countofspace);
		System.out.println("Total count of special character in the given string is--> "+countofspecialcharacter);
		s1.close();
	}
}
