package StrngHandling;

public class reverse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Original="My name is Deepak";
		System.out.println("Original String is  :-" +Original);
		String[] s1=Original.split(" ");
		String new_String="";
		
		for (int i=0;i<s1.length;i++)  //s1.length is value
		{      
		    int len=s1[i].length();
			String rev="";
			
			for(int j=len-1;j>=0;j--)         // Reversing the individual word.
			{
			 rev=rev+s1[i].charAt(j);
			}
			
			new_String=new_String+rev+" ";
			
	      }
		
		System.out.println("Modified String is  :-"+new_String);

}
}
