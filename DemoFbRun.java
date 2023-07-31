package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

public class DemoFbRun {
	@RunWith(Cucumber.class)
	@CucumberOptions(features = {"E:\\seleniumassignment\\cucum\\Feature\\FacebookTast.feature"},glue = {"stepDefinition"})
	public class DemoTestLoginRunner {


}
}
