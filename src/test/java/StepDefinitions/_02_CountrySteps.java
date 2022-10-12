package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.utility.RandomString;
import org.apache.commons.lang3.RandomStringUtils;

public class _02_CountrySteps {
    LeftNav ln= new LeftNav();
    DialogContent dc = new DialogContent();



    @And("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {

        dc.findAndContainsText("SuccessDialog","success");

    }

    @When("Create a country name as {string} code as {string}")
    public void createACountryNameAsCodeAs(String name, String code) {

        dc.findAndClick("addButton");
        dc.findAndSend("nameInput",name);
        dc.findAndSend("codeInput",code);
        dc.findAndClick("saveButton");


    }


    @When("Create a country")
    public void createCountry() {

        String randomGenName = RandomStringUtils.randomAlphabetic(8);
        String randomGenCode = RandomStringUtils.randomAlphabetic(4);
        dc.findAndClick("addButton");
        dc.findAndSend("nameInput",randomGenName);
        dc.findAndSend("codeInput",randomGenCode);
        dc.findAndClick("saveButton");

    }

    @Given("Go to country page")
    public void goToCountryPage() {

        ln.findAndClick("SetupOne");
        ln.findAndClick("Parameters");
        ln.findAndClick("Countries");
    }
}
