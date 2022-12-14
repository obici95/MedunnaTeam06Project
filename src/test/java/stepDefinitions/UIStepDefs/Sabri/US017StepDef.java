package stepDefinitions.UIStepDefs.Sabri;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.SabriPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class US017StepDef {
    SabriPage medunna017=new SabriPage();
    Faker faker =new Faker();
    LocalDate date=LocalDate.now();
    DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM-dd-yyyy");
    String tarihNow;
    String createdNow;


    @Given("SG Admin Medunna url'ine gider")
    public void sgAdminMedunnaUrlIneGider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Then("SG Admin Sign In sayfasına gider")
    public void sgAdminSignInSayfasınaGider() {
        medunna017.girisProfil.click();
        ReusableMethods.waitFor(2);
        medunna017.signInProfile.click();
    }

    @And("SG Admin Kullanıcı bilgileriyle sign in olunur")
    public void sgAdminKullanıcıBilgileriyleSignInOlunur() {
        ReusableMethods.waitFor(2);
        medunna017.userName.sendKeys("Team06");
        ReusableMethods.waitFor(1);
        medunna017.password.sendKeys("Team06.");
        ReusableMethods.waitFor(1);
        medunna017.signInGiris.click();
        ReusableMethods.waitFor(2);
    }

    @Then("SG Admin Items&Titles sekmesini tıklar")
    public void sgAdminItemsTitlesSekmesiniTıklar() {
        medunna017.itemsTitles.click();
        ReusableMethods.waitFor(1);

    }

    @And("SG Admin açılan menüden Test Item butonunu tıklar")
    public void sgAdminAçılanMenüdenTestItemButonunuTıklar() {
        medunna017.testItem.click();



    }

    @Then("SG Admin açılan sayfadan Create a new Test Item butonunu tıklar")
    public void sgAdminAçılanSayfadanCreateaNewTestItemButonunuTıklar() {
        ReusableMethods.waitFor(2);
        medunna017.createNewTestItem.click();
        ReusableMethods.waitFor(2);

    }

    @And("SG Admin Create or edit a Test Item ekranının açıldığını görür")
    public void sgAdminCreateorEditaTestItemEkranınınAçıldığınıGörür() {
        Assert.assertTrue(medunna017.createOrEditTestItem.isDisplayed());
    }

    @And("SGG Sayfayi kapatir")
    public void sgSayfayiKapatir() {
        Driver.quitDriver();
    }


    @And("SG Admin Create or edit a Test Item ekranınında Name, Description, price Default min value, Default max value and created date as Gun Ay Yil öğelerinin olduğunu görür.")
    public void sgAdminCreateOrEditATestItemEkranınındaNameDescriptionPriceDefaultMinValueDefaultMaxValueAndCreatedDateAsMMDAYYEARÖğelerininOlduğunuGörür() {
        medunna017.name.sendKeys("Team06 Test Item");
        ReusableMethods.waitFor(2);
        Assert.assertTrue(medunna017.name.isEnabled());


        medunna017.description.sendKeys("US017 Deneme");
        ReusableMethods.waitFor(2);
        Assert.assertTrue(medunna017.description.isEnabled());

        medunna017.price.sendKeys("200");
        ReusableMethods.waitFor(2);
        Assert.assertTrue(medunna017.price.isEnabled());

        medunna017.defaultMinValue.sendKeys("100", Keys.ARROW_DOWN,Keys.ARROW_DOWN);
        ReusableMethods.waitFor(2);
        Assert.assertTrue(medunna017.defaultMinValue.isEnabled());

        tarihNow=dtf.format(date);
        System.out.println("tarihNow = " + tarihNow);
        createdNow=(medunna017.createdDate.getAttribute("value").substring(5,10))+"-"+
                (medunna017.createdDate.getAttribute("value").substring(0,4));
        System.out.println("createdNow = " + createdNow);
        Assert.assertEquals(tarihNow,createdNow);

        Assert.assertTrue(medunna017.defaultMaxValue.isEnabled());
        medunna017.defaultMaxValue.sendKeys("1000",Keys.ENTER);
        ReusableMethods.waitFor(3);


    }

    @Then("SG Admin açılan sayfadan test öğelerini görüntüler.")
    public void sgAdminAçılanSayfadanTestÖğeleriniGörüntüler() {
        ReusableMethods.waitFor(2);
        medunna017.viewButton.click();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(medunna017.testItemBasligi.isDisplayed());


    }

    @Then("SG Admin açılan sayfadan test öğelerini siler")
    public void sgAdminAçılanSayfadanTestÖğeleriniSiler() {
        ReusableMethods.waitFor(2);
        medunna017.createNewTestItem.click();
        ReusableMethods.waitFor(2);
        medunna017.name.sendKeys("Team06 Test Item");
        ReusableMethods.waitFor(2);

        medunna017.description.sendKeys("US017 Deneme");
        ReusableMethods.waitFor(2);

        medunna017.price.sendKeys("200");
        ReusableMethods.waitFor(2);

        medunna017.defaultMinValue.sendKeys("100",Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN);
        ReusableMethods.waitFor(2);

        medunna017.defaultMaxValue.sendKeys("1000",Keys.ENTER);
        ReusableMethods.waitFor(6);

        medunna017.idButton.click();
        ReusableMethods.waitFor(2);

        medunna017.deleteButton.click();
        ReusableMethods.waitFor(2);

        medunna017.deleteUyariButton.click();

        Assert.assertTrue(medunna017.testItemDeletedYazisi.isDisplayed());
    }
}
