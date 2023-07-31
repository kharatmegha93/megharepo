package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"E:\\seleniumassignment\\cucum\\Feature\\DemoCucumber.feature"},glue = {"stepDefinition"})
public class DemoTestLoginRunner {

}
