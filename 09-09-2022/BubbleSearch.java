/* WAP to input an array in random order and then sort it using bubble 
 sort and then search for a given element from that sorted array*/
package newAssignment;

import java.util.Scanner;

public class BubbleSearch {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
        int arr[]= {2,3,9,4,5};
		
		int i,j;
		System.out.println("Array Befor Sort");
		
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	
		System.out.println();
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr.length-1;j++)
			{
				int temp=0;
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.println("Array after sorting:");
		
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("enter Number to check its present in an array:");
		int search=sc.nextInt();
		
		for( i=0;i<arr.length;i++) 
		{
			if(search==arr[i])
			{
				System.out.print(arr[i]+" present at position  "+i);
				break;
			}else if(arr.length==i+1 && search!=arr[i])
			{
				System.out.println("Element not avvailable");
			}
		}
	}
		
}

