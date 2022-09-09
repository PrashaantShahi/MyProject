/* WAP to bubble sort*/
package newAssignment;

public class BubbleSort {

	

	public static void main(String args[])
	{
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
	}

}
