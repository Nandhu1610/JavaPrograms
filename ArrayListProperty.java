package module2.basicjava;

import java.util.ArrayList;

public class ArrayListProperty 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(90);
		a1.add(50);
		a1.add(60);
		a1.add(21);
		System.out.println(a1);
		
		int a3=a1.get(1);
		System.out.println(a3);
		
		
		boolean b3=a1.contains(60);
		System.out.println("Contains--> "+b3);
		a1.remove(1);
		System.out.println("after removing index position--> " +a1);
		
		
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a2.addAll(a1);
		a2.add(20);
		/*boolean b4=a2.containsAll(a1);
		System.out.println("Does a2 Contains entire a1-->" +b4);
		boolean b1=a1.equals(a2);
		a2.clear();
		boolean b2=a2.isEmpty();
		System.out.println("Is it empty--> " + b2);
		System.out.println("Equals--> "+b1);
		System.out.println(a2);*/
		a2.removeAll(a1);
		System.out.println("After removing entire a1 from a2-->" +a2);
	}

}
