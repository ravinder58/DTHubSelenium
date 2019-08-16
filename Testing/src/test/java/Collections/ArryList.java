package Collections;


import java.util.ArrayList;


public class ArryList {

	public static void main(String[] args) {  
		// TODO Auto-generated method stub
 
		ArrayList <Integer> al=new ArrayList<Integer>();
		al.add(45);
		al.add(55);
		al.add(45);
		al.add(85);
		al.add(65);
		al.add(75);
		
		for(Integer i:al)
		{
			System.out.println(i);   //printing in the order of insertion of objects.
		}
		
	}

}
