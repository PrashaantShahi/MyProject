package demo.java;

public class HCF {

	public static void main(String args[])
	{
		int n1=10,n2=12;
		int hcf=0;
		for(int i=1;i<=n1 || i<=n2;i++)
		{
			if(n1%i==0 && n2%i==0)
			hcf=i;
		}
		System.out.println("THe GCD or HCf is:"+hcf);
		
	}
}
