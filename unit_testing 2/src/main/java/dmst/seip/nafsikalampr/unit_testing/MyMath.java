package dmst.seip.nafsikalampr.unit_testing;

/**
* Class contains division and sign reversion
*/

public class MyMath 
{
    
    /**
    * method is a simple division with exception
    * @param num the numinator
    * @param denom the denominator
    * @exception is thrown in case denom = 0
    */
    
    public double divide(int num, int denom) {
      if (denom == 0) {
        throw new IllegalArgumentException("Denom has to be other than 0");
    	}
    	return (double) num / denom;
    	    
    }
    
    /**
    * method gets a number and reverses the sign unless num=0
    *@param number
    */
    
   	public int reverseNumber(int number) {
   		if(number != 0) {
   		    return -number;
   		}else {
   			return 0;
   		}
   	}
}
