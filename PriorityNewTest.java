package testNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class PriorityNewTest {
  @Test(priority=2)
  public void  Login() { 
	  System.out.println("i am in Login");
  }
  @Test(priority=1)
  public void  Registration() { 
	  System.out.println("i am in Registration");
  }
  @Test(priority=3)
  public void   ComposeMail() { 
	  System.out.println("i am in  ComposeMail");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("i am in beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("i am in afterTest");
  }

}
