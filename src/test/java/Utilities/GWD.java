package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GWD {

    private static WebDriver driver;

    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
    public static ThreadLocal<String> threadBrowserName = new ThreadLocal<>();

    public static WebDriver getdriver() {

        //Bana neler lazım:  1 browser tipi lazım burada ona göre oluşturucam
        // her bir paralel çalışan süreç için sadece o sürece özel static bir değişken lazım
        // çünkü runner classdaki işaret edilen tüm senaryolarda aynısını çalışması lazım.
        // demekki her pipeline için (Local) ve de ona özel static bir drivera ihtiyacım var
        //donanımdaki adı pipeline , yazılımdaki adı Thread , paralel çalışan her bir süreç
        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");
        Logger.getLogger("").setLevel(Level.SEVERE);
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "Error");

        if (threadBrowserName.get()==null)  /// paralel çalışmayan yani xml den çalışmayan testler için genel olarak çalıştırma
            threadBrowserName.set("chrome");

        if (threadDriver.get() == null) {

            String browsername = threadBrowserName.get(); // bu threadteki browsername i verdi.


            switch (browsername) {
                case "chrome":
                    System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

                    threadDriver.set(new ChromeDriver());
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    threadDriver.set(new FirefoxDriver());
                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    threadDriver.set(new SafariDriver());
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    threadDriver.set(new EdgeDriver());
                    break;

            }

        }

        return threadDriver.get();
    }

    public static void quitdriver() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (threadDriver.get() != null) {

            threadDriver.get().quit();
            WebDriver drv = threadDriver.get();
            drv = null;
            threadDriver.set(drv);
        }

    }

    public static void Bekle(int saniye) {
        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
