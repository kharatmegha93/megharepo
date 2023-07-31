package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

public class DemoOrngRunner {
	@RunWith(Cucumber.class)
	@CucumberOptions(features = {"E:\\seleniumassignment\\cucum\\Feature\\OrangeLogin.feature"},glue = {"stepDefinition"})
	public class DemoTestLoginRunner {


}
}
