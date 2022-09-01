//WAP to accept value of apple sales for each day of the week (using array o ftyype float)and the ,calculate the average sale of the week

package assignment.java;

import java.util.Scanner;

public class AppleSale {

	public static void main(String args[])
	{
		float apple[]=new float[7];
		float avg=0;
		
		Scanner sc= new Scanner (System.in);
		for (int i=0;i<7;i++)
		{
			System.out.println("Enter the sale of apple on day "+(i+1)+":");
			
			apple[i]=sc.nextFloat();
			
		}
		
		for(int i=0;i<7;i++)
		{
			avg=avg+apple[i];
		}
		avg=avg/7;
		
		System.out.println("Average sale of the week:"+avg);
	}
}
