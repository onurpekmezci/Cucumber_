package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.ExcelUtility;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class _10_ApachePOISteps  {

    LeftNav ln= new LeftNav();
    DialogContent dc = new DialogContent();
    @When("User Create citizenship with ApachePOI")
    public void userCreateCitizenshipWithApachePOI() throws IOException {

        ArrayList<ArrayList<String>> tablo = ExcelUtility.getListData("src/test/java/ApachePOI/resource/ApacheExcel2.xlsx","testCitizen", 2);


        for (ArrayList<String> item: tablo
             ) {
            dc.findAndClick("addButton");
            dc.findAndSend("nameInput",item.get(0));
            dc.findAndSend("shortname", item.get(1));
            dc.findAndClick("saveButton");
            dc.findAndContainsText("SuccessDialog","success");
        }



    }

    @Then("User Delete citizenship with ApachePOI")
    public void userDeleteCitizenshipWithApachePOI() {
        ArrayList<ArrayList<String>> tablo = ExcelUtility.getListData("src/test/java/ApachePOI/resource/ApacheExcel2.xlsx","testCitizen", 1);


        for (ArrayList<String> item: tablo
        ) {

            dc.searchAndDelete( item.get(0));
            dc.findAndContainsText("SuccessDialog","success");
        }


    }
}
