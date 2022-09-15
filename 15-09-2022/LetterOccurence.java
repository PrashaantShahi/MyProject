/* Write a program to find the first and the last occurence of the 
 * letter 'o'  in "Hello World".*/
package newAssignment;

public class LetterOccurence {

	public static void main(String args[])
	{
		String sen="hello world";
		
		
	
		boolean flag=true;
		
		for(int i=0;i<sen.length();i++)
		{
			if(sen.charAt(i)=='o')
			{
				flag=true;
			
				System.out.println("Character found at index "+i);
			}
		}
		
		if(flag==false) {
			System.out.println("Character not found");
		}
		
	}
}
