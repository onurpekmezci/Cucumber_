package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.awt.*;
import java.util.List;

public class EmployeeSteps {

    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();
    FormContent fc = new FormContent();
    @And("Got to Employee functionality")
    public void gotToEmployeeFunctionality(DataTable elements) {
        List<String> Listelements = elements.asList(String.class);
        for (int i = 0; i < Listelements.size(); i++) {
            ln.findAndClick(Listelements.get(i));
        }

    }

    @And("Click AddButton")
    public void clickAddButton(DataTable elements) {

        List<String> Listelements = elements.asList(String.class);
        for (int i = 0; i < Listelements.size(); i++) {
            dc.findAndClick(Listelements.get(i));
        }
    }

    @And("Send information for textcontent")
    public void sendInformationForTextcontent(DataTable elements) {

        List<List<String>> listelements = elements.asLists(String.class);

        for (int i = 0; i < listelements.size(); i++) {
            dc.findAndSend(listelements.get(i).get(0), listelements.get(i).get(1));
        }
    }

    @And("Send information for selectcontent")
    public void sendInformationForSelectcontent(DataTable elements) throws AWTException {

        List<String> Listelements = elements.asList(String.class);
        for (int i = 0; i < Listelements.size(); i++) {
            fc.findAndClick(Listelements.get(i));
        }
    }

    @And("Click Save Button")
    public void clickSaveButton(DataTable elements) {
        List<String> Listelements = elements.asList(String.class);
        for (int i = 0; i < Listelements.size(); i++) {
            dc.findAndClick(Listelements.get(i));
        }
    }

    @And("Click to contact and address")
    public void clickToContactAndAddress(DataTable elements) {
        List<String> Listelements = elements.asList(String.class);
        for (int i = 0; i < Listelements.size(); i++) {
            dc.findAndClick(Listelements.get(i));
        }

    }

    @And("verify succesfully added address")
    public void verifySuccesfullyAddedAddress() {


    }
}
