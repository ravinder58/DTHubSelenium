package Collections;


import java.util.TreeSet;

public class TreeHshSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		TreeSet<String> hs1=new TreeSet<String>();
		hs1.add("One");
		hs1.add("One");
		hs1.add("Two");
		hs1.add("Three");
		hs1.add("Four");
		hs1.add("Five");
		
		for(String i:hs1)
		{
			System.out.println(i);  //printing by sorting in ascending order alphabetically
		}
		
	}

}
