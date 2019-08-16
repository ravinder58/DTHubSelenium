package Collections;

import java.util.HashSet;

public class HshSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs=new HashSet<String>();
	    hs.add("One");
		hs.add("Two");
		hs.add("Three");
		hs.add("Four");
		hs.add("Five");
		hs.add("Two");    //Not printing duplicate values
		
		for(String i:hs)
		{
			
		  System.out.println(i);  //Printing randomly
		  
		}
		
		

	}

}
