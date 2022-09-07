package demo.java.JavaUnit;

public class StudentBusinessLogic {

	public double calculatePercentage(Student s)
	{
		double percent=0;
		double tmarks=0;
		tmarks=s.getMk1()+s.getMk2()+s.getMk3();
		
		percent=(tmarks/100)* 100;
		
		return percent;
		
	}
}
