package Pages;

import Utilities.GWD;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(GWD.getdriver(), this);
    }
//        id="mat-input-0"
//
//        id="mat-input-1"
//
//        aria-label="LOGIN"
//
//        class="mat-focus-indicator submit-button mat-button mat-flat-button mat-button-base mat-accent"

    //Dashboard
    @FindBy(id = "mat-input-0")
    private WebElement Username;

    @FindBy(id = "mat-input-1")
    private WebElement Password;

    @FindBy(css = "button[aria-label=\"LOGIN\"]")
    private WebElement LoginButton;

    @FindBy(css = "[class=\"consent-give\"]")
    private WebElement acceptcookies;
    @FindBy(xpath = "(//span[contains(text(),'Dashboard')])[2]")
    private WebElement Dashboard;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button") //
    private WebElement AddButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement SuccessDialog;
    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    private WebElement alreadyExists;
    @FindBy(css = "[formcontrolname=\"name\"]>input")
    private WebElement nameInput;

    @FindBy(css = "[formcontrolname=\"shortName\"]>input")
    private WebElement shortname;

    @FindBy(css = "[formcontrolname=\"code\"]>input")
    private WebElement codeInput;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;
    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    private WebElement closeDialog;


    @FindBy(xpath = "(//div[contains(@class,'mat-form-field-infix ng-tns-c74')]//input)[1]\n")
    private WebElement searchInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteDialogBtn;

    @FindBy(css = "[formcontrolname=\"budgetAccountIntegrationCode\"]>input")
    private WebElement IntegrationcodeInput;

    @FindBy(css = "[formcontrolname=\"priority\"]>input")
    private WebElement PriorityInput;

    @FindBy(css = "[formcontrolname=\"firstName\"]>input")
    private WebElement firstName;

    @FindBy(css = "[formcontrolname=\"lastName\"]>input")
    private WebElement lastName;

    @FindBy(css = "[formcontrolname=\"employeeId\"]")
    private WebElement employeeId;

    @FindBy(xpath = "//input[@formcontrolname=\"documentNumber\"]")
    private WebElement DocumentID;

    @FindBy(xpath = "//div[text()='Contact & Address']")
    private WebElement contact_Address;

    @FindBy(xpath = "//input[@formcontrolname=\"country\"]")
    private WebElement Country;

    @FindBy(xpath = "//tbody//tr//td[2]")
    public List<WebElement> NameList;

    @FindBy(xpath = "(//div[contains(@class,\"autocomplete\")]//span)[2]")
    private WebElement countrySelect;
    private WebElement myElement;

    public void findAndSend(String strelement, String value) {

        switch (strelement) {

            case "username":
                myElement = Username;
                break;
            case "password":
                myElement = Password;
                break;
            case "nameInput":
                myElement = nameInput;
                break;
            case "codeInput":
                myElement = codeInput;
                break;
            case "shortname":
                myElement = shortname;
                break;
            case "searchText":
                myElement = searchInput;
                break;
            case "IntegrationcodeInput":
                myElement = IntegrationcodeInput;
                break;
            case "PriorityInput":
                myElement = PriorityInput;
                break;
            case "firstName":
                myElement = firstName;
                break;
            case "lastName":
                myElement = lastName;
                break;
            case "employeeID":
                myElement = employeeId;
                break;
            case "documentID":
                myElement = DocumentID;
                break;
            case "Country":
                myElement = Country;
                break;
        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strelement) {

        switch (strelement) {

            case "LoginButton":
                myElement = LoginButton;
                break;
            case "addButton":
                myElement = AddButton;
                break;
            case "saveButton":
                myElement = saveButton;
                break;
            case "closeDialog":
                myElement = closeDialog;
                break;
            case "searchButton":
                myElement = searchButton;
                break;
            case "deleteButton":
                myElement = deleteButton;
                break;
            case "submitDeleteButton":
                myElement = deleteDialogBtn;
                break;
            case "AcceptCookies":
                if (myElement==acceptcookies && acceptcookies.isDisplayed()){
                myElement = acceptcookies;
                break;}
            case "contact_Address":
                myElement = contact_Address;
                break;
            case "countrySelect":
                myElement = countrySelect;
                break;
        }


        clickFunction(myElement);

    }


    public void findAndContainsText(String strelement, String text) {

        switch (strelement) {

            case "Dashboard":
                myElement = Dashboard;
                break;
            case "SuccessDialog":
                myElement = SuccessDialog;
                break;
            case "alreadyExists":
                myElement = alreadyExists;
                break;
        }

        VerifyContainsText(myElement, text);
    }

    public void searchAndDelete(String searchText) {

//        JavascriptExecutor js = (JavascriptExecutor) GWD.getdriver();
//        js.executeScript(" document.body.scrollTop = 0; ");

        findAndSend("searchText", searchText);
        findAndClick("searchButton");
        //waitUntilLoading();
        WebDriverWait wait=new WebDriverWait(GWD.getdriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.textToBe(By.cssSelector("div[fxlayoutalign='center center'][class='control-full']"),"Search"));

        findAndClick("deleteButton");
        findAndClick("submitDeleteButton");
    }

}
