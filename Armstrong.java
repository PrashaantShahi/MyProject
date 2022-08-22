package demo.java;

import java.util.Scanner;

public class Armstrong {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		
		int num=sc.nextInt();
		
		int sum=0,rem,temp=num;
		
		while(num!=0)
		{
			rem=num%10;
			sum=sum+rem*rem*rem;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("It is an Armstrong number");
		}
		else
		{
			System.out.println("It is not an Armstrong Number");
		}
		
	}

}
