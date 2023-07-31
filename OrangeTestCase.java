package DemoPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class OrangeTestCase {
   
	public static void main(String args[]) throws InterruptedException  {
		WebDriver driver;	
		System.setProperty("webdriver.gecko.driver", "E:\\jarfiles\\geckodriver.exe");
		driver=new  FirefoxDriver();		
	     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		Thread.sleep(6000);
		OrangeLogin.txtUn(driver).sendKeys("Admin");
		OrangeLogin.txtpwd(driver).sendKeys("Admin123");
		OrangeLogin.btnlogin(driver).click();
		OrangeLogin.lnkForgetpswd(driver).click();
		
	}

}
