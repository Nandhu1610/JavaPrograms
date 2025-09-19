package module2.basicjava;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramProgram 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String1");
		String s1=s.next();
		System.out.println("Enter the String2");
		String s2=s.next();
		if(s1.length()!=s2.length())
		{
			System.out.println("They are not anagram since the length of 2 strings are different");
		}
		else
		{
			char c1[]=s1.toCharArray();
			char c2[]=s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			if(Arrays.equals(c1, c2))
			{
				System.out.println("Given String are Anagram");
			}
			else
			{
				System.out.println("Given String are not Anagram");
			}
		}
		s.close();
	}

}
