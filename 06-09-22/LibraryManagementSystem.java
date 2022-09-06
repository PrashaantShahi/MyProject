package newAssignment;

import java.util.Scanner;

public class LibraryManagementSystem {
	
	void check() throws BookNotFoundException {
		
		String books[]= {"Maths","Science","History","English"};
		
		for(int i=0;i<books.length;i++)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the book you want to search:");
			String ch=sc.next();
			String b= books[i];
			if(!(ch.equals(books[i]))) {
				throw new BookNotFoundException ("Book not found");
				}else {
					System.out.println(books[i] + " Available ");
					break;
				}
		
		
	     }
	}
		public static void main (String args[])
		{
			LibraryManagementSystem s=new LibraryManagementSystem();
			try {
				
				s.check();
			}catch(BookNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}
				
}

