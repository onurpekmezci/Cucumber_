package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.InputEvent;
import java.time.Duration;
import java.util.List;

public class FormContent extends Parent {
    public FormContent() {
        PageFactory.initElements(GWD.getdriver(), this);
    }
    DialogContent dc = new DialogContent();
    @FindBy(xpath = "(//mat-select)[1]")
    private WebElement academicPeriod;

    @FindBy(xpath = "(//mat-option//span)[1]")
    private WebElement academicPeriod1;

    @FindBy(xpath = "(//mat-select)[2]")
    private WebElement gradeLevel;

   @FindBy(xpath = "(//span[@class='mat-option-text'])[3]")
   private WebElement gradeLevel2;

    @FindBy(xpath = "(//div[contains(@class,\"mat-select-arrow-wrapper\")])[2]")
    private WebElement EmployeeTypeButton;

    @FindBy(xpath = "//mat-option//span[contains(text(),'Supervisor')]")
    private WebElement Supervisor;

    @FindBy(xpath = "(//div[contains(@class,\"mat-select-arrow-wrapper\")])[6]")
    private WebElement DocumentTypeButton;

    @FindBy(xpath = "//mat-option//span[contains(text(),'Personal')]")
    private WebElement Personal;

    private WebElement myElement;

    public void findAndClick(String strelement) throws AWTException {

        switch (strelement) {

            case "academicPeriod":
                myElement = academicPeriod;
                break;
            case "academicPeriod1":
                myElement = academicPeriod1;
                break;
            case "gradeLevel":
                myElement = gradeLevel;
                break;
            case "gradeLevel2":
                myElement = gradeLevel2;
                break;
            case "EmployeeTypeButton":
                myElement = EmployeeTypeButton;
                break;
            case "Supervisor":
                myElement = Supervisor;
                break;
            case "DocumentTypeButton":
                myElement = DocumentTypeButton;
                break;
            case "Personal":
                myElement = Personal;
                break;
        }

        if (myElement==DocumentTypeButton)
        {
//            Robot rb = new Robot();
//            rb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//            rb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Actions act= new Actions(GWD.getdriver());
            act.moveToElement(DocumentTypeButton).click().build().perform();

        }

        clickFunction(myElement);



    }

}
