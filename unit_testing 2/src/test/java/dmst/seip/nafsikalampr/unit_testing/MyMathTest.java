package dmst.seip.nafsikalampr.unit_testing;

import org.junit.Test;
import org.junit.Assert;

/**
 * Unit test for MyMath class 
 */

public class MyMathTest 
{
    MyMath math = new MyMath();
    
    /**
    * test for a simple division
    */
	
    @Test
    public void testSimple()
    {
	    Assert.assertEquals(2.0 , math.divide(6, 3),0);
    }
	
    /**
    * test in case number is a double
    */
	
    @Test
    public void testDoubles() 
    {
	    Assert.assertEquals(2.5, math.divide(5, 2),0);
    }
    
    /**
    * test in case number is negative
    */
	
    @Test
    public void testNegative() 
    {
	Assert.assertEquals(-1.0, math.divide(-6, 6),0);
    }
	
    /**
    * test in case numinator is zero
    */
	
    @Test
    public void testZeroNum()
    {
	Assert.assertEquals(0.0, math.divide(0, 3),0);
    }
	
    /**
    * test in case denominator is 0 has to throw an 
    * @exception
    */    
	
    @Test(expected = IllegalArgumentException.class)
    public void testZeroDenom()
    {
	math.divide(2, 0);
    }
}
