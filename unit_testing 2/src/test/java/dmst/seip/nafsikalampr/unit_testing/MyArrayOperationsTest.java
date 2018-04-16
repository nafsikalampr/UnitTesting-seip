package dmst.seip.nafsikalampr.unit_testing;

import org.junit.Test;
import static org.mockito.Mockito.*;


public class MyArrayOperationsTest {
	
	MyArrayOperations mao;
	
	public MyArrayOperationsTest() {
		this.mao= new MyArrayOperations();
	}
	
	//mocking with specific txt
	@Test
	public void testMyArrayOpMock(){
	 MyFileUtilities mfu =  mock(MyFileUtilities.class);
	 when( mao.gradeFrequencies("src/test/resources/grades.txt", null)).thenReturn(new int[] {1,1,1,1,2,1});
	 int[] testnum = {1,1,1,1,2,1};
	 assertArrayEquals(testnum, mao.gradeFrequencies("src/test/resources/grades.txt", mfu));
	}
}
