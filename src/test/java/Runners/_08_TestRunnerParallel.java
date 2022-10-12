package Runners;

import Utilities.GWD;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        tags = "@Smoketest",
        features = {"src/test/java/FeatureFiles/"},
        glue = {"StepDefinitions"}



)
public class _08_TestRunnerParallel extends AbstractTestNGCucumberTests {

    @BeforeClass
    @Parameters("browser")
    public void beforeclass(String browser) {
        GWD.threadBrowserName.set(browser);
// bu thread e browser name set adildi.

    }

//    TODO : 1- son adımda hata verince kapatmadı. ve rapor oluşturmadı
//    not: hata vermeyince düzgün kapattı ve rapor oluştur.
//
//       2- Extend Report ve masterthought raporların oluşması
}
