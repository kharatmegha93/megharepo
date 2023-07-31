package DemoPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class DemoPageFactory {

	
   ////------ USE MAIN METHOD FOR JAVA FILE EXECUTION---//////
//	public static void main(String[] args) {
//	WebDriver driver;
//	System.setProperty("webdriver.gecko.driver", "E:\\jarfiles\\geckodriver.exe");
//	driver=new  FirefoxDriver();		
//     driver.get("https://mail.rediff.com/cgi-bin/login.cgi");	
//     LoginRediff lr = new LoginRediff(driver);
//     lr.loginToRediff();
//	
//	}
	
	////-------USE ANOTHER METHOD FOR TESTNG SINGLE TEST,BCOZ MAIN METHOD DOES NOT TAKE @TEST ANNOTATION--///
	@Test
	public void rediff() {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "E:\\jarfiles\\geckodriver.exe");
		driver=new  FirefoxDriver();		
	     driver.get("https://mail.rediff.com/cgi-bin/login.cgi");	
	     LoginRediff lr = new LoginRediff(driver);
	     lr.loginToRediff();
		
	

}
}
