/* Write a program to throw a user-defined exception "String Mismatch Exception",
 *  if two strings are not equal (ignore the case).*/
package newAssignment;

import java.util.Scanner;

public class Equals {

	void check() throws StringMismatchException
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string:");
		
		String str=sc.nextLine();
		
		if(str.equalsIgnoreCase("hello"))
		{
			System.out.println("String Matched");
			
		}else
			throw new StringMismatchException("String not matched");
	}
	public static void main (String args[])
	{
		Equals e=new Equals();
		try {
			e.check();
		}catch( StringMismatchException se)
		{
			System.out.println(se.getMessage());
		}
	
	}
}
