package Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class LnkedHshmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();
		hm.put(1,"This");
		hm.put(2,"is");
		hm.put(3,"Selenium");
		hm.put(24,"Automation");
		hm.put(522,"Testing");
		hm.put(0,"Classes");
		hm.put(23,"by Dt Hub");      //Printing in insertion order.
		hm.put(23, "classes in sector 14");
		
		Set<Integer> all=hm.keySet();
		for(Integer i:all)
		{
			System.out.println("Key is " +i+" value is "+hm.get(i));
		}
		
	    
		
		
		

	}

}
