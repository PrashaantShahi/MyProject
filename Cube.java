package demo.java;

import java.util.Scanner;

public class Cube {
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the numbers:");
		
		int num=sc.nextInt();
		
		int sum=0,rem;
		while(num!=0)
		{
			rem=num%10;
			sum=sum+rem*rem*rem;
			num=num/10;
		}
		System.out.println(sum);
		

		
	}

}
