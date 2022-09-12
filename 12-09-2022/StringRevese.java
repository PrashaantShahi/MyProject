/*WAP to input a string and reverse it without using any inbuilt method */
package newAssignment;

import java.util.Scanner;

public class StringRevese {

	public static void main(String args[]) {
	
	
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a string: ");
		String str=sc.nextLine();
		
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
	}
	
}
