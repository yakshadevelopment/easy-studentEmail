package java8.easy.studentEmail;

import static org.junit.Assert.*;

import org.junit.Test;
import static java8.easy.studentEmail.TestUtils.*
;public class MainTest {

	@Test
	public void testCreateEmailAccount() throws Exception {
		String name1="Stella Frank";
		String name2="Loren Mary Joseph";
		yakshaAssert(currentTest(),Main.createEmailAccount(name1).equals("stella.frank@tsr.edu")?"true":"false",businessTestFile);
		yakshaAssert(currentTest(),Main.createEmailAccount(name2).equals("loren.mary.joseph@tsr.edu")?"true":"false",businessTestFile);
	}
	@Test
    public void testExceptionConditon() throws Exception{
	 yakshaAssert(currentTest(),true,boundaryTestFile);
      }

	@Test
	public void testBoundaryCondition() throws Exception {
	  yakshaAssert(currentTest(),true,exceptionTestFile);
   }



}
