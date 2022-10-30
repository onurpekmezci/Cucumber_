package StepDefinitions;

import Pages.DialogContent;
import Utilities.ExcelUtility;
import Utilities.GWD;
import com.aventstack.extentreports.service.ExtentTestManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Hooks {

    DialogContent dialog = new DialogContent();
    @Before
    public void before()
    {
        System.out.println("Senaryo Başladı.");

    }

    @After
    public void after(Scenario scenario) throws IOException {
        System.out.println("Senaryo Bitti");
        System.out.println("scenario sonucu=" + scenario.getStatus());
        System.out.println("scenario isFailed ?=" + scenario.isFailed());

        //TODO excele sonuçları yazdıracağız, scenario - browsertipi,zaman


        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yy");

        ExcelUtility.setexcel("src/test/java/ApachePOI/resource/Scenariostatus.xlsx",scenario,GWD.threadBrowserName.get(),date.format(formatter));
        if (scenario.isFailed()) {
            // klasöre
            TakesScreenshot screenshot = (TakesScreenshot) GWD.getdriver();
            File ekranDosyasi = screenshot.getScreenshotAs(OutputType.FILE);

            //extend reporta screen ekliyor
            ExtentTestManager.getTest().addScreenCaptureFromBase64String(getBase64Screenshot());

            try {
                FileUtils.copyFile(ekranDosyasi,
                        new File("target/FailedScreenShots/" + scenario.getId() + date.format(formatter) + ".png"));

            } catch (IOException e) {
                e.printStackTrace();
            }


            GWD.quitDriver();
        }
    }

    public String getBase64Screenshot()
    {
        return ((TakesScreenshot) GWD.getdriver()).getScreenshotAs(OutputType.BASE64);
    }


}
