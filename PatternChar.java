package demo.java;

public class PatternChar {

	public static void main(String args[])
	{
		for(int rows=1;rows<5;rows++)
		{
			int num=65;
			for(int col=1;col<rows+1;col++)
			{
				
				System.out.print((char)num+"");
				num=num+1;
			}
			System.out.println();
		}
	}
}
