package demo.java;

import java.util.Scanner;

public class Square {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int sum=0;
		
		for( int i=0;i<=n;i++) 
		{
			for( int j=0;j<=n;j++) 
			{
			 sum=(j*j)+(i*i);
			if(sum==n)
			{
				System.out.println(n+" is the sum of "+i+" and "+j+" square number");
			}
			
		}
	}
}
	
}
