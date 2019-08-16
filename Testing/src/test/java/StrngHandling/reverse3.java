package StrngHandling;

import java.util.Scanner;

public class reverse3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String orignal, rev="";
		System.out.println("Please enter the string to be reversed"); // here s1.length is function.
		Scanner sc=new Scanner(System.in);
		orignal=sc.nextLine();
		int len=orignal.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+orignal.charAt(i);
			
		}
		
	
		System.out.println("Modified String is  :-"+rev);
		
		sc.close();
		
		
	}
}



