package stepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationTestDemo {
	WebDriver driver;
	
	@Given("User is on registration page")
	public void user_is_on_registration_page() {
		System.setProperty("webdriver.gecko.driver", "E:\\jarfiles\\geckodriver.exe");
		driver=new  FirefoxDriver();		
	     driver.get("https://demo.automationtesting.in/Register.html");	
	     System.out.println("in given");
	    
	}

	@When("User enters following details")
	public void user_enters_following_details(DataTable dtTable) {
		//List<List<String>> Userlist = dtTable.asLists(String.class);
		//System.out.println(Userlist);
		//int listlen = Userlist.size();
		//for(int i=0;i<listlen;i++)
			
		/*{
			driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys(Userlist.get(i).get(0));
			driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys(Userlist.get(i).get(1));
			driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys(Userlist.get(i).get(2));
			driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys(Userlist.get(i).get(3));
			driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys(Userlist.get(i).get(4));
			//driver.navigate().refresh();
		}*/
		
		List<Map<String, String>> usermap = dtTable.asMaps(String.class,String.class);
		System.out.println(usermap);
		for(Map<String, String> i :usermap)
		{
			driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys(i.get("fname"));
			driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys(i.get("lname"));
			driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys(i.get("email"));
			driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys(i.get("Phone"));
			driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys(i.get("location"));
			driver.navigate().refresh();
		}
		
	  
	}

	@Then("User registration should be successful")
	public void user_registration_should_be_successful() {
		System.out.println("registration done");
	   
	}

}


