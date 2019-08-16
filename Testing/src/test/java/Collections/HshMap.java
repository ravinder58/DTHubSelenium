package Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HshMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"This");
		hm.put(2,"is");
		hm.put(3,"Selenium");
		hm.put(24,"Automation");
		hm.put(522,"Testing");
		hm.put(0,"Classes");
		hm.put(12,"by Dt Hub");            //Printing in random order.
		hm.put(12, "classes in sector 14");
		
		Set<Integer> all=hm.keySet();
		for(Integer i:all)
		{
			System.out.println("Key is " +i+" value is "+hm.get(i));
		}
		
	    
		
		
		

	}

}
