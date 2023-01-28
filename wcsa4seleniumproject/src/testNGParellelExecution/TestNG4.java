package testNGParellelExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG4 {
	@Test
	  public void today() {
		  
		  long threadId = Thread.currentThread().getId();
		  Reporter.log("today method"+threadId+" is the thread",true);
	  }
	  
	  @Test
	  public void tomorrow()
	  {
		  long threadId = Thread.currentThread().getId();
		  Reporter.log("tomorrow method"+threadId+" is the thread",true);
	  }
	  
}
