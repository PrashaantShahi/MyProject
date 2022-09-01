package assignment.java;

enum Month{
	Jan,Feb,Mar,Apr,May,June
}
public class Switch {

	public static void main(String args[])
	{
		Month m;
		m=Month.Feb;
		
		switch(m) {
		case Jan:
			System.out.println("Janurary");
		break;
		case Feb:
			System.out.println("Feburary");
		break;
		case Mar:
			System.out.println("March");
		break;
		case Apr:
			System.out.println("April");
		break;
		case May:
			System.out.println("May");
		break;
		case June:
			System.out.println("June");
		break;
		
		default:
			System.out.println("Invalid");
		break;
		}
	}




}
