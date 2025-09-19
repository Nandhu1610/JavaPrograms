package module2.basicjava;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapIterationProgram 
{

	public static void main(String[] args) 
	{
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(7485145, "Hima");
        m1.put(7485146, "Arvind");
        m1.put(7485147, "Lakshmi");
        m1.put(7485148, "Manoj");
        System.out.println(m1);
        
        Set<Integer> s1=m1.keySet(); //Can only iterate the keys
        Collection<String> c1=m1.values();  //can only iterate the values
        Set<Entry<Integer,String>> s2=m1.entrySet(); //both key and value pair
        
        System.out.println(s1);
        System.out.println(c1);
        
        //for each loop
        System.out.println("Iterating the keys using Keyset");
        for(Integer i3:m1.keySet())
        {
        	System.out.println(i3);
        }
        
        System.out.println("Iterating the values using values method");
        for(String i3:m1.values())
        {
        	System.out.println(i3);
        }
        
        System.out.println("Iterating the pair values using entrySet method");
        for(Entry<Integer,String> i3:m1.entrySet())
        {
        	System.out.println(i3);
        }
        
        Iterator<Entry<Integer, String>> i4=s2.iterator();
        while(i4.hasNext())
        {
        	System.out.println(i4.next());
        }
        
	}

}
