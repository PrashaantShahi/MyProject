package demo.java;

public class PatternNum1 {

	public static void main (String args[])
	{
		int num=1;
		for(int rows=1;rows<=4;rows++)
		{
			
			for(int cols=1;cols<rows+1;cols++)
			{
				System.out.print(num++);
				
			}
			System.out.println();
		}
	}
}
