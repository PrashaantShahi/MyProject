//WAP in java to input 5 number from keyboard and find their sum and average
package demo.java;

import java.util.*;


public class SumAverage {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number:");
		int n1 = sc.nextInt();
		System.out.println("Enter the 2nd number:");
		int n2=sc.nextInt();
		System.out.println("Enter the 3rd number:");
		int n3=sc.nextInt();
		System.out.println("Enter the 4th number:");
		int n4=sc.nextInt();
		System.out.println("Enter the 5th number:");
		int n5=sc.nextInt();
		
		int sum=0,avg=0;
		
		sum=n1+n2+n3+n4+n5;
		
		avg=sum/5;
		
		System.out.println("THe sum of the numbers is :"+sum);
		
		System.out.println("The average of the number is:"+avg);
		
	}
	
}
