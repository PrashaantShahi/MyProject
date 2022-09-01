//WAP to input an array having 5 strings and display them
package assignment.java;

import java.util.Scanner;

public class StringArray {

	public static void main(String args[])
	{
		String s[]= new String[5];
		for(int i=0;i<5;i++) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Eenter the elements:");
		String str=sc.nextLine();
		s[i]=str;
		}
		
		for(int i=0;i<5;i++)
		{
			
			System.out.println(s[i]);
			
		}
	}
}
