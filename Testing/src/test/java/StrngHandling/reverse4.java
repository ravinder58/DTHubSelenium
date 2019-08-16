package StrngHandling;

import java.util.Scanner;

public class reverse4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String orignal;
		int count=0;
		System.out.println("Please enter the string whose e word needs to be counted"); // here s1.length is function.
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		orignal=sc.nextLine();
		int len=orignal.length();
		for(int i=0;i<=len-1;i++)
		{
		 
			if((orignal.charAt(i)=='e')|| (orignal.charAt(i)=='E'))   //counting for both upper case and lowercase
			{
				count++;
			}
		}
		
	System.out.println("Number of times 'e' occurs is  " +count);
	
	}
}



