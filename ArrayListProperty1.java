package module2.basicjava;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListProperty1 
{

	public static void main(String[] args) 
	{
		ArrayList<String> a1=new ArrayList<String>();
        a1.add("Ram");
        a1.add("Sita");
        a1.add("Laxman");
        a1.add("Riya");
        a1.add("Sia");

        a1.add(1, "Neha");
        System.out.println("Before sorting-> "+a1);
        Collections.sort(a1);
        System.out.println("After sorting-> "+a1);
        System.out.println(a1);
        
        ArrayList<String> a2=new ArrayList<String>();
        a2.add("Supriya");
        a2.add("Aparna");
        a2.add("Ankur");
        a2.addAll(1, a1);
        System.out.println(a2);

	}

}
