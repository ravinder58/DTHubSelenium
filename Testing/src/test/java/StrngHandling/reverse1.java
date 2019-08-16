package StrngHandling;

public class reverse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Original="My name is deepak";
		String[] s1=Original.split(" ");

		for (int i=s1.length-1;i>=0;i--)  // here s1.length is variable
		{
			System.out.print(s1[i]+" ");
		}

	}

}
