package StepDefinitions;

import Pages.DialogContent;
import Utilities.DBUtility;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class _11_JDBCSteps {
    @Then("Send the query the database {string} an control match")
    public void sendTheQueryTheDatabaseAnControlMatch(String sorgu) {

        List<List<String>> dblist = DBUtility.getListData(sorgu);

        DialogContent dc = new DialogContent();
        List<WebElement> uilist = dc.WaitUntilVisibleAllElement(dc.NameList);
        for (WebElement e: uilist
             ) {
            System.out.println(e.getText());
        }

        for (int i = 0; i < dblist.size(); i++) {

            Assert.assertEquals(dblist.get(i).get(1),uilist.get(i).getText(),"Hatalı durum");
        }
    }
}
