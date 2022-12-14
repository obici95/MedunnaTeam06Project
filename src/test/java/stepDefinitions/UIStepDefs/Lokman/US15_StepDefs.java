package stepDefinitions.UIStepDefs.Lokman;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.LokmanPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Arrays;
import java.util.List;

public class US15_StepDefs {

  LokmanPage pages=new LokmanPage();
    JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();

    Actions action=new Actions(Driver.getDriver());

    public static  String patientIdNumber;

    @Given("LB Kullanici Items&Titles altindaki Patients'a tiklar.")
    public void lb_kullanici_items_titles_altindaki_patients_a_tiklar() {
        jse.executeScript("arguments[0].style.border = '3px solid black'", pages.itemsTitlesMenu);
        ReusableMethods.waitFor(1);
        action.moveToElement(pages.itemsTitlesMenu).click().perform();

        jse.executeScript("arguments[0].style.border = '3px solid black'", pages.patientsMenu);
        ReusableMethods.waitFor(1);
        action.moveToElement(pages.patientsMenu).click().perform();
    }
    @Given("LB Admin kullanici Patients sayfasinda Create a new Patients butonu gorur ve butona tiklar.")
    public void lb_admin_kullanici_patients_sayfasinda_create_a_new_patients_butonu_gorur_ve_butona_tiklar() {

        jse.executeScript("arguments[0].style.border = '3px solid black'", pages.createAPatient);
        ReusableMethods.waitFor(1);
        Assert.assertTrue(pages.createAPatient.isDisplayed());
        action.moveToElement(pages.createAPatient).click().perform();
    }

    @Then("Admin kullanici Create or edit a Patient sayfasina ulastigini gorur.")
    public void admin_kullanici_create_or_edit_a_patient_sayfasina_ulastigini_gorur() {
        String expectedUrl="https://medunna.com/patient/new";
        String actualUrl=Driver.getDriver().getCurrentUrl();

        jse.executeScript("arguments[0].style.border = '3px solid black'", pages.createPatientForm);

        Assert.assertEquals(expectedUrl,actualUrl);
        Assert.assertTrue(pages.createPatientForm.isDisplayed());

        ReusableMethods.waitFor(2);

    }

    @And("LB Kullanci istedigi hastanin View butonuna tiklar.")
    public void lbKullanciIstedigiHastaninViewButonunaTiklar() {
       jse.executeScript("document.body.style.zoom='67%';");

        jse.executeScript("arguments[0].style.border = '5px solid black'", pages.tableFirstRow);
        jse.executeScript("arguments[0].style.border = '5px solid black'", pages.patientsViewButton);
        ReusableMethods.waitFor(4);
        jse.executeScript("arguments[0].click();", pages.patientsViewButton);

         }

    @Then("LB Kullanici acilan sayfada hasta bilgilerini gorur.")
    public void lbKullaniciAcilanSayfadaHastaBilgileriniGorur() {
        jse.executeScript("document.body.style.zoom='65%';");
        jse.executeScript("arguments[0].style.border = '5px solid black'", pages.patientsViewForm);
        ReusableMethods.waitFor(1);

        List<WebElement> actualPatientsViewFormDatas=pages.patientsViewFormDatas;
        List<String> expectedPatientsViewFormTitles= Arrays.asList("SSN","First Name","Last Name","Birth Date"
                ,"Phone","Gender","Blood Group","Address","Description","Created Date","User","Country","State/City");
        List<WebElement> actualPatientsViewFormTitles=pages.patientsViewFormTitles;

       // actualPatientsViewFormTitles.forEach(t-> System.out.println(t.getText()));
        //actualPatientsViewFormDatas.forEach(t-> System.out.println(t.getText()));

        for (int i = 0; i < 13; i++) {
            Assert.assertEquals("tablo basliklari hatali",expectedPatientsViewFormTitles.get(i),actualPatientsViewFormTitles.get(i).getText());
        }

        for (int i = 0; i < 7; i++) {
            Assert.assertFalse("datalar hatali",actualPatientsViewFormDatas.get(i).getText().isEmpty());
        }

        ReusableMethods.waitFor(2);
    }


    /// TC07 Step Definitions

