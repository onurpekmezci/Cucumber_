package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//hangi senaryolarda bu etiket varsa onlar çalıştırılacak// featureların path'i tanımlanır // stepdefinitionların klasörü yazılır   "StepDefinition"
@CucumberOptions(
        tags = "@Smoketest",
        features = {"src/test/java/FeatureFiles/"},
        glue = {"StepDefinitions"} ,
        plugin= {"html:target//cucumber-reports.html"}




)
public class _04_SmokeTest extends AbstractTestNGCucumberTests {


}
