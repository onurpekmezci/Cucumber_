package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _01_LoginSteps {

    DialogContent dialog = new DialogContent();
    WebDriverWait wait = new WebDriverWait(GWD.getdriver(), Duration.ofSeconds(30));

    @Given("Navigate to basqar")
    public void navigateToBasqar() {
       // System.out.println("Merhaba 11");

        GWD.getdriver().get("https://demo.mersys.io/");
        GWD.getdriver().manage().window().maximize();
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {

        dialog.findAndSend("username", "richfield.edu");
        dialog.findAndSend("password", "Richfield2020!");
        dialog.findAndClick("LoginButton");
      //  dialog.findAndClick("AcceptCookies");
    }

    @Then("User should login successfuly")
    public void userShouldLoginSuccessfuly() {

        dialog.findAndContainsText("Dashboard","Dashboard");
    }
}
