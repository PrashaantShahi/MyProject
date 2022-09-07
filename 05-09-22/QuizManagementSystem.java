package newAssignment;

import java.util.Scanner;

public class QuizManagementSystem {
	
	void check() throws IncorrectException
	{
		String ques[]= {"what is java?","which is the largest river"};
		String option1[]= {"object oriented language","nile river"};
		String option2[]= {"procedural oriented language","sfsfg"};
		
		for(int i=0;i<ques.length;i++)
		{
			String q=ques[i];
			System.out.println(q);
			System.out.println(option1[i]);
			System.out.println(option2[i]);
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your choice");
			String ch=sc.nextLine();
	
	

	
	if(!(ch.equals(option1[i]))) {
		throw new IncorrectException("Wrong answer");
	}else {
		System.out.println("Correct");
	}
}
}

	public static void main (String args[])
	{
		QuizManagementSystem q=new QuizManagementSystem();
		try {
			q.check();
		}catch(IncorrectException e)
		{
			System.out.println(e.getMessage());
		}
	
		
	}
}
