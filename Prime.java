package demo.java;

import java.util.Scanner;

public class Prime {

	public static void main(String arggs[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		boolean flag=false;
	
		if(num==1)
		{
			System.out.println("It is not a prime number");
		}else {
			for(int i=2;i<=num;i++)
			{
				if(num%i==0)
				{
					System.out.println( num+" is not a prime number");
					flag=true;
					break;
				}
			}
		
		if(flag==false)
		{
			System.out.println(num+"It is a prime number");
			
		}
	}
	}
}
