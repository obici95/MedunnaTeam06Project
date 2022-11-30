package stepDefinitions.UIStepDefs.Lokman;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import pages.LokmanPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Arrays;
import java.util.List;

public class US13_TC01_StepDefs {

    LokmanPage pages=new LokmanPage();

    Actions action=new Actions(Driver.getDriver());
    JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
       static StringBuilder expectedAppointmentId=null;
   static StringBuilder expectedPatientName=null;
    String color = "yellow";
    String color1 = "indigo";

    @Given("Doktor Medunna.com url'ine gider.")
    public void doktorMedunnaComUrlIneGider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaurl"));
        Driver.getDriver().navigate().refresh();

    }

    @And("Doktor sign in olur.")
    public void doktorSignInOlur() {


       jse.executeScript("arguments[0].style.border = '3px solid "+color1+"'", pages.accountMenu);
       jse.executeScript("arguments[0].style.backgroundColor = '" + color + "'" , pages.accountMenu);


        jse.executeScript("arguments[0].style.border = '3px solid "+color1+"'", pages.signIn);
        jse.executeScript("arguments[0].style.backgroundColor = '" + color + "'" , pages.signIn);
        ReusableMethods.waitFor(2);
        action.moveToElement(pages.accountMenu).click()
                .moveToElement(pages.signIn).click().perform();


        jse.executeScript("arguments[0].style.border = '3px solid "+color1+"'", pages.usernamebox);
        jse.executeScript("arguments[0].style.backgroundColor = '" + color + "'" , pages.usernamebox);
        ReusableMethods.waitFor(1);
        pages.usernamebox.sendKeys(ConfigReader.getProperty("username"));

        jse.executeScript("arguments[0].style.border = '3px solid "+color1+"'", pages.passwordbox);
        jse.executeScript("arguments[0].style.backgroundColor = '" + color + "'" , pages.passwordbox);
        ReusableMethods.waitFor(1);
        pages.passwordbox.sendKeys(ConfigReader.getProperty("password"));


       jse.executeScript("arguments[0].style.border = '3px solid "+color1+"'", pages.signInButton);
       jse.executeScript("arguments[0].style.backgroundColor = '" + color + "'" , pages.signInButton);
        ReusableMethods.waitFor(1);
        pages.signInButton.click();

    }

    @And("Doktor MY PAGES menusunun altindaki My Appointments'a tiklar.")
    public void doktorMYPAGESMenusununAltindakiMyAppointmentsATiklar() {
        jse.executeScript("arguments[0].style.border = '3px solid "+color1+"'", pages.myPagesMenu);
        jse.executeScript("arguments[0].style.backgroundColor = '" + color + "'" , pages.myPagesMenu);
        ReusableMethods.waitFor(1);
        pages.myPagesMenu.click();

        jse.executeScript("arguments[0].style.border = '3px solid "+color1+"'", pages.myappointmentsClick);
        jse.executeScript("arguments[0].style.backgroundColor = '" + color + "'" , pages.myappointmentsClick);
        ReusableMethods.waitFor(1);
        jse.executeScript("arguments[0].click();", pages.myappointmentsClick);

    }

    @And("Doktor acilan sayfadaki Appointments listesinde istedigi hastanin satirindaki Edit'e tiklar")
    public void doktorAcilanSayfadakiAppointmentsListesindeIstedigiHastaninSatirindakiEditETiklar() {
        ReusableMethods.waitFor(1);
       // int editNumber=pages.editButtonsSize.size();
       // System.out.println("editNumber = " + editNumber);
        expectedAppointmentId= new StringBuilder(Driver.getDriver().findElement(By.xpath("//tbody/tr[1]/td[1]")).getText());
        expectedPatientName= new StringBuilder(Driver.getDriver().findElement(By.xpath("//tbody/tr[1]/td[12]")).getText());
        jse.executeScript("arguments[0].style.border = '3px solid "+color1+"'",Driver.getDriver().findElement(By.xpath("//tbody/tr[1]/td[1]") ));
        jse.executeScript("arguments[0].style.backgroundColor = '" + color + "'" , Driver.getDriver().findElement(By.xpath("//tbody/tr[1]/td[1]")));
        jse.executeScript("arguments[0].style.border = '3px solid "+color1+"'", Driver.getDriver().findElement(By.xpath("//tbody/tr[1]/td[12]")));
        jse.executeScript("arguments[0].style.backgroundColor = '" + color + "'" , Driver.getDriver().findElement(By.xpath("//tbody/tr[1]/td[12]")));

        jse.executeScript("arguments[0].style.border = '3px solid "+color1+"'", pages.firstEditButton);
        jse.executeScript("arguments[0].style.backgroundColor = '" + color + "'" , pages.firstEditButton);
        ReusableMethods.waitFor(1);

        action.moveToElement(pages.firstEditButton).click().perform();
        ReusableMethods.waitFor(1);
        //jse.executeScript("arguments[0].click();",pages.firstEditButton);

      //  System.out.println("expectedAppointmentId_1 = " + expectedAppointmentId);
      //  System.out.println("expectedPatientName_1 = " + expectedPatientName);
    }

    @And("Doktor acilan sayfada Show Test Results'a tiklar")
    public void doktorAcilanSayfadaShowTestResultsATiklar() {

        jse.executeScript("arguments[0].style.border = '3px solid "+color1+"'", pages.showTestResultsButton);
        jse.executeScript("arguments[0].style.backgroundColor = '" + color + "'" , pages.showTestResultsButton);
       ReusableMethods.waitFor(1);
        pages.showTestResultsButton.click();

    }

    @And("Doktor acilan sayfadaki Tests listesinden ilgili teste ait View Results'a tiklar.")
    public void doktorAcilanSayfadakiTestsListesindenIlgiliTesteAitViewResultsATiklar() {

        jse.executeScript("arguments[0].style.border = '3px solid "+color1+"'", pages.viewResultsButton);
        jse.executeScript("arguments[0].style.backgroundColor = '" + color + "'" , pages.viewResultsButton);
        ReusableMethods.waitFor(1);
        pages.viewResultsButton.click();
    }

    @Then("Doktor Test Resulst tablosunda test bilgilerini gorur.")
    public void doktorTestResulstTablosundaTestBilgileriniGorur() {
       // jse.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
        jse.executeScript("window.scrollBy(0,600)");

        jse.executeScript("arguments[0].style.border = '3px solid "+color1+"'", pages.table_tbody);
        jse.executeScript("arguments[0].style.backgroundColor = '" + color + "'" , pages.table_tbody);
        List<WebElement> actualTableHeads=pages.testResultsTheads;
        List<WebElement> actualTestResultsNameDatas=pages.testResultNameDatas;

       // actualTestResultsNameDatas.forEach(t-> System.out.println(t.getText()));

        List<String> expectedTestResultsNameDatas= Arrays.asList("Glucose","Creatinine","Hemoglobin","Sodium","Albumin","Total protein","Potassium","Urea");
        List<String> expectedTableHeads= Arrays.asList("ID","Name","Result","Default Min. Value","Default Max. Value","Test","Description","Date","");

        for (int i = 0; i < expectedTableHeads.size(); i++) {
          Assert.assertEquals("Tablo hatalı",actualTableHeads.get(i).getText(),expectedTableHeads.get(i));
        }

        for (int i = 0; i < expectedTestResultsNameDatas.size(); i++) {
           Assert.assertEquals("Test ismi hatalı",actualTestResultsNameDatas.get(i).getText(),expectedTestResultsNameDatas.get(i));
        }



        for (int i = 1; i <9 ; i++) {
           // int index=i+1;
            List<WebElement> actualResultDatas=Driver.getDriver().findElements(By.xpath("//tbody/tr/td["+i+"]"));

            for (WebElement w:actualResultDatas ) {
               // System.out.println(w.getText());
              //  softAssert.assertNotEquals(w.getText(),"","Tablo hatalı");
            Assert.assertTrue("Tablo hatalı",!w.getText().isEmpty());
            }
        }

    }

    @And("Doktor sayfayi kapatir.")
    public void doktorSayfayiKapatir() {
       //Driver.closeDriver();
    }


}
