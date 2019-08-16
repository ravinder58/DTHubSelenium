package Collections;

import java.util.LinkedHashSet;

public class LinkedhHshset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		LinkedHashSet<String> hs1=new LinkedHashSet<String>();
		hs1.add("One");
		hs1.add("Two");
		hs1.add("Three");
		hs1.add("Three");   //Duplicate values are not allowed.
		hs1.add("Four");
		hs1.add("Five");
		for(String i:hs1)
		{
			System.out.println(i);   //printing in the order of insertion of objects
		}
		
	}

}
