package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/java/FeatureFiles/"}, // featureların path'i tanımlanır
        glue = {"StepDefinitions"}   // stepdefinitionların klasörü yazılır   "StepDefinition"





)
public class _03_TestRunnerAll extends AbstractTestNGCucumberTests {


}
