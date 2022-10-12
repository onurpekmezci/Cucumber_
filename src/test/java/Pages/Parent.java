package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Parent {

    public void sendKeysFunction(WebElement element, String Value) {
        // bekleme

        WaitUntilVisible(element);
        // elemente kadar kaydırma yap
        scrollToElement(element);
        // kutu temizleme
        element.clear();
        //değer yolla
        element.sendKeys(Value);

    }

    public void clickFunction(WebElement element) {

        WaitUntilClickable(element);
        // elemente kadar kaydırma yap
        scrollToElement(element);
        //click yolla
        element.click();
    }

    public void WaitUntilVisible(WebElement element) {

        WebDriverWait wait = new WebDriverWait(GWD.getdriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));

    }

    public void WaitUntilClickable(WebElement element) {

        WebDriverWait wait = new WebDriverWait(GWD.getdriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }

    public void scrollToElement(WebElement element) {

        JavascriptExecutor js = (JavascriptExecutor) GWD.getdriver();
        js.executeScript("arguments[0].scrollIntoView();", element);

        GWD.getdriver().switchTo().window(GWD.getdriver().getWindowHandle());
    }

    public void VerifyContainsText(WebElement element, String text) {
        WaitUntilVisible(element);
        Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));

    }

    public void waitUntilLoading() {
        WebDriverWait wait = new WebDriverWait(GWD.getdriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("fuse-progress-bar > *"), 0));
    }

    public List<WebElement> WaitUntilVisibleAllElement(List<WebElement> elementList) {

        WebDriverWait wait = new WebDriverWait(GWD.getdriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfAllElements(elementList));

        return elementList;
    }
}
