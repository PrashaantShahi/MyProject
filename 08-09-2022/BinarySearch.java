/*Write a java program to input an array and search an element using binary search */
package newAssignment;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5};
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the element to find:");
		
		int n=sc.nextInt();
		
		
		int first=arr[0],last=arr.length-1;
		
		int mid=(first+last)/2;
		
		while(first<=last)
		{
			if(arr[mid]<n)
			{
				first=mid+1;
			}else if(arr[mid]==n)
			{
				System.out.println("Element found at index " +mid);
				break;
			}
			else
			{
				last=mid-1;
			}
			mid=(first+last)/2;
		}
		if(first>last)
		{
			System.out.println("Element not found");
		}
	}
}
