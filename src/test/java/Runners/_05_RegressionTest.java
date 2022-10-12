package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@Regression or @SmokeTest", //or herhangi biri olduğunda çalıştırır // and her ikisi olan senaryoları çalıştırır.
        features = {"src/test/java/FeatureFiles/"}, // featureların path'i tanımlanır
        glue = {"StepDefinitions"}   // stepdefinitionların klasörü yazılır   "StepDefinition"





)
public class _05_RegressionTest extends AbstractTestNGCucumberTests {

//browser tipi vermek için
    //rapora ek parametre için


}
