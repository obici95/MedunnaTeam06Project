package stepDefinitions.UIStepDefs.Hatem;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import pages.HatemPage;

import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_22StepDefinition {
    HatemPage sign =new HatemPage();
    HatemPage staffPageHP= new HatemPage();
    Actions actions = new Actions(Driver.getDriver());

    @And("Kullanici Medunna Url sitesine gider")
    public void kullaniciMedunnaUrlSitesineGider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaURL"));
    }
    @And("Kullanici Sign In DropDown menuye Tiklar")
    public void kullaniciSignInDropDownMenuyeTiklar() {
        sign.SignInDropdown.click();
    }
    @And("Kullanici Gecerli Staff UserName ve UserPassword girer Sign in olur")
    public void kullaniciGecerliStaffUserNameVeUserPasswordGirerSignInOlur() {
        sign.SignInGiris.click();
        sign.userName_box.sendKeys(ConfigReader.getProperty("UsernamePersonel"));
        sign.userNamePassword_box.sendKeys(ConfigReader.getProperty("PasswordPersonel"));
        sign.SignInButton.click();  }
    @And("Staff  My Pages sekmesine tiklar ve Search Patient sekmesine tiklar")
    public void staffMyPagesSekmesineTiklarVeSearchPatientSekmesineTiklar() {
        staffPageHP.MyPageTabOnTheHomePage.click();
        staffPageHP.SearchPatientTabOnMyPage.click();      }
    @And("Staff Patient SSN searchbox ina tiklar ve Aranan Hastayi bulur")
    public void staffPatientSSNSearchboxInaTiklarVeArananHastayiBulur() {
        staffPageHP.PatientSSNBox.
                sendKeys(ConfigReader.getProperty("KullanilacakSSN_US_22"));
        ReusableMethods.waitFor(3);
    }
    @And("Staff sayfayi kapatir")
    public void staffSayfayiKapatir() {
        Driver.closeDriver();
    }

    @And("Staff Show Appointmens buttonuna tiklar")
    public void staffShowAppointmensButtonunaTiklar() {
        staffPageHP.ShowAppointments.click();

    }

    @And("Gelen Appointments sayfasindan Show test te tiklar")
    public void gelenAppointmentsSayfasindanShowTestTeTiklar() {
        staffPageHP.showTest.click();
    }

    @And("Staff boylelikle Hastanin test sonuclarini gorur.")
    public void staffBoylelikleHastaninTestSonuclariniGorur() {
Assert.assertTrue(staffPageHP.testIsDisplayed.isDisplayed());
    }

    @And("Staff edit  buttonuna tiklar")
    public void staffEditButtonunaTiklar() {
        staffPageHP.MyPageTabOnTheHomePage.click();
        staffPageHP.SearchPatientTabOnMyPage.click();
        staffPageHP.PatientSSNBox.sendKeys(ConfigReader.getProperty("KullanilacakSSN_US_22"));
        staffPageHP.AppointmentsEdit.click();
        ReusableMethods.waitFor(5);
    }
    @And("Staff Hasta bilgilerini gorur ve duzenler")
    public void staffHastaBilgileriniGorurVeDuzenler() {
        staffPageHP.birthDate.sendKeys(ConfigReader.getProperty("BirthDate"));
        staffPageHP.patientAddress.sendKeys(ConfigReader.getProperty("PatientAddress"));

    }
}