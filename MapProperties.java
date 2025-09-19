package module2.basicjava;

import java.util.HashMap;
import java.util.Map;

public class MapProperties 
{

	public static void main(String[] args) 
	{
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(7485145, "Hima");
        m1.put(7485146, "Arvind");
        m1.put(7485147, "Lakshmi");
        m1.put(7485148, "Manoj");
        System.out.println(m1);
        
        Map<Integer,String> m2=new HashMap<Integer,String>();
		m2.put(7485149, "Nandhu");
        m2.put(7485150, "Ram");
        m2.put(7485151, "Sow");
        m2.put(7485152, "Linga");
        System.out.println(m2);
        
        m2.putAll(m1);
        System.out.println(m2);
        
        String s=m2.get(7485147);
        System.out.println(s);
        
        m2.remove(7485148);
        System.out.println(m2);
        
        m2.remove(7485149, "Nandhu");
        System.out.println(m2);
        
        m2.replace(7485145, "Vanaja");
        System.out.println(m2);
        
        m2.replace(7485146, "Arvind", "Mei");
        System.out.println(m2);
        
        boolean b3=m2.containsKey(7485150);
        boolean b4=m2.containsValue("Ramdas");
        System.out.println(b3);
        System.out.println(b4);
      
        m2.putIfAbsent(7485149," Nandhu");
        System.out.println(m2);

        m2.clear();
        System.out.println(m2);
        
        boolean b1=m1.equals(m2);
        System.out.println(b1);
       
	}

}
