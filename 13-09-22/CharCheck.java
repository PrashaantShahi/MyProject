/* Write a Java Program to Check whether a Given Character is Present in a String, 
 Find Frequency & Position of Occurrence.*/
package newAssignment;

public class CharCheck {

	public static void main(String args[])
	{
		String s1="world";
		
		boolean flag=false;
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='w') {
				flag=true;
				count=count+1;
			}
		
		
		}
		
		if(flag==true) {
			System.out.println("Character is found");
		}else {
			System.out.println("Character is not found");
	   }
		System.out.println(count);
	}
}
