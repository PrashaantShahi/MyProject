/*WAP to input a sentence. From the sentence sort the words according to their length. The sorting should be done is descending order
Print the words from highest length to lowest length*/
package newAssignment;

public class SentenceSort {

	public static void main( String args[])
	{
		String sentence="My name is Prashant";
		
		String arr[]=sentence.split(" ");
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j+1].length()>arr[j].length())
				{
					String temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					
				}
				
			}
		}
		for(String i:arr)
		{
			System.out.println(i);
		}
	}
}
