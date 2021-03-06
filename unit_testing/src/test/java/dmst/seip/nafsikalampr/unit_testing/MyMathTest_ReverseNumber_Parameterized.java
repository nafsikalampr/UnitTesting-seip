package dmst.seip.nafsikalampr.unit_testing;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;


/**
* test implements Parameterized test for MyMath class
*/

@RunWith(Parameterized.class)

public class MyMathTest_ReverseNumber_Parameterized {
	//creating parameters and values
	@Parameter (value = 0) 
	public int number;
	@Parameter (value = 1) 
	public int result;
	
	MyMath mm = new MyMath();
	
	/**
        * method creates the values we want our test to examine
        */
	
	@Parameters
	public static Collection<Object[]> data() {
		//checking for specific numbers
		Object[][] data = new Object[][]{{1,-1},{2,-2},{0,0},{Integer.MAX_VALUE, -Integer.MAX_VALUE}};
		
		return Arrays.asList(data);
	}
	
	/**
        * method checks the reverse sign method
        */
	@Test
	public void testReverseNumNormalCases() {
		assertEquals(result, mm.reverseNumber(number));
	}
}
