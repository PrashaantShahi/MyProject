package demo.java;

import java.util.Scanner;

public class NaturalNumbers {

	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n natural numbers:");
		int n=sc.nextInt();
		int sum=0;
		
		for(int i=1;i<=n;i++)
		{
			System.out.println(i);
			sum=sum+i;
			
			
		}
		System.out.println("The sum is "+sum);
	}
}
