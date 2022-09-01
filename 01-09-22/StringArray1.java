//WAP to input an array having 3 row and 3 columns of type string
package assignment.java;

import java.util.Scanner;

public class StringArray1 {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s[][]=new String[3][3];
	
		System.out.println("Enter the elements of array:");
		 
		 for(int i=0;i<3;i++) 

		 {
			for(int j=0;j<3;j++)
			{
				s[i][j]=sc.next();
			}
		 }
		 
		 System.out.println("The elements of array are:");
		 
		 for(int i=0;i<3;i++)
		 {
			 for(int j=0;j<3;j++)
			 {
				 System.out.println(s[i][j]+" ");
			 }
			 System.out.println();
		 }
	}
}
