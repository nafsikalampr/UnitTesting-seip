package dmst.seip.nafsikalampr.unit_testing;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
* class is used to group test classes
* it is holder the @RunWith and @Suite
*/

@RunWith(Suite.class)
@Suite.SuiteClasses({MyMathTest.class, MyMathTest_ReverseNumber_Parameterized.class})

/**
* class remains empty 
*/
public class MyTestSuite {
   
}
