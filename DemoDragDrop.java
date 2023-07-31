package firstproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoDragDrop {

	public static void main(String[] args) {
		WebDriver driver;	
		System.setProperty("webdriver.gecko.driver", "E:\\jarfiles\\geckodriver.exe");
		driver=new  FirefoxDriver();		
	     driver.get("https://jqueryui.com/droppable/");	
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions act=new Actions(driver);
		driver.switchTo().frame(0);				//frame(0) for first html page
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
	    //act.dragAndDrop(drag, drop).perform();
	  //  act.dragAndDropBy(drag, 165,165).perform();
	     // act.clickAndHold(drag).perform();
	    //act.release(drop).perform();
		//act.moveByOffset(165,165).perform();
		act.doubleClick(drag);
		
	}

}
