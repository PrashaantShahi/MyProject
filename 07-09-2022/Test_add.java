package demo.java.JavaUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test_add {

	@Test
	void test() {
		Addition a=new Addition();
		
		int actual=a.sum(5, 15);
		int expected=20;
		
		assertEquals(expected,actual);
	}

}
