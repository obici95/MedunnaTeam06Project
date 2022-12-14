package stepDefinitions.UIStepDefs.Abdullah;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AbdullahPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.*;
import static utilities.ReusableMethods.waitFor;

public class US_003_StepDefinition {
    AbdullahPage uS3Page = new AbdullahPage();
    Actions action = new Actions(Driver.getDriver());
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

    @Given("Kullanici, {string} ana sayfasinda aa")
    public void kullaniciAnaSayfasindaAa(String istenenURL) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenURL));
    }


    @Then("Kullanici, sag tarafta bulunan ikona tiklar aa")
    public void kullaniciSagTaraftaBulunanIkonaTiklarAa() {
        jse.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 4px solid black;');", uS3Page.accountMenu);
        waitFor(1);
        uS3Page.accountMenu.click();
    }

    @And("Kullanici, ikonun altinda acilan Register butonuna tiklar aa")
    public void kullaniciIkonunAltindaAcilanRegisterButonunaTiklarAa() {
        jse.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 4px solid black;');", uS3Page.registerButton);
        waitFor(1);
        uS3Page.registerButton.click();
    }

    @And("Kullanici, New password bolumune dort karakterlik bir {string} girer")
    public void kullaniciNewPasswordBolumuneDortKarakterlikBirGirer(String istenenSifre) {

        action.sendKeys(Keys.PAGE_DOWN).perform();
        uS3Page.firstPasswordInput.sendKeys(istenenSifre);


    }

    @And("Kullanici, New password confirmation bolumune ayni {string} yi girer")
    public void kullaniciNewPasswordConfirmationBolumuneAyniYiGirer(String istenenSifre) {
        action.sendKeys(Keys.TAB).sendKeys(istenenSifre).sendKeys(Keys.ENTER).perform();
    }


    @And("Kullanici, Your password is required to be at least four characters. yazisinin kalktigini dogrular.")
    public void kullaniciYourPasswordIsRequiredToBeAtLeastFourCharactersYazisininKalktiginiDogrular() {
        assertTrue(uS3Page.invalidFeedbackList.isEmpty());

    }

    @And("Kullanici, New password bolumune dort karakterden az bir {string} girer")
    public void kullaniciNewPasswordBolumuneDortKarakterdenAzBirGirer(String istenenSifre) {
        action.sendKeys(Keys.PAGE_DOWN).perform();
        uS3Page.firstPasswordInput.sendKeys(istenenSifre);
    }


    @And("Kullanici Your password is required to be at least four characters. yazisinin oldugunu dogrular.")
    public void kullaniciYourPasswordIsRequiredToBeAtLeastFourCharactersYazisininOldugunuDogrular() {
        assertTrue(uS3Page.invalidFeedback.isDisplayed());
    }

    @And("Kullanici, New Password bolumune en az yedi karakterden olusan bir {string} girer")
    public void kullaniciNewPasswordBolumuneEnAzYediKarakterdenOlusanBirGirer(String istenenSifre) {
        action.sendKeys(Keys.PAGE_DOWN).perform();
        uS3Page.firstPasswordInput.sendKeys(istenenSifre);
    }


    @And("Kullanici, Password Strength seviyesinin {int} oldugunu dogrular.")
    public void kullaniciPasswordStrengthSeviyesininOldugunuDogrular(int istenenSeviye) {
        System.out.println("uS3Page.strenghtLevel.size() = " + uS3Page.strenghtLevel.size());
        assertEquals(uS3Page.strenghtLevel.size(), (5 - (istenenSeviye)));

    }
    int expectedSize;
    @And("Kullanici, New Password bolumune en az alti karakterlik bir {string} girer")
    public void kullaniciNewPasswordBolumuneEnAzAltiKarakterlikBirGirer(String istenenSifre) throws InterruptedException {
        action.sendKeys(Keys.PAGE_DOWN).perform();
        uS3Page.firstPasswordInput.sendKeys(istenenSifre);
        expectedSize =uS3Page.strenghtLevel.size();
        System.out.println("expectedSize = " + expectedSize);
        Thread.sleep(2000);
    }

    int actualSize;
    @And("Kullanici, New Password bolumune en az bir tane {string} ekler.")
    public void kullaniciNewPasswordBolumuneEnAzBirTaneEkler(String istenenKarakter) {
        uS3Page.firstPasswordInput.sendKeys(istenenKarakter);
        actualSize=uS3Page.strenghtLevel.size();
        System.out.println("actualSize = " + actualSize);
    }


    @And("Kullanıcı, Password Strength seviyesinin degistigini dogrular.")
    public void kullanıcıPasswordStrengthSeviyesininDegistiginiDogrular() {
        assertNotEquals(expectedSize,actualSize);

    }



}
