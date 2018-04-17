package dmst.seip.nafsikalampr.unit_testing;

import org.junit.Test;
import static org.mockito.Mockito.*;

/**
* class uses mocking to test MyArrayOperations
*/

public class MyArrayOperationsTest {
	
	MyArrayOperations mao;
	
	/**
	* class constructor
	*/
	
	public MyArrayOperationsTest() {
		this.mao= new MyArrayOperations();
	}
	
	/**
	* Test that mocks and predifines the results of MyArrayOp
	*/
	
	@Test
	public void testMyArrayOpMock(){
	    MyArrayOperations mao=mock(MyArrayOperations.class);
	    //pre-define gradeFrequencies result
	    when( mao.gradeFrequencies("src/test/resources/grades.txt", null)).thenReturn(new int[] {1,1,1,1,2,1});
	    //call gradeFrequencies() for the mocked instance
	    Assert.assertArrayEquals(new int[] {1,1,1,1,2,1}, mao.gradeFrequencies("src/test/resources/grades.txt", null));
	}
}
