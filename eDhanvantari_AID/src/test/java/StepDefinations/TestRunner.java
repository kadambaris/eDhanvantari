package StepDefinations;


import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/Features/login.feature", 
glue={"StepDefinations"})
public class TestRunner {

}
