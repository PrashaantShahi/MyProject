package demo.java;

import java.util.Scanner;

public class WhileExample {
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		
		int num = sc.nextInt();
		int sum=0,rem;
		
		while(num!=0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
			
		}
		System.out.println("The sum of its digit is "+ sum);
		
	}

}
