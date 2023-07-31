package DemoPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginRediff {
	WebDriver driver;
	
	@FindBy(how = How.XPATH,using = "//input[@id='login1']")
	WebElement txtUserName;
	
	@FindBy(how = How.ID,using = "password")
	WebElement txtPassword;
	
	@FindBy(how = How.LINK_TEXT,using = "Forgot Password?")
	WebElement lnkForgetPwd;
	
	@FindBy(how = How.CSS,using = "input.signinbtn")
	WebElement btnSign;
	
	@FindBy(how = How.NAME,using = "remember")
	WebElement chkRemember;
	
	@FindBy(how = How.XPATH,using = "//em[@id='eyeicon']")
	WebElement shwPsd;

	LoginRediff(WebDriver d)
	{
		this.driver=d;
		PageFactory.initElements(d, this);
	}
	@Test
	public void loginToRediff()
	{
		txtUserName.sendKeys("seed");
		txtPassword.sendKeys("seed123");
		shwPsd.click();
		btnSign.click();
		chkRemember.click();
		lnkForgetPwd.click();		
				
	}	
	
} 
