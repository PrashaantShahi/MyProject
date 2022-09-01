//WAP to input an array having 3 row and 3 columns of type string
package assignment.java;

public class StringArray1 {

	public static void main(String args[])
	{
		String s[][]=new String[3][3];
		 s [0][0]="Aman";
		 s[0][1]="Eli";
		 s[0][2]="jay";
		 
		 s[1][0]="James";
		 s[1][1]="Joe";
		 s[1][2]="xoey";
		 
		 s[2][0]="Alice";
		 s[2][1]="charles";
		 s[2][2]="jj";
		 
		 for(int i=0;i<3;i++) 

		 {
			for(int j=0;j<3;j++)
			{
				System.out.println(s[i][j]);
			}
		 }
	}
}
