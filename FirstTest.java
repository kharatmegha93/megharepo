package testNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class FirstTest {
  @Test
  public void f() {
	  System.out.println("i am in test f");
  }
  public void f1() {
	  System.out.println("i am in test f1");
  }
  public void f2() {
	  System.out.println("i am in test f2");
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("i am in before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("i am in after test");
  }

}
