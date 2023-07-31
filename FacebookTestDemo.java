package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookTestDemo {
	WebDriver driver;
	
	///////---------1st scenario-------///////
	
	@Given("Open Facebook application")
	public void open_facebook_application() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\jarfiles\\geckodriver.exe");
		driver=new  FirefoxDriver();		
	     driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjc0ODE2MDI5LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
	     Thread.sleep(1000);
	}
	
	@When("I enter valid {string} and valid {string}")
	public void i_enter_valid_and_valid(String username, String password) {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);
		
	    
	}
	@When("I click on Login button")
	public void i_click_on_login_button() {
		driver.findElement(By.name("login")).click();
	   
	}
	@Then("I should get access of application")
	public void i_should_get_access_of_application() {
		
		String exptext = "Log in to Facebook";
		String actTitle =driver.getTitle();
		
		if(actTitle.equalsIgnoreCase(exptext))
		{
			System.out.println("test case pass");
		}
		else
		{
			System.out.println("test case fail");
		}
		
	   System.out.println("-------1st scenario complete-----"); 
	}
	
	////////--------2nd scenario--------/////////

	@When("I enter invalid {string} and invalid {string}")
	public void i_enter_invalid_and_invalid(String un, String pw) {
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.name("pass")).sendKeys(pw);
	    
	}

	@When("click on button")
	public void click_on_button() {
		driver.findElement(By.name("login")).click();
	   
	}

	@Then("I should not get access of application")
	public void i_should_not_get_access_of_application() {
		String exptext = "Log in to Facebook";
		String acttext =driver.getTitle();
		
		if(acttext.equalsIgnoreCase(exptext))
		{
			System.out.println("test case pass");
		}
		else
		{
			System.out.println("test case fail");
		}
	   
	}


}

//   https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjc0ODE2MDI5LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D
// input id  email
// input id pass
// button id loginbutton
