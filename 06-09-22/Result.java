package newAssignment;

public class Result extends Student implements Exam {
double percent;
Result(double p)
{
	super("Prashant",01,67.00,76.00);
	this.percent=p;
}
@Override
public void Percent_cal() {
	// TODO Auto-generated method stub
	percent=marks1+marks2/100*100;
	System.out.println(percent+" % ");
}
void per_display() {
	System.out.println(name + " " + roll_no + " " + marks1 + " " + marks2);
}
}
