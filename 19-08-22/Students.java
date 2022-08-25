//WAP to take marks of a student and then print his/her grade 
package demo.java;

public class Students {
	public static void main(String args[])
	{
		int m=70;
		
		if(m==90 && m<=100)
		{
			System.out.println(m+" Grade is A+ ");
		}else if(m>=80 && m<=90)
		{
			System.out.println(m+" Grade is A ");
		}else if(m>=70 && m<=80)
		{
			System.out.println(m+" Grade is B+ ");
			
		}else if(m>=60 && m<=70) {
			System.out.println(m+" Grade is B ");
		}else if(m>=50 && m<=60) {
			System.out.println(m+" Grade is C ");
		}else if(m>=40 && m<=50) {
			System.out.println(m+" Grade is D ");
		}else if(m>=30 && m<=40) {
			System.out.println(m+" Grade is E ");
		}else if(m<=30) {
			System.out.println(m+" Grade is F ");
		}
	}

}
