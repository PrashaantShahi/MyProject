package demo.java;

import java.util.Scanner;

public class ArithmeticSwitch {

	public static void main (String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the First number");
		
		int n1=sc.nextInt();
		
		System.out.println("Enter the second number");
		int n2=sc.nextInt();
		
		System.out.println("Choose an operator : +,-,*,%,/");
		
		char ch=sc.next().charAt(0);
		
		int res;
		
		switch(ch)
		{
		
			case '+':
				res=n1+n2;
				System.out.println(n1+"+"+n2+"="+res);
				break;
				
			case '-':
				
				res=n1-n2;
				System.out.println(n1+"-"+n2+"="+res);
				break;
			case '*':
				res=n1*n2;
				System.out.println(n1+"*"+n2+"="+res);
				break;
			case '%':
				res= n1%n2;
				System.out.println(n1+"%"+n2+"="+res);
				break;
			case '/':
				res=n1/n2;
				System.out.println(n1+"/"+n2+"="+res);
				break;
			default:
				System.out.println("Invalid operatio");
			
		}
		
	}
}
