package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions (features="C:\\Users\\Brigosha_Guest\\Desktop\\NewEclipse\\Automation\\src\\test\\java\\my_Features\\LoginValidation.feature",
                   glue="my_Features",dryRun=false,
                   monochrome=true)
public class TestRunner {
  
}
