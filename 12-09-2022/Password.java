/*Write a program to accept a password from the user and throw 'Authentication Failure'
   exception if the password is incorrect.*/
package newAssignment;

import java.util.Scanner;

public class Password {

	void check()throws AuthenticationException 
	{
		String password= new String ("newPassword");
			
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your password:");
		String str=sc.nextLine();
		if(!(str.equals(password)))
		{
			throw new AuthenticationException("Authentication Failure");
		}
		else
		{
			System.out.println("Logged in");
		}
	}
	public static void main(String args[])
	{
		
		Password p=new Password();

		try {
			p.check();
		} catch(AuthenticationException ae){
			System.out.println(ae.getMessage());
		}
		
	
				
	}
}
