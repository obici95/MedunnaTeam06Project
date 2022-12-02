package stepDefinitions.UIStepDefs.Ali;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.AliPage;
import utilities.ConfigReader;
import utilities.Driver;

public class MyStepdefs {

    AliPage aliPage = new AliPage();
    Actions actions = new Actions(Driver.getDriver());
    @Given("AB Hasta medunna sayfasina gider")
    public void hastaMedunnaSayfasinaGider() {Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Then("AB Hasta Make an Appointment linkine tiklar")
    public void hastaMakeAnAppointmentLinkineTiklar() {
        Driver.waitAndClick(aliPage.makeAnAppointmentButonu, 2);    }

    @And("AB Hasta herhangi bir karakter iceren gecerli bir firstname girer")
    public void hastaHerhangiBirKarakterIcerenGecerliBirFirstnameGirer() {
        Driver.waitAndClick((aliPage.firstnameButonu),2);
        actions.sendKeys("ALEX").perform();    }

    @And("AB Hasta gecerli bir lastname girer")
    public void hastaGecerliBirLastnameGirer() {
        Driver.waitAndClick((aliPage.lastnameButonu),2);
        actions.sendKeys("Scientist").perform();    }

    @And("AB Hasta gecerli ve kayitli olan SSN numarasini girer")
    public void hastaGecerliVeKayitliOlanSSNNumarasiniGirer() {
        Driver.waitAndClick(aliPage.ssnButonu,2);
        actions.sendKeys("333-66-9901").perform();      }

    @And("AB Hasta  gecerli bir email adresi girer")
    public void hastaGecerliBirEmailAdresiGirer() {
        Driver.waitAndClick(aliPage.emailButonu,2);
        actions.sendKeys("halex@gmail.com").perform();    }

     @And("AB Hasta gecerli bir telefon numarası girer")
    public void hastaGecerliBirTelefonNumarasıGirer() {
        Driver.waitAndClick(aliPage.phoneButonu,2);
        actions.sendKeys("123-456-7890").perform();    }

    @And("AB Hasta Send An Appointment Request butonuna tiklar")
    public void hastaSendAnAppointmentRequestButonunaTiklar() {
        Driver.waitAndClick(aliPage.sendRequestButonu,2);    }

    @And("AB Hasta account ve sign in butonuna tiklar")
    public void hastaSignInButonunaTiklar() {
        Driver.waitAndClick(aliPage.accountMenuButonu,2);
        Driver.waitAndClick(aliPage.signInButonu,2);
    }

    @And("AB Hasta gecerli user name girer")
    public void hastaGecerliUserNameVeEmailAdressGirer() {
        Driver.waitAndClick(aliPage.usernameButonu,2);
        actions.sendKeys(ConfigReader.getProperty("username")).perform();    }

    @And("AB Hasta gecerli password girer")
    public void hastaGecerliPasswordGirer() {
        Driver.waitAndClick(aliPage.passwordButonu,2);
        actions.sendKeys(ConfigReader.getProperty("pass")).perform();    }

    @And("AB Hasta sign in butonuna tiklar")
    public void kullaniciSignInButonunaTiklar() {Driver.waitAndClick(aliPage.signInGirisButonu,2);    }

    @And("AB Hasta oturum actigini dogrular")
    public void kullaniciOturumActiginiDogrular() throws InterruptedException {
        Thread.sleep(3000);
       Assert.assertTrue(aliPage.entityButonu.isDisplayed());
    }

    @And("AB Hasta mypage butonuna tiklar")
    public void kullaniciMaypageButonunaTiklar() {
        Driver.waitAndClick(aliPage.entityButonu,2);    }

    @And("AB Hasta My Appointment butonuna tiklar")
    public void kullaniciMyAppointmentButonunaTiklar() {
        Driver.waitAndClick(aliPage.myAppointmentButonu,2);    }

    @And("AB Hasta aldigi randevulari dogrular")
    public void kullaniciAldigiRandevulariDogrular() {
        System.out.println(aliPage.randevuDogrulama.getText());
        Assert.assertTrue(aliPage.randevuDogrulama.isDisplayed());



    }
}
