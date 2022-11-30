package stepDefinitions.UIStepDefs.Lokman;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.LokmanPage;

import utilities.Driver;
import utilities.ReusableMethods;

public class US14_TC03_StepDefs {
    LokmanPage pages=new LokmanPage();
    JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
    Actions action=new Actions(Driver.getDriver());
    String color = "yellow";
    String color1 = "indigo";

    @And("Doktor Save butonuna tiklar.")
    public void doktorSaveButonunaTiklar() {

      //  jse.executeScript("arguments[0].click();", pages.editinpatientSaveButton);
    }

    @And("Doktor acilan sayfadaki room seceneginden istedigi Available bir oda secer.")
    public void doktorAcilanSayfadakiRoomSecenegindenIstedigiAvailableBirOdaSecer() {
//       jse.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
//        jse.executeScript("window.scrollBy(0,600)");

        jse.executeScript("arguments[0].style.border = '3px solid "+color1+"'", pages.roomSelectBox);
        jse.executeScript("arguments[0].style.backgroundColor = '" + color + "'" , pages.roomSelectBox);
        ReusableMethods.waitFor(2);
       // jse.executeScript("arguments[0].click();", pages.roomSelectBox);
       Select select=new Select(pages.roomSelectBox);
        //select.selectByValue("3535");
        action.moveToElement(pages.editinpatientSaveButton).perform();

        action.click(pages.roomSelectBox).perform();
    }

    @Then("Dokror In Patients listesinde hastasinin oda numarasini gorur.")
    public void dokrorInPatientsListesindeHastasininOdaNumarasiniGorur() {
    }
}
