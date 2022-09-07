/*Create a class having student details like name,marks in 3 subjects and a percentage variable
create a student business logic which should return the percentage of three subjects
and then test the business logic using junit  */
package demo.java.JavaUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test_Student {

	Student s=new Student();
	StudentBusinessLogic bs=new StudentBusinessLogic();
	@Test
	void test() {
		s.setName("Prashant");
		s.setMk1(86.00);
		s.setMk2(64.00);
		s.setMk3(75.00);
		double actual=bs.calculatePercentage(s);
		double expected=100.00;
		assertEquals(expected,actual);
	}

}
