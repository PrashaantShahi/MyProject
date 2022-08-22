package demo.java;

public class Fibonnaci {

	public static void main (String args[])
	{
		
		
		int sum=0;
		int prev=0;
		int next=1;
		int i=2;
		System.out.print(prev+ " " +next +" ");
		
	do
		{
			sum=prev+next;
			System.out.print(sum+" ");
			prev=next;
			next=sum;
			i++;
			
		}while(i<=7);
	}
}
