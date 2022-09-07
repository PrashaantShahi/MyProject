package demo.java.JavaUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test_Max {

	@Test
	void test() {
		Maximum m=new Maximum();
		int  arr[]= {1,2,3,5,10};
		int actual=m.max(arr);
		int expected=10;
		assertEquals(actual,expected);
	}

}
