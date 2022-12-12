package stepDefinitions.UIStepDefs.Mehmet;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.MehmetPages;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class us28stepDef {
    MehmetPages medunna = new MehmetPages();
    String countryName = "COMOLOKKO";
    String randomCountryId;
   
    @Then("kullanici insan ikonuna tıklar")
    public void kullaniciInsanIkonunaTıklar() {
        medunna.signInRegister.click();
        medunna.signIn1.click();
    }




    @And("kullanici  gecerli username ve gecerli password girer")
    public void kullaniciGecerliUsernameVeGecerliPasswordGirer() {
        medunna.username.sendKeys("Batch81");
        medunna.password.sendKeys("Batch81+");
    }

    @And("Sign in butonuna tiklar")
    public void signInButonunaTiklar() {
        medunna.signIn2.click();
    }

    @Given("kullanici admin sayfasının goruntulendigini dogrular")
    public void kullaniciAdminSayfasınınGoruntulendiginiDogrular() {
        Assert.assertTrue(medunna.administration.isDisplayed());
    }

    @Then("kullanici items and titles dropdown menu butonuna  tıklar")
    public void kullaniciItemsAndTitlesDropdownMenuButonunaTıklar() {
        medunna.ItemsTitles.click();
    }

    @Then("kullanici country butonuna tıklar")
    public void kullaniciCountryButonunaTıklar() {
        medunna.Country.click();
    }

    @Then("kullanici country sayfasinin goruntulendigini dogrular")
    public void kullaniciCountrySayfasininGoruntulendiginiDogrular() {
        Assert.assertTrue(medunna.CountryDogrulamaYazısı.isDisplayed());
    }

    @Then("kullanici create a new Country buttonuna tıklar")
    public void kullaniciCreateANewCountryButtonunaTıklar() {
        medunna.CreateAnewCountry.click();
    }

    @Then("kullanici Create or edit a Country sayfasinin goruntulendigini dogrular")
    public void kullaniciCreateOrEditACountrySayfasininGoruntulendiginiDogrular() {
        Assert.assertTrue(medunna.CreateOrEditCountry.isDisplayed());
    }

    @Then("kullanıcı textboxa {string} girer")
    public void kullanıcıTextboxaGirer(String arg0) {
        countryName = arg0;

        medunna.CreateOrEditCountryName.sendKeys(arg0);
    }

    @Then("kullanici  Create or edit a Country sayfasındaki  save button tiklar")
    public void kullaniciCreateOrEditACountrySayfasındakiSaveButtonTiklar()  {
        medunna.CreateOrEditCountryNameSave.click();
    }

    @And("kullanici a new country is created mesajinin goruntulenmedigini dogrular")
    public void kullaniciANewCountryIsCreatedMesajininGoruntulenmediginiDogrular() throws IOException, InterruptedException {
       Thread.sleep(2000);
        ReusableMethods.getScreenshot("country");
        Assert.assertFalse("a new country is created mesaji goruntulendi",medunna.CreateOrEditCountrySaveAlert.isDisplayed());
    }

    @Then("kullanici textboxa {string} gönderir")
    public void kullaniciTextboxaGönderir(String arg0) {
        medunna.CreateOrEditCountryName.sendKeys(arg0);
    }

    @And("kullanici a new country is created mesajinin goruntulendigini dogrular")
    public void kullaniciANewCountryIsCreatedMesajininGoruntulendiginiDogrular() {
    }



    @Then("kullanici create a new StateCity buttona tiklar")
    public void kullaniciCreateANewStateCityButtonaTiklar() {
        medunna.CreateStateCityButonu.click();
    }



    @Then("kullanici StateCity Save butonuna tiklar")
    public void kullaniciStateCitySaveButonunaTiklar() throws InterruptedException, IOException {
        medunna.stateCitySaveButton.click();
        Thread.sleep(1500);
        ReusableMethods.getScreenshot("error");


    }

    @And("kullanici a new CityState is created mesajini goruntulendigini dogrular")
    public void kullaniciANewCityStateIsCreatedMesajiniGoruntulendiginiDogrular()  {
        String actualText = medunna.cityStateSaveAlert.getText();
        Assert.assertTrue(actualText.contains("success"));

    }

    @Then("kullanici stateCity butonuna tiklar")
    public void kullaniciStateCityButonunaTiklar() {
        medunna.StateCityButonu.click();
    }

    @Then("kullanici stateCity sayfasinin acildigini dogrular")
    public void kullaniciStateCitySayfasininAcildiginiDogrular() {
        Assert.assertTrue(medunna.CreateStateCityButonu.isDisplayed());

}


    @Then("kullanici StateCity drop down dan CountyName secer.")
    public void kullaniciStateCityDropDownDanCountyNameSecer() {
        WebElement countryDropDown = Driver.getDriver().findElement(By.xpath("//select[@id='c-state-state']"));
        Select select = new Select(countryDropDown);

        select.selectByVisibleText(countryName);




    }

    @Then("kullanici name textboxa {string} ismi gonderir")
    public void kullaniciNameTextboxaIsmiGonderir(String city) {

        medunna.CreateOrEditCityNameBox.sendKeys(city);

    }

    @Then("kullanici listeden silmek istedigi ulkenin delete butonuna tiklar")
    public void kullaniciListedenSilmekIstedigiUlkeninDeleteButonunaTiklar() throws InterruptedException {

        int randomSatir = Faker.instance().random().nextInt(125, 355);
        WebElement deleteButton = Driver.getDriver().findElement(By.xpath("(//span[contains(text(),'Delete')])["+randomSatir+"]"));
        WebElement randomCountry = Driver.getDriver().findElement(By.xpath("//tbody/tr[" + randomSatir + "]/td[1]"));
        randomCountryId = randomCountry.getText();
        JSIntoViewAndClick(deleteButton);


    }

    @Then("kullanici silme islemini delete butonuna tiklayarak onaylar")
    public void kullaniciSilmeIsleminiDeleteButonunaTiklayarakOnaylar() throws InterruptedException {


        Thread.sleep(1500);
        medunna.countryDeleteConfirmButton.click();
    }

    @Then("kullanici silme isleminin basarili oldugu mesajinin goruntulendigini dogrular")
    public void kullaniciSilmeIslemininBasariliOlduguMesajininGoruntulendiginiDogrular() throws IOException, InterruptedException {

        String expectedText = "A Country is deleted with identifier "+randomCountryId;
        String actualText = medunna.countryDeletedAlert.getText();
        ReusableMethods.getScreenshot("CountryDelete");
        Assert.assertTrue(actualText.contains(expectedText));
        Thread.sleep(1500);


    }

    public void JSIntoView(WebElement element) {

        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);

    }

    public void JSIntoViewAndClick(WebElement element) {

        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", element);

    }

    @Then("kullanici listeden editlemek istedigi ulkenin Edit butonuna tiklar")
    public void kullaniciListedenEditlemekIstedigiUlkeninEditButonunaTiklar() {

        int randomSatir = Faker.instance().random().nextInt(125, 355);
        WebElement randomEditButton = Driver.getDriver().findElement(By.xpath("(//span[contains(text(),'Edit')])["+randomSatir+"]"));
        JSIntoViewAndClick(randomEditButton);


    }

    @Then("kullanici name textboxa random ulke ismi girer")
    public void kullaniciNameTextboxaRandomUlkeIsmiGirer() {

        String randomCountryName = Faker.instance().country().name();
        medunna.CountryEditNameBOx.clear();
        medunna.CountryEditNameBOx.sendKeys(randomCountryName);


    }

    @Then("kullanici CountryEdit sayfasindaki Save butonuna tiklar")
    public void kullaniciCountryEditSayfasindakiSaveButonunaTiklar() throws InterruptedException {
        Thread.sleep(1000);
        medunna.CountryEditSaveButton.click();
        Thread.sleep(1000);

    }

    @And("kullanici A Country is updated with identifier mesajinin goruntulendigini dogrular")
    public void kullaniciACountryIsUpdatedWithIdentifierMesajininGoruntulendiginiDogrular() throws IOException, InterruptedException {

        String expectedText = "A Country is updated with identifier";
        Thread.sleep(2000);
        String actualText = medunna.countryEditAlert.getText();
        ReusableMethods.getScreenshot("EditCountry");
        Assert.assertTrue(actualText.contains(expectedText));




    }
}

