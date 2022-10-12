package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import io.cucumber.java.en.And;

public class _06_EntranceExamSteps {

    DialogContent dc = new DialogContent();
    @And("User delete {string} items from dialog")
    public void userDeleteItemsFromDialog(String arg0) {
                dc.searchAndDelete(arg0);
    }
}
