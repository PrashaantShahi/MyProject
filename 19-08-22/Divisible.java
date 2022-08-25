//WAP to check whether te number is divisible by 5 as well as 3.
package demo.java;

public class Divisible {
	public static void main (String args[])
	{
		int num=22;
		if(num%5==0 && num%3==0)
		{
			System.out.println("It is both divisible by 5 and 3 ");
		}
		else if(num%5==0)
		{ 
			System.out.println("It is divisible by 5 but not 3");
		}
		else if(num%3==0)
			{
				System.out.println("It is divisible by 3 but not 5");
			}
	    else
			{
				System.out.println("It is neither divisible by 5 nor 3");
			}

		
	
	}
}
