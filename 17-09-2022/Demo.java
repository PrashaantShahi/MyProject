//WAP to print vowels from a text file
package newAssignment;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo {

	public static void main(String args[])throws IOException {
	FileInputStream fin= new FileInputStream("test.txt");
	
	int i;
	
	while((i=fin.read())!=-1)
	{
		if(i==97 || i=='e'|| i=='i'|| i=='o'|| i=='u'|| i=='A'|| i=='E'|| i=='I'|| i=='O'|| i=='U')
		{
			System.out.print((char)i);
		}
	}
	fin.close();
	}
}
