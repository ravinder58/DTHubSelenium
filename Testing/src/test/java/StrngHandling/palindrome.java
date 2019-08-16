package StrngHandling;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String orignal, rev="";
		System.out.println("Please enter the string to be checked for palindrome"); // here s1.length is function.
		Scanner sc=new Scanner(System.in);
		orignal=sc.nextLine();
		int len=orignal.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+orignal.charAt(i);
			
		}
		
		if(orignal.equalsIgnoreCase(rev))
		{
			
			System.out.println("String is palindrome.");
		}
		
		else 
		{
			System.out.println("String is not palindrome");
		}
			
		
		
	}
}



