package module2.basicjava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteratorProgram 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Ram");
		a1.add("Nandhu");
		a1.add("Sow");
		a1.add("Linga");
		a1.add("Family");
		System.out.println(a1);
		
		System.out.println("Iteration using Iterator");
		Iterator<String> i1=a1.iterator();
		//hasnext-->true or false and next-->will give the Object most famous methods in Iterator
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		System.out.println("Iteration using ListIterator");
		ListIterator<String> i2=a1.listIterator();
		//hasnext-->true or false and next-->Object, hasprevious-->boolean, previous-->object
		System.out.println("Forward Iteration");
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		
		System.out.println("Backward Iteration");
		while(i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}
	}
}
