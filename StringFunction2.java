package module2.basicjava;

import java.util.Arrays;

public class StringFunction2
{
	public static void main(String[] args)
	{
		//Converting string to array
		String a="school";
		char c[]=a.toCharArray();
		for(int i=0;i<a.length();i++) //or for(int i=0;i<c.length;i++)
		{
			//System.out.println(c[i]);
		}
		System.out.println(Arrays.toString(c));
	}
}
