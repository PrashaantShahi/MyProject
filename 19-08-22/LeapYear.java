//WAP that take a year from user and print whether the year is a leap year or not.
package demo.java;

public class LeapYear {

	public static void main(String args[])
	{
		int year=2017;
		
		if(year%4==0)
		{
			System.out.println(year+" is a leap year");
		}
		 else if(year%100==0)
			{
				System.out.println(year+" is a leap year");
				
			}
			else if(year%400==0)
			{
				System.out.println(year+" is a leap year");
			}
		else
		{
			System.out.println(year+" is not a leap year");
		}
	}
}