    @And("LB Admin kullanici fake bir hasta kaydi olusturur.")
    public void lbAdminKullaniciFakeBirHastaKaydiOlusturur() {
        jse.executeScript("arguments[0].style.border = '3px solid black'", pages.createAPatient);
        ReusableMethods.waitFor(1);
        jse.executeScript("arguments[0].click();",pages.createAPatient);

        jse.executeScript("arguments[0].style.border = '3px solid black'", pages.patientFirstName);
        ReusableMethods.waitFor(1);
        pages.patientFirstName.sendKeys(ConfigReader.getProperty("fakefirstname"));

        jse.executeScript("arguments[0].style.border = '3px solid black'", pages.patientLastName);
        ReusableMethods.waitFor(1);
        pages.patientLastName.sendKeys(ConfigReader.getProperty("fakelastname"));

        jse.executeScript("arguments[0].style.border = '3px solid black'", pages.patientEmail);
        ReusableMethods.waitFor(1);
        pages.patientEmail.sendKeys(ConfigReader.getProperty("fakeemail"));

        jse.executeScript("arguments[0].style.border = '3px solid black'", pages.patientPhone);
        ReusableMethods.waitFor(1);
        pages.patientPhone.sendKeys(ConfigReader.getProperty("fakephonenumber"));

        jse.executeScript("window.scrollBy(0,900)");
        jse.executeScript("arguments[0].style.border = '3px solid black'", pages.editinpatientSaveButton);
        ReusableMethods.waitFor(1);
        jse.executeScript("arguments[0].click();",pages.editinpatientSaveButton);

       ReusableMethods.waitForVisibility(pages.patientHeading,10);

    }

    @And("LB Admin kullanici listede fake kaydin Delete butonuna tiklar.")
    public void lbAdminKullaniciListedeFakeKaydinDeleteButonunaTiklar() {
        Driver.getDriver().navigate().refresh();
        action.moveToElement(pages.idButton).click().perform();
        jse.executeScript("document.body.style.zoom='65%';");
        patientIdNumber=pages.fakePatientIdNumber.getText();

        jse.executeScript("arguments[0].style.border = '5px solid black'", pages.fakePatientTableRow);
        jse.executeScript("arguments[0].style.border = '5px solid black'", pages.fakePatientDeleteButton);
        ReusableMethods.waitFor(1);
        jse.executeScript("arguments[0].click();",pages.fakePatientDeleteButton);

    }

    @And("LB Admin kullanici uyari yazisindan Delete islemini onaylar.")
    public void lbAdminKullaniciUyariYazisindanDeleteIsleminiOnaylar() {
       // ReusableMethods.waitFor(2);
        jse.executeScript("arguments[0].style.border = '5px solid black'", pages.comfirmDelete);
        ReusableMethods.waitFor(1);
        jse.executeScript("arguments[0].click();",pages.comfirmDelete);
        ReusableMethods.waitForVisibility(pages.patientHeading,10);

    }

    @Then("LB Admin kullanici  A user is deleted with identifier uyari yazisini gorur.")
    public void lbAdminKullaniciAUserIsDeletedWithIdentifierUyariYazisiniGorur() {
      //  String expectedUserDeleteControlText="A Patient is deleted with identifier "+patientIdNumber+"";
       // System.out.println("expectedUserDeleteControlText = " + expectedUserDeleteControlText);

     //   ReusableMethods.waitForVisibility(pages.registerToastify,10);
     //   String actualUserDeleteControlText=pages.registerToastify.getText();
        // System.out.println("actualUserDeleteControlText = " + actualUserDeleteControlText);
      //  jse.executeScript("arguments[0].style.border = '6px solid black'", pages.toastifyFrame);
       // Assert.assertEquals("uyari yazisi yok",expectedUserDeleteControlText,actualUserDeleteControlText);
//        Assert.assertTrue("uyari yazisi yok",pages.registerToastify.isDisplayed());
//        ReusableMethods.waitFor(1);
    }

    @Then("LB Admin kallanici kaydin Patients listesinde olmadigini dogrular.")
    public void lbAdminKallaniciKaydinPatientsListesindeOlmadiginiDogrular() {
        ReusableMethods.waitFor(1);
        Driver.getDriver().navigate().refresh();
        jse.executeScript("document.body.style.zoom='50%';");

        jse.executeScript("window.scrollBy(0,300)");
        String ecpectedPatientIdNumber=patientIdNumber;
        List<WebElement> actualPatientsIdMumbers=pages.patientsIdMunbersColumn;


        for (int i = 0; i <actualPatientsIdMumbers.size() ; i++) {
            jse.executeScript("arguments[0].style.border = '3px solid black'", actualPatientsIdMumbers.get(i));
        }

        for (WebElement w:actualPatientsIdMumbers) {
            Assert.assertNotEquals("Deleting is failed",ecpectedPatientIdNumber,w.getText());
 }

        ReusableMethods.waitFor(3);
        jse.executeScript("document.body.style.zoom='100%';");

    }


}
