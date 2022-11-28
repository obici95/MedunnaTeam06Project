package stepDefinitions.UIStepDefs.Abdullah;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AbdullahPage;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.assertTrue;

public class US_004_StepDefinition {
    AbdullahPage uS4Page =new AbdullahPage();
    @Then("Kullanici, ikonun altinda acilan Sign in butonuna tiklar")
    public void kullaniciIkonunAltindaAcilanSignInButonunaTiklar() {
        uS4Page.ilkSignIn.click();
    }
    @And("Kullanici, Sign in pop-up'ında oldugunu dogrular")
    public void kullaniciSignInPopUpIndaOldugunuDogrular() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue(uS4Page.textSignIn.isDisplayed());
    }

    @Then("Kullanici, daha onceden olusturmus oldugu {string}nı girer")
    public void kullaniciDahaOncedenOlusturmusOlduguNıGirer(String username) {
        uS4Page.username.sendKeys(ConfigReader.getProperty(username));
        System.out.println("uS4Page.username.getAttribute(\"value\") = " + uS4Page.username.getAttribute("value"));
    }

    @And("Kullanici, daha onceden oluşturmuş oldugu {string}unu girer")
    public void kullaniciDahaOncedenOluşturmuşOlduguUnuGirer(String password) {
        uS4Page.password.sendKeys(ConfigReader.getProperty(password));
    }

    @And("Kullanici, Sign in butonuna tiklar")
    public void kullaniciSignInButonunaTiklar() {
        uS4Page.ikinciSignIn.click();
    }

    @And("Kullanici basarili bir giris yaptigini dogrular.")
    public void kullaniciBasariliBirGirisYaptiginiDogrular() {
        assertTrue(uS4Page.Team06.isEnabled());
    }


    @And("Kullanici Failed to sign in! Please check your credentials and try again. yazisini dogrular.")
    public void kullaniciFailedToSignInPleaseCheckYourCredentialsAndTryAgainYazisiniDogrular() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue(uS4Page.failText.isDisplayed());
    }

    @Then("Kullanici, Remember me butonunun secilebildigini dogrular")
    public void kullaniciRememberMeButonununSecilebildiginiDogrular() {
        uS4Page.rememberMe.click();
        assertTrue(uS4Page.rememberMeTrue.isSelected());
    }

    @And("Kullanici, kullanici ismi uzerine tiklar")
    public void kullaniciKullaniciIsmiUzerineTiklar() {
        uS4Page.Team06.click();
    }

    @And("Kullanici, kullanici ismi altinda açilan sign out butonuna tiklar")
    public void kullaniciKullaniciIsmiAltindaAçilanSignOutButonunaTiklar() {
        uS4Page.signOut.click();
    }

    @And("Kullanici, username alaninda daha once girdigi ismin oldugunu dogrular")
    public void kullaniciUsernameAlanindaDahaOnceGirdigiIsminOldugunuDogrular() {
        System.out.println("uS4Page.username.getCssValue(\"value\") = " + uS4Page.username.getCssValue("value"));
        System.out.println("uS4Page.username.getAttribute(\"value\") = " + uS4Page.username.getAttribute("value"));
        System.out.println("uS4Page.username.getTagName() = " + uS4Page.username.getTagName());
        System.out.println("uS4Page.username.getSize() = " + uS4Page.username.getSize());
    }

    @Then("Kullanici, Did you forget your password? butonunun oldugunu dogrular")
    public void kullaniciDidYouForgetYourPasswordButonununOldugunuDogrular() {
        assertTrue(uS4Page.didYouForgetYourPassword.isEnabled());

    }

    @Then("Kullanici, You don't have an account yet? Register a new account butonunun oldugunu dogrular")
    public void kullaniciYouDonTHaveAnAccountYetRegisterANewAccountButonununOldugunuDogrular() {
        assertTrue(uS4Page.registerANewAccount.isEnabled());
    }

    @Then("Kullanici, Cancel butonunun oldugunu dogrular")
    public void kullaniciCancelButonununOldugunuDogrular() {
        assertTrue(uS4Page.cancelButton.isEnabled());
    }

    @Then("Kullanici basari mesajini dogrular")
    public void kullaniciBasariMesajiniDogrular() {
        Assert.assertTrue("succes to message uyarisi goruntulenemedi", Driver.getDriver().getPageSource().contains("success to  message"));

    }

    @And("Kullanici, sayfayi kapatir.")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }
}
