package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.awt.*;
import java.util.List;

public class _05_DataTableSteps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();
    FormContent fc = new FormContent();

    @And("Click on the element in the left nav")
    public void clickOnTheElementInTheLeftNav(DataTable elements) {

        List<String> listelements = elements.asList(String.class);

        for (int i = 0; i < listelements.size(); i++) {

            ln.findAndClick(listelements.get(i));
        }
    }

    @And("Click on te element in the Dialog")
    public void clickOnTeElementInTheDialog(DataTable elements) {


        List<String> listelements = elements.asList(String.class);

        for (int i = 0; i < listelements.size(); i++) {

            dc.findAndClick(listelements.get(i));
        }
    }


    @And("User sending the keys in Dialog Content")
    public void userSendingTheKeysInDialogContent(DataTable elements) {

        List<List<String>> listelements = elements.asLists(String.class);

        for (int i = 0; i < listelements.size(); i++) {
            dc.findAndSend(listelements.get(i).get(0), listelements.get(i).get(1));
        }
    }

    @And("User delete item from dialog")
    public void userDeleteItemFromDialog(DataTable element) {

        List<String> listelements = element.asList(String.class);

        for (int i = 0; i < listelements.size(); i++) {

            dc.searchAndDelete(listelements.get(i));
        }
    }


    @And("User sending the keys in Form Content")
    public void userSendingTheKeysInFormContent(DataTable elements) {

        List<List<String>> listElements = elements.asLists(String.class);

        for (int i = 0; i < listElements.size(); i++) {

            dc.findAndSend(listElements.get(i).get(0),listElements.get(i).get(1));
        }

    }


    @And("Click on the element in the Dialog")
    public void clickOnTheElementInTheDialog(DataTable elements) {

        List<String> listElements = elements.asList(String.class);

        for (int i = 0; i < listElements.size(); i++) {

            dc.findAndClick(listElements.get(i));
        }
    }


}
