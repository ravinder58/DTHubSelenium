package Collections;


import java.util.ArrayList;
import java.util.LinkedList;


public class lnkedList {

	public static void main(String[] args) {  
		// TODO Auto-generated method stub
 
		LinkedList <Integer> ll=new LinkedList<Integer>();
		ll.add(45);
		ll.add(55);
		ll.add(45);   //Duplicate values are allowed.
		ll.add(85);                     
		ll.add(65);
		ll.add(75);  
		for(Integer i:ll)
		{
			System.out.println(i);  //printing in the order of insertion of objects.
		}
		
		
	}

}
