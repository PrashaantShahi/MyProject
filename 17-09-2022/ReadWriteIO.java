//WAP to read the data from two files and write it into another file
package newAssignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class ReadWriteIO {

	public static void main(String args[])throws IOException
	{
		FileInputStream fin= new FileInputStream("test.txt");
		FileInputStream fin1= new FileInputStream("test1.txt");
		
		FileOutputStream  fout=new FileOutputStream("test3.txt");
		
		
		SequenceInputStream inst= new SequenceInputStream(fin,fin1);
		
		int i;
		while((i=inst.read())!=-1)
		{
			fout.write((char)i);
		}
		
	}
}
