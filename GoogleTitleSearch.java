package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class GoogleTitleSearch {
	WebDriver driver;
	String acttitle=null;
	
	///--------1st scenario---------/////
	@Given("I Open Google Application")
	public void i_open_google_application() {
		System.setProperty("webdriver.gecko.driver", "E:\\jarfiles\\geckodriver.exe");
		driver=new  FirefoxDriver();		
	     driver.get("http://www.google.com/");	
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
	}

	@When("I Capture Title")
	public void i_capture_title() {
		acttitle=driver.getTitle();
	   System.out.println("Title of the page is "+acttitle);
	}

	@Then("I should Get Valid Title As Google")
	public void i_should_get_valid_title_as_google() {
		
		String exctitle = "Google";	
		Assert.assertEquals(acttitle, exctitle);
		driver.close();
	   
	}

	
//////--------2nd scenario-------------///////
	@Given("open google application")
	public void open_google_application() {
		System.setProperty("webdriver.gecko.driver", "E:\\jarfiles\\geckodriver.exe");
		driver=new  FirefoxDriver();		
	     driver.get("http://www.google.com/");	
	   
	}

	@When("I search valid keyword and go for search")
	public void i_search_valid_keyword_and_go_for_search() {
		String acttitle = driver.getTitle();
		   System.out.println("Title of the page is "+acttitle);
		   driver.findElement(By.xpath("//input[@type='search')]")).sendKeys("selenium",Keys.ENTER);
		
	   
	}

	@Then("I should get a valid search result")
	public void i_should_get_a_valid_search_result() {
		String exptext = "selenium";
		String acttext =driver.getPageSource();
		System.out.println(exptext);
		if(acttext.contains(exptext))
		{
			System.out.println("test case pass");
		}
		else
		{
			System.out.println("test case fail");
		}
		driver.close();
	    
	}


}

//fake-editable
