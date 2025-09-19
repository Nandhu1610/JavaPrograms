package module2.basicjava;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

//In singleton collections, we can't add more than one object. 
//If we try to do that, we will get the exception called UnsupportedOperationException					

public class SingletonCollectionsProgram 
{

	public static void main(String[] args) 
	{
		List<String> list=Collections.singletonList("Java");
		System.out.println(list);
		//list.add("Python");
		//System.out.println(list);
		
		Set<String> set=Collections.singleton("Java");
		System.out.println(set);
		//set.add("Python");
		//System.out.println(set);
		
		Map<Integer,String> map=Collections.singletonMap(54545, "Nandhini");
		System.out.println(map);
		map.put(56559, "Ram");
		System.out.println(map);
	}

}
