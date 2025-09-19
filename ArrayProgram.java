package module2.basicjava;

import java.util.Arrays;

public class ArrayProgram 
{
	public static void main(String[] args) 
	{
		String[] names=new String[4];
		names[0]="Nandhu";
		names[1]="Ram";
		names[2]="Sow";
		names[3]="Linga";
		System.out.println(Arrays.toString(names));
		
		int[] age=new int[4];
		age[0]=15;
		age[1]=16;
		age[2]=17;
		age[3]=18;
		System.out.println(Arrays.toString(age));
		
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]+ " is " + age[i] +" years old");
		}
	}
}
