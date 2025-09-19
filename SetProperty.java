package module2.basicjava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetProperty 
{
	public static void main(String[] args) 
	{
		Set<String> s1=new HashSet<String>();
		s1.add("Ram");
		s1.add("Nandhu");
		s1.add("Sow");
		//s1.add("Linga");
		s1.add("Linga");
		s1.add(null);
		System.out.println(s1);
		
		Set<Character> s2=new HashSet<Character>();
		s2.add('R');
		s2.add('N');
		s2.add('S');
		s2.add('L');
		System.out.println(s2);
		
		Iterator<Character> i1=s2.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}	
	}

}
