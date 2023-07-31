//////-----page object-----------/////////

package DemoPOM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class OrangeLogin {
	private static WebElement ele;
	
	public static WebElement txtUn(WebDriver driver) {
	    ele = driver.findElement(By.xpath("//input[@name='username']"));
		return ele;
	}
	
	public static WebElement txtpwd(WebDriver driver) {
	    ele = driver.findElement(By.xpath("//input[@name='password']"));
		return ele;
	}
	
	public static WebElement btnlogin(WebDriver driver) {
		ele = driver.findElement(By.xpath("//button[@type='submit']"));
		return ele;
	}
			
	public static WebElement lnkForgetpswd(WebDriver driver) {
		ele = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"));
		return ele;
		
	}

}
