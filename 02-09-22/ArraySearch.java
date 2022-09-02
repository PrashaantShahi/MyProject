/*Write a java program to input 5 elements of an array and search for a number whether
it is present in an array or not. If present print its position in the array*/
package newAssignment;

import java.util.Scanner;

public class ArraySearch {

	public static void main(String args[])
	{
		
		int arr[]= new int[5];
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			
			
			System.out.println("Enter the element: ");
			
			arr[i]=sc.nextInt();
			
		}
		
		System.out.println("Enter the element you want to find :");
		
		int a=sc.nextInt();
		
		for(int i=0;i<5;i++)
		{
			if(arr[i]==a)
			{
				flag=true;
				break;
			}
			else
			{
				flag=false;
			}
			if(flag==true)
			{
				System.out.println("Element found at position:"+(i+1));
				
			}
			else
			{
				System.out.println("Element not found");
			}
		}
		
		
		
		
		
	}
}
