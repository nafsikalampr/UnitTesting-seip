package dmst.seip.nafsikalampr.unit_testing;

import org.junit.Test;
import org.junit.Assert;
/**
 * Unit test for simple MyMath.
 */
public class MyMathTest 
{
    MyMath math = new MyMath();
    
    //testing simple case
	@Test
    public void testSimple()
    {
	    Assert.assertEquals(2.0 , math.divide(6, 3),0);
    }
	
	//testing doubles
	@Test
	public void testDoubles() 
	{
	    Assert.assertEquals(2.5, math.divide(5, 2),0);
	}
    
    //testing negative numbers
	@Test
	public void testNegative() 
	{
	Assert.assertEquals(-1.0, math.divide(-6, 6),0);
	}
	
	//testing num=0    
	@Test
	public void testZeroNum()
	{
		Assert.assertEquals(0.0, math.divide(0, 3),0);
	}
	
	//testing denom=0, has to throw exception
	@Test(expected = IllegalArgumentException.class)
	public void testZeroDenom()
	{
		math.divide(2, 0);
	}
}
