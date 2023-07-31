package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeLoginDemo {
	
	WebDriver driver;
	
	@Given("Open Orangehrm Application")
	public void open_orangehrm_application() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\jarfiles\\geckodriver.exe");
		driver=new  FirefoxDriver();		
	     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	     Thread.sleep(8000);
	   
	}

	@When("User enter valid {string} and valid {string}")
	public void user_enter_valid_and_valid(String username, String password) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("username");
		driver.findElement(By.name("password")).sendKeys(password);
		 Thread.sleep(5000);
		

	    
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
		
	   
	
	@Then("User should get access of Application")
	public void user_should_get_access_of_application() {

		String exptext = "OrangeHRM";
		String actTitle =driver.getTitle();
		
		if(actTitle.equalsIgnoreCase(exptext))
		{
			System.out.println("test case pass");
		}
		else
		{
			System.out.println("test case fail");
		}
		
	  
	    
	}

}
///  //html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input
//input name username
//input name password
//button type submit