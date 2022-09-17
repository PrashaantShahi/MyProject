//WAP to count the number of letters in a given file
package newAssignment;

import java.io.FileInputStream;
import java.io.IOException;

public class Countletters {

	public static void main(String args[])throws IOException{
		FileInputStream fin=new FileInputStream("test.txt");
		
		int i;
		int count=0;
		while((i=fin.read())!=-1)
		{
				count=count+1;
		}
		System.out.println(count);
		
		fin.close();
	}
}
