/*Create a test case for prime number which should be tested against atleast 5 values using parameterised test */
package demo.java.JavaUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

class Test_Prime {

	@ParameterizedTest
	@ValueSource(ints= {2,3,5,6,7})
	void test_array(int a) {
		int i;
		boolean flag=false;
		
		if(a==1 || a==0 )
		{
			flag=true;
		}
		for(i=2;i<a;i++)
		{
			if(a%i==0)
			{
				flag=true;
				break;
			}
		}
		assertTrue(flag==false);
	}

}
