package module2.basicjava;

import java.util.Enumeration;
import java.util.Vector;

public class VectorProgram 
{

	public static void main(String[] args) 
	{
		Vector<Integer> v1=new Vector<Integer>();
        v1.addElement(90);
        v1.addElement(74);
        v1.addElement(85);
        v1.addElement(93);
        v1.addElement(20);
        System.out.println(v1);
      
        Enumeration<Integer> e1=v1.elements();
        
        while(e1.hasMoreElements())
        {
                System.out.println(e1.nextElement());
        }
        

	}

}
