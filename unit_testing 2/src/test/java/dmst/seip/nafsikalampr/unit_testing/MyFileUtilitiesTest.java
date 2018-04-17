package dmst.seip.nafsikalampr.unit_testing;

import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
* class tests MyFileUtilities class
* test use-cases are incoplete but working on them 
*/

public class MyFileUtilitiesTest {
	
	/**
	* using @Rule to test the exception 
	*/
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	/**
	* test the existence of file with specific filepath
	*/
	
	@Test
    public void testReadFileWithClassLoader(){
        File file = new File("src/test/resources/grades.txt");
        assertTrue(file.exists());
 
    }
	
}
