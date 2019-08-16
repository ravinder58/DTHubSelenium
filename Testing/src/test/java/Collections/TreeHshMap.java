package Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeHshMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer,String> hm=new TreeMap<Integer,String>();
		hm.put(1,"This");
		hm.put(2,"is");
		hm.put(3,"Selenium");
		hm.put(24,"Automation");
		hm.put(522,"Testing");
		hm.put(0,"Classes");
		hm.put(23,"by Dt Hub"); //Printing on the basis of sorting in ascending order of key
		                          //value
		hm.put(23, "classes");
		Set<Integer> all=hm.keySet();
		for(Integer i:all)
		{
			System.out.println("Key is " +i+" value is "+hm.get(i));
		}
		
	    
		
		
		

	}

}
