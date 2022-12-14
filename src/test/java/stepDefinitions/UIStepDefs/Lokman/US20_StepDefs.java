package stepDefinitions.UIStepDefs.Lokman;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.LokmanPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Arrays;
import java.util.List;

public class US20_StepDefs {
    LokmanPage pages=new LokmanPage();
    JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();

    Actions action=new Actions(Driver.getDriver());
    String actualSelectBoxText;
    String actualUserEditControlText;

    @Given("LB Kullanici Medunna.com url'e gider.")
    public void lb_kullanici_medunna_com_url_e_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaurl"));
        Driver.getDriver().navigate().refresh();


    }
    @Given("LB Kullanici admin olarak sign in olur.")
    public void lb_kullanici_admin_olarak_sign_in_olur() {
        jse.executeScript("arguments[0].style.border = '3px solid black'", pages.accountMenu);
        ReusableMethods.waitFor(1);
        action.moveToElement(pages.accountMenu).click().perform();


        jse.executeScript("arguments[0].style.border = '3px solid black'", pages.signIn);
        ReusableMethods.waitFor(1);
        action.moveToElement(pages.signIn).click().perform();


        jse.executeScript("arguments[0].style.border = '3px solid black'", pages.usernamebox);
        ReusableMethods.waitFor(1);
        pages.usernamebox.sendKeys(ConfigReader.getProperty("adminusername"));


        jse.executeScript("arguments[0].style.border = '3px solid black'", pages.passwordbox);
        ReusableMethods.waitFor(1);
        pages.passwordbox.sendKeys(ConfigReader.getProperty("adminpassword"));


        jse.executeScript("arguments[0].style.border = '3px solid black'", pages.signInButton);
        ReusableMethods.waitFor(1);
        pages.signInButton.click();
    }

    @Given("LB Admin kullanici Administration altinda User management'a tiklar.")
    public void lb_admin_kullanici_administration_altinda_user_management_a_tiklar() {

        jse.executeScript("arguments[0].style.border = '3px solid black'", pages.adminMenu);
        ReusableMethods.waitFor(1);
        pages.adminMenu.click();

        jse.executeScript("arguments[0].style.border = '3px solid black'", pages.usermanagementClick);
        ReusableMethods.waitFor(1);
        jse.executeScript("arguments[0].click();", pages.usermanagementClick);
    }
    @Given("LB Admin kullanici Users listesinden istedigi kaydin View butonuna tiklar.")
    public void lb_admin_kullanici_users_listesinden_istedigi_kaydin_view_butonuna_tiklar() {
        jse.executeScript("arguments[0].style.border = '3px solid black'", pages.usersFirstEdit);
        ReusableMethods.waitFor(1);
        action.moveToElement(pages.usersFirstEdit).click().perform();
    }

    @Then("LB Admin kullanici acilan sayfada kayitli kisinin bilgilerini gorur.")
    public void lbAdminKullaniciAcilanSayfadaKayitliKisininBilgileriniGorur() {
        List<WebElement> actualUserPageTableHeads=pages.userPageTableHeads;
        List<WebElement> actualUserPageTableDatas=pages.userPageTableDatas;
        List<String> expectedUserPageTableHeads= Arrays.asList("Login","First name","Last name","Email");
        //actualUserPageTableHeads.forEach(t-> System.out.println(t.getText()));
        for (int i = 0; i < 4; i++) {
            Assert.assertEquals("Tablo basliklari hatali",expectedUserPageTableHeads.get(i),actualUserPageTableHeads.get(i).getText());
        }

        for (int i = 0; i <4 ; i++) {
            Assert.assertTrue("Tablo bilgisi hatali",!(actualUserPageTableDatas.get(i).getText()).isEmpty());
        }
    }

    @Then("LB Admin kullanici sayfayi kapatir.")
    public void lb_admin_kullanici_sayfayi_kapatir() {
        //Driver.closeDriver();
    }


    @And("LB Kullanici fake bir kayitli kullanici olusturur.")
    public void lbKullaniciFakeBirKayitliKullaniciOlusturur() {
        jse.executeScript("arguments[0].style.border = '3px solid black'", pages.accountMenu);
      //  ReusableMethods.waitFor(1);
        action.moveToElement(pages.accountMenu).click().perform();

        jse.executeScript("arguments[0].style.border = '3px solid black'", pages.registerButton);
      //  ReusableMethods.waitFor(1);
        action.moveToElement(pages.registerButton).click().perform();

        jse.executeScript("arguments[0].style.border = '3px solid black'", pages.ssnBox);
       // ReusableMethods.waitFor(1);
        pages.ssnBox.sendKeys(ConfigReader.getProperty("fake_ssn"));

        jse.executeScript("arguments[0].style.border = '3px solid black'", pages.firstnameBox);
      //  ReusableMethods.waitFor(1);
        pages.firstnameBox.sendKeys(ConfigReader.getProperty("fakefirstname"));

        jse.executeScript("arguments[0].style.border = '3px solid black'", pages.lastnameBox);
      //  ReusableMethods.waitFor(1);
        pages.lastnameBox.sendKeys(ConfigReader.getProperty("fakelastname"));

        jse.executeScript("arguments[0].style.border = '3px solid black'", pages.usernamebox);
     //   ReusableMethods.waitFor(1);
        pages.usernamebox.sendKeys(ConfigReader.getProperty("fakeusername"));

        jse.executeScript("arguments[0].style.border = '3px solid black'", pages.emailBox);
     //   ReusableMethods.waitFor(1);
        pages.emailBox.sendKeys(ConfigReader.getProperty("fakeemail"));

        jse.executeScript("arguments[0].style.border = '3px solid black'", pages.firstPasswordBox);
      //  ReusableMethods.waitFor(1);
        pages.firstPasswordBox.sendKeys(ConfigReader.getProperty("fakepassword"));

        jse.executeScript("arguments[0].style.border = '3px solid black'", pages.secondPasswordBox);
    //    ReusableMethods.waitFor(1);
        pages.secondPasswordBox.sendKeys(ConfigReader.getProperty("fakepassword"));

        jse.executeScript("window.scrollBy(0,400)");
        jse.executeScript("arguments[0].style.border = '3px solid black'", pages.registerSubmitButton);
        jse.executeScript("arguments[0].click();", pages.registerSubmitButton);
        ReusableMethods.waitFor(1);
    }

    @And("LB Admin kullanici Users listesinde fake kullanicinin Deactivated butonuna tiklar.")
    public void lbAdminKullaniciUsersListesindeFakeKullanicininDeactivatedButonunaTiklar() {

        jse.executeScript("arguments[0].style.border = '3px solid black'", pages.idButton);
        ReusableMethods.waitFor(1);
        action.moveToElement(pages.idButton).click().perform();



        ReusableMethods.waitForVisibility(pages.fakeUserDeactivatedButton,10);
       // jse.executeScript("window.scrollBy(0,300)");
        jse.executeScript("arguments[0].style.border = '3px solid black'", pages.fakeUserDeactivatedButton);
        ReusableMethods.waitFor(2);
        action.moveToElement(pages.fakeUserDeactivatedButton).click().perform();
        ReusableMethods.waitFor(1);

        jse.executeScript("arguments[0].style.border = '3px solid black'", pages.toastifyFrame);
        Assert.assertTrue(pages.toastifyFrame.isDisplayed());
        ReusableMethods.waitFor(1);

        Driver.getDriver().navigate().refresh();
        jse.executeScript("window.scrollBy(0,300)");
        jse.executeScript("arguments[0].style.border = '3px solid black'", pages.fakeUserDeactivatedButton);

    }

    @Then("LB Admin kullanici fake kaydin Activated oldugunu gorur.")
    public void lbAdminKullaniciFakeKaydinActivatedOldugunuGorur() {
        String expectedActivatedText="Activated";
        String actualActivatedText=pages.fakeUserDeactivatedButton.getText();
        //  System.out.println("pages.fakeUserDeactivatedButton.getText() = " + pages.fakeUserDeactivatedButton.getText());
        Assert.assertEquals("User can not activated",expectedActivatedText,actualActivatedText);


        ReusableMethods.waitFor(3);
        action.moveToElement(pages.fakeUserDeleteButton).click().perform();
        action.moveToElement(pages.comfirmDelete).click().perform();
    }

    @Given("LB Admin Users listesindeki fake kaydin Edit butonuna tiklar.")
    public void lb_admin_users_listesindeki_fake_kaydin_edit_butonuna_tiklar() {
        jse.executeScript("arguments[0].style.border = '3px solid black'", pages.idButton);
        ReusableMethods.waitFor(1);
        action.moveToElement(pages.idButton).click().perform();

        jse.executeScript("arguments[0].style.border = '4px solid black'", pages.fakeUserEditButton);
        jse.executeScript("arguments[0].style.border = '4px solid red'", pages.fakeUserTableRow);
        ReusableMethods.waitFor(3);
        action.moveToElement(pages.fakeUserEditButton).click().perform();
    }


    @Given("LB Admin kullanici Create or edit a user sayfasindaki Activated checkbox'a tiklar.")
    public void lb_admin_kullanici_create_or_edit_a_user_sayfasindaki_activated_checkbox_a_tiklar() {
        ReusableMethods.waitFor(1);

        jse.executeScript("window.scrollBy(0,500)");


        jse.executeScript("arguments[0].style.border = '3px solid black'", pages.activatedCheckBox);
        ReusableMethods.waitFor(1);
        jse.executeScript("arguments[0].click();", pages.activatedCheckBox);


    }

    @Given("LB Admin kullanici Profiles selectbox'ta fake kayda istedigi rolu atar.")
    public void lb_admin_kullanici_profiles_selectbox_ta_fake_kayda_istedigi_rolu_atar() {
        Select select=new Select(pages.profilesSelectBox);
        jse.executeScript("arguments[0].style.border = '3px solid black'", pages.profilesSelectBox);
        ReusableMethods.waitFor(1);
        select.selectByValue("ROLE_PATIENT");
        actualSelectBoxText=pages.profilesSelectBox.getAttribute("value");
    }


    @Given("LB Admin kullanici Save butonuna tiklar.")
    public void lb_admin_kullanici_save_butonuna_tiklar() {

        jse.executeScript("arguments[0].style.border = '3px solid black'", pages.editUserSaveButton);
        ReusableMethods.waitFor(1);
        jse.executeScript("arguments[0].click();", pages.editUserSaveButton);


    }

    @Then("LB Admin kullanici  A user is updated with yazisini gorur.")
    public void lbAdminKullaniciAUserIsUpdatedWithYazisiniGorur() {

        String expectedUserEditControlText="A user is updated with identifier lokmanfakeuser";
        ReusableMethods.waitForVisibility(pages.inPatientRoleAlert,10);
        actualUserEditControlText=pages.inPatientRoleAlert.getText();
        jse.executeScript("arguments[0].style.border = '4px solid black'", pages.inPatientRoleAlert);
      //  Assert.assertTrue("Mesaj görüntülenemedi",pages.inPatientRoleAlert.isDisplayed());
        Assert.assertEquals(expectedUserEditControlText,actualUserEditControlText);
        ReusableMethods.waitFor(2);

    }

    @Then("LB Admin kullanici fake kaydin Activated oldugunu ve sectigi rolu Profiles sutunuda gorur.")
    public void lb_admin_kullanici_fake_kaydin_activated_oldugunu_ve_sectigi_rolu_profiles_sutunuda_gorur() {
        jse.executeScript("arguments[0].style.border = '3px solid black'", pages.idButton);
        ReusableMethods.waitFor(1);
        action.moveToElement(pages.idButton).click().perform();

        jse.executeScript("arguments[0].style.border = '3px solid black'", pages.fakeUserDeactivatedButton);
        ReusableMethods.waitFor(1);
        String expectedActivatedText="Activated";
        String actualActivatedText=pages.fakeUserDeactivatedButton.getText();
        //  System.out.println("pages.fakeUserDeactivatedButton.getText() = " + pages.fakeUserDeactivatedButton.getText());
        Assert.assertEquals("User can not activated",expectedActivatedText,actualActivatedText);

        jse.executeScript("arguments[0].style.border = '3px solid black'", pages.fakeUserProfile);
        ReusableMethods.waitFor(2);
        String expectedUserProfileText="ROLE_PATIENT";
        String actualUserProfileText=pages.fakeUserProfile.getText();
        //  System.out.println("pages.fakeUserDeactivatedButton.getText() = " + pages.fakeUserDeactivatedButton.getText());
        Assert.assertEquals("User role assignment failed ",expectedUserProfileText,actualUserProfileText);

        ReusableMethods.waitFor(3);
        action.moveToElement(pages.fakeUserDeleteButton).click().perform();
        action.moveToElement(pages.comfirmDelete).click().perform();

    }

    @And("LB Admin kullanici sign out olur.")
    public void lbAdminKullaniciSignOutOlur() {

        jse.executeScript("document.body.style.zoom='65%';");
        jse.executeScript("arguments[0].style.border = '3px solid black'", pages.accountMenu);
        jse.executeScript("arguments[0].click();", pages.accountMenu);
      //  ReusableMethods.waitFor(1);
       // action.moveToElement(pages.accountMenu).click().perform();

        jse.executeScript("arguments[0].style.border = '3px solid black'", pages.signOut);
        jse.executeScript("arguments[0].click();", pages.signOut);
      //  ReusableMethods.waitFor(1);
       // action.moveToElement(pages.signOut).click().perform();



    }


    @And("LB Admin Users listesinde fake kaydin Delete butonuna tiklar.")
    public void lbAdminUsersListesindeFakeKaydinDeleteButonunaTiklar() {

        jse.executeScript("arguments[0].style.border = '3px solid black'", pages.idButton);
        ReusableMethods.waitFor(1);
        action.moveToElement(pages.idButton).click().perform();

        jse.executeScript("arguments[0].style.border = '4px solid black'", pages.fakeUserDeleteButton);
        jse.executeScript("arguments[0].style.border = '4px solid red'", pages.fakeUserTableRow);
        ReusableMethods.waitFor(3);
        action.moveToElement(pages.fakeUserDeleteButton).click().perform();
    }

    @And("LB Admin kullanici acilan {string} uyari yazisinda delete islemini onaylar.")
    public void lbAdminKullaniciAcilanUyariYazisindaDeleteIsleminiOnaylar(String arg0) {
        jse.executeScript("arguments[0].style.border = '3px solid black'", pages.comfirmDelete);
        ReusableMethods.waitFor(1);
        action.moveToElement(pages.comfirmDelete).click().perform();

    }

    @Then("LB Admin kullanici fake kaydin Users listesinden silindigini gorur.")
    public void lbAdminKullaniciFakeKaydinUsersListesindenSilindiginiGorur() {
        Driver.getDriver().navigate().refresh();
        action.moveToElement(pages.idButton).click().perform();
        ReusableMethods.waitFor(1);
        String ecpectedFakeUserSSN="545-45-1234";
        List<WebElement> actualFakeUserSSN=pages.usersListSSNColumn;

        for (WebElement w:actualFakeUserSSN) {
            Assert.assertNotEquals(ecpectedFakeUserSSN,w.getText());

        }

    }

    @Then("LB Admin kullanici  A user is deleted with identifier yazisini gorur.")
    public void lbAdminKullaniciAUserIsDeletedWithIdentifierYazisiniGorur() {
        String expectedUserDeleteControlText="A user is deleted with identifier lokmanfakeuser";
        ReusableMethods.waitForVisibility(pages.inPatientRoleAlert,10);
        String actualUserDeleteControlText=pages.inPatientRoleAlert.getText();
       // System.out.println("actualUserDeleteControlText = " + actualUserDeleteControlText);
        jse.executeScript("arguments[0].style.border = '4px solid black'", pages.inPatientRoleAlert);
        Assert.assertEquals(expectedUserDeleteControlText,actualUserDeleteControlText);
        ReusableMethods.waitFor(2);
    }
}
