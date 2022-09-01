package assignment.java;

import java.util.Scanner;

public class ItemMain {

	public static void main(String args[])
	{
		Item[] itm=new Item[5];
		
		String c;
		float p,total_cost=0;
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the code:");
			c=sc.next();
			
			System.out.println("Enter the price:");
			
			p=sc.nextFloat();
			
			itm[i]=new Item(c,p);
		}
		
		System.out.println();
		
		for(int i=0;i<5;i++)
		{
			System.out.println(" "+itm[i].Code);
			System.out.println(""+itm[i].price);
			
			total_cost=total_cost+itm[i].price;
		}
		System.out.println("Total Price="+total_cost);
	}
}
