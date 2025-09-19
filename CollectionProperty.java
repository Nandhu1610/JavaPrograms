package module2.basicjava;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionProperty 
{

	public static void main(String[] args) 
	{
		Collection<Double> c1=new ArrayList<Double>(); //upcasting
		c1.add(9.36);
        c1.add(14.01);
        c1.add(45.56);
        c1.add(4.34);
        System.out.println(c1);
		 /* Methods in Collection
		c1.add(null);
        c1.addAll(c1);
        c1.clear();
        c1.contains(c1);
        c1.containsAll(c1);
        c1.equals(c1);
        c1.isEmpty();
        c1.iterator();
        c1.remove(c1);
        c1.removeAll(c1);
        */
	}

}
