package demo.java;

import java.util.Scanner;

public class Character {

	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a letter:");
		
		char ch=sc.next().charAt(0);

		int j=ch;
		if(j>=65 && j<=90 || j>=97 && j<=122 ) {

		if(ch=='A' || ch=='a'  || ch=='E' || ch=='e' || ch=='I' || ch=='i' || ch=='O' || ch=='o' || ch=='U' || ch=='u')
			System.out.println( ch+"  is a vowel");

		else 	
			System.out.print(ch+ " is a consonant");
			

		}
		else 
			System.out.println(ch +" is not a letter ");

		
		
		
	}
}
