package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@Regression",
        features = {"src/test/java/FeatureFiles/"},
        glue = {"StepDefinitions"} ,
       // plugin= {"html:target//cucumber-reports.html"}
        plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"} // jenkins için düzenleme




)
public class _06_TestrunnerRegressionWithPlugin extends AbstractTestNGCucumberTests {
}
