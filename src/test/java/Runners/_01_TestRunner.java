package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/java/FeatureFiles/_01_Login.feature"}, // featureların path'i tanımlanır
        glue = {"StepDefinitions"}   // stepdefinitionların klasörü yazılır   "StepDefinition"





)
public class _01_TestRunner extends AbstractTestNGCucumberTests {


}
