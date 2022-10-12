package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _04_CitizenshipSteps {
    LeftNav ln= new LeftNav();
    DialogContent dc = new DialogContent();

    @And("Navigate to Citizenship page")
    public void navigateToCitizenshipPage() {

        ln.findAndClick("SetupOne");
        ln.findAndClick("Parameters");
        ln.findAndClick("Citizenships");
    }

    @When("User a Citizenship name as {string} short name as {string}")
    public void userACitizenshipNameAsShortNameAs(String name, String shortname) {

        dc.findAndClick("addButton");
        dc.findAndSend("nameInput",name);
        dc.findAndSend("shortname",shortname);
        dc.findAndClick("saveButton");

    }

    @Then("Already exist message should be displayed")
    public void alreadyExistMessageShouldBeDisplayed() {

        dc.findAndContainsText("alreadyExists","already exists");
    }

    @And("Click on close button")
    public void clickOnCloseButton() {

        dc.findAndClick("closeDialog");
    }

    @When("User delete the {string} record")
    public void userDeleteThe(String arg0) {

        dc.searchAndDelete(arg0);
    }
}
