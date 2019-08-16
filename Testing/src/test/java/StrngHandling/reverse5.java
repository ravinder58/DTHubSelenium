package StrngHandling;

import java.util.Scanner;

public class reverse5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String orignal="1 0 1 0 1 0 1 0 ";
		System.out.println("Original String is "+orignal);
	
		String[] s1=orignal.split(" ");
		String odd="";
		String even="";
		String final_String="";
		for(int i=0;i<s1.length;i++)
		{
			if(i%2==0)     // Adding number on  even places
			{
				even=even+s1[i];
			}
			else             //Adding number on odd places..
			{ 
				odd=odd+s1[i];
			}
			
			
		}
		
		final_String=final_String+even+odd;
		System.out.println("The final String is "+final_String);
				
				
		
	}
}



