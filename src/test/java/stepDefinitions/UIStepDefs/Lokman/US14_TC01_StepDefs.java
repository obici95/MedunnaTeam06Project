package stepDefinitions.UIStepDefs.Lokman;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import pages.LokmanPage;

import utilities.Driver;

import java.util.Arrays;
import java.util.List;

public class US14_TC01_StepDefs {
    LokmanPage pages=new LokmanPage();
    String color = "gray";
    String color1 = "indigo";
    JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
    @Then("Doktor In Patients tablosundaki hasta bilgilerini gorur.")
    public void doktorInPatientsTablosundakiHastaBilgileriniGorur() {
        List<WebElement> actualInpatientTableHeads=pages.inPatientTableHeads;
        List<WebElement> actualInpatientTableAllDatas=pages.inPatientTableAllDatas;
        List<String> expectedInpatientsTableHeads= Arrays.asList("ID","Start Date","End Date","Status","Description",
                "Created Date","Room","Appointment","Patient","");

        jse.executeScript("window.scrollBy(0,200)");

        jse.executeScript("arguments[0].style.border = '3px solid "+color1+"'", pages.table_tbody);
        jse.executeScript("arguments[0].style.backgroundColor = 'gray'" , pages.table_tbody);

        for (int i = 0; i < actualInpatientTableHeads.size(); i++) {
          Assert.assertEquals("Tablo hatalı",actualInpatientTableHeads.get(i).getText(),expectedInpatientsTableHeads.get(i));
        }

        for (WebElement w:actualInpatientTableAllDatas ) {

         Assert.assertTrue("Tablo hatalı",pages.table_tbody.isDisplayed());
         Assert.assertNotEquals("Tablo hatalı", 0, actualInpatientTableAllDatas.size());
        }

    }
}
