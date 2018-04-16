package dmst.seip.nafsikalampr.unit_testing;

import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class MyFileUtilitiesTest {
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	//testing class has found the txt
	@Test
    public void testReadFileWithClassLoader(){
        File file = new File("src/test/resources/grades.txt");
        assertTrue(file.exists());
 
    }
	
}