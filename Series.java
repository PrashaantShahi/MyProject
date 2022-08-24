package demo.java;

import java.util.Scanner;

public class Series {

	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range:");
		int n=sc.nextInt();
		
		double sum=0;
		
		for(int i=2;i<=n;i++)
		{
			sum+=((double)1/i);
		}
		
		System.out.println(sum);
		
	}
}
