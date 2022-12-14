package stepDefinitions.UIStepDefs.Lokman;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import pages.LokmanPage;

import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US13_TC02_StepDefs {
    LokmanPage pages=new LokmanPage();

    Actions action=new Actions(Driver.getDriver());
    JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
    StringBuilder expectedAppointmentId=null;
    StringBuilder expectedPatientName=null;
   String color = "gray";
    String color1 = "indigo";


    @And("Doktor acilan sayfada Request Inpatient'a tiklar.")
    public void doktorAcilanSayfadaRequestInpatientATiklar() {
        jse.executeScript("arguments[0].style.border = '3px solid "+color1+"'", pages.requestInpatientButton);
        jse.executeScript("arguments[0].style.backgroundColor = '" + color + "'" , pages.requestInpatientButton);
        ReusableMethods.waitFor(1);
        pages.requestInpatientButton.click();
    }

    @And("Doktor ekranda islem ile ilgili mesaji gorur.")
    public void doktorEkrandaIslemIleIlgiliMesajiGorur() {

        ReusableMethods.waitForVisibility(pages.inPatientRoleAlert,10);
        Assert.assertTrue("Mesaj görüntülenemedi",pages.inPatientRoleAlert.isDisplayed());
    }

    @And("Doktor My PAGES menusu altindaki My Inpatients'a tiklar.")
    public void doktorMyPAGESMenusuAltindakiMyInpatientsATiklar() {
        jse.executeScript("arguments[0].style.border = '3px solid "+color1+"'", pages.myPagesMenu);
        jse.executeScript("arguments[0].style.backgroundColor = '" + color + "'" , pages.myPagesMenu);
        ReusableMethods.waitFor(1);
        pages.myPagesMenu.click();

        jse.executeScript("arguments[0].style.border = '3px solid "+color1+"'", pages.myinpatientsClick);
        jse.executeScript("arguments[0].style.backgroundColor = '" + color + "'" , pages.myinpatientsClick);
        ReusableMethods.waitFor(1);
        jse.executeScript("arguments[0].click();", pages.myinpatientsClick);
    }

    @Then("Doktor hastasinin In Patients listesinde oldugunu gorur.")
    public void doktorHastasininInPatientsListesindeOldugunuGorur() {


        List<WebElement> actualInPatientAppointmentIds=pages.inpatientAppointmentsIds;
        List<WebElement> actualInPatientDatas=pages.inPatientDatas;

        jse.executeScript("arguments[0].style.border = '3px solid "+color1+"'",actualInPatientAppointmentIds.get(0) );
        jse.executeScript("arguments[0].style.border = '3px solid "+color1+"'",actualInPatientDatas.get(0) );
        jse.executeScript("arguments[0].style.backgroundColor = '" + color + "'" , actualInPatientAppointmentIds.get(0));
        jse.executeScript("arguments[0].style.backgroundColor = '" + color + "'" , actualInPatientDatas.get(0));

        Assert.assertTrue("İstenen hasta listede yok.",actualInPatientAppointmentIds.get(actualInPatientAppointmentIds.size()-1).getText().contains(US13_TC01_StepDefs.expectedAppointmentId));
       Assert.assertTrue("İstenen hasta listede yok.",actualInPatientDatas.get(actualInPatientDatas.size()-1).getText().contains(US13_TC01_StepDefs.expectedPatientName));

        ReusableMethods.waitFor(2);
    }


}
