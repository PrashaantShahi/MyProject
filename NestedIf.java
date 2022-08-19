package demo.java;

public class NestedIf {
	public static void main(String args[])
	{
	int num=20;
	if(num%2==0)
	
	  {
		 if(num<0)
		 {
			System.out.println("It is a negative number as well as even");
		 }
		 else 
		 {
			System.out.println("The number is even but not negative");
		 }
	  }
	    else
	    {
		 System.out.println("The number is neither negative nor even");
	    }
   }

}
