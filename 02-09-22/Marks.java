/*
Write a program to print the roll number and average marks of 8 students 
in three subjects (each out of 100). The marks are entered by user.
 */
 package newAssignment;

import java.util.Scanner;

public class Marks {

	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		int rollNo;
		int avgMarks;
		int s1,s2,s3;
		
		for(int i=0;i<=8;i++)
		{
			for(int j=1;j<=8;j++)
			{
				System.out.println("Enter the rollno:");
				rollNo=sc.nextInt();
				
				System.out.println("Enter the marks for English:");
				s1=sc.nextInt();
				
				System.out.println("Enter the marks for Maths: ");
				s2=sc.nextInt();
				
				System.out.println("Enetr the marks for Science:");
				s3=sc.nextInt();
				
				
				avgMarks=(s1+s2+s3)/3;
				
				System.out.println(" RollNo " +rollNo+ " Avg mark in English,Maths,Science is " +avgMarks);
			}
			
		}
		
		
		
	}
}
