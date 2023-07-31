////-----USED FOR GROUP------/////////

package testNg;

import org.testng.annotations.Test;

public class DemoXmlClass {
  @Test(groups= {"Smoke Test"})
  public void f() {
	  System.out.println("This is xml class file");
  }
}
