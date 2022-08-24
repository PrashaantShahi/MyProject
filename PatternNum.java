package demo.java;

public class PatternNum {

	public static void main(String args[])
	{
		
		int num,n=10;
		for(int rows=0;rows<n;rows++)
		{
			num=1;
			for(int col=0;col<=rows;col++)
			{
				System.out.print(num+"");
				num++;
			}
			System.out.println();
		}
	}
}
