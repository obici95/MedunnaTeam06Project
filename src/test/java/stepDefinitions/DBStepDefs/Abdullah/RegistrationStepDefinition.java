package stepDefinitions.DBStepDefs.Abdullah;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.AbdullahPage;
import pojos.Abdullah.UserPojo;
import utilities.Driver;

import static stepDefinitions.DBStepDefs.Abdullah.E2ETestStepDefinition.registrant;
import static utilities.ReusableMethods.waitFor;


public class RegistrationStepDefinition {
    AbdullahPage registrationPage = new AbdullahPage();

    Faker faker = new Faker();
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

    public void sendData(WebElement element,String text){//dinamik olması için method
        element.sendKeys(text);
    }


    @Given("user is on the registration page")
    public void user_is_on_the_registration_page() {

        Driver.getDriver().get("https://medunna.com/account/register");

    }
    @Then("Kullanici, gecerli bir {string} numarasi girer aa")
    public void kullaniciGecerliBirNumarasiGirerAa(String ssn) {
        jse.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 4px solid black;');", registrationPage.ssnTextbox);
        waitFor(1);

        ssn = faker.idNumber().ssnValid();
        registrant = new UserPojo();
        registrant.setSsn(ssn);

        Driver.waitAndSendText(registrationPage.ssnTextbox,ssn,15);

    }

    @Given("user enters ssn number as {string}")
    public void user_enters_ssn_number_as(String ssn) {

        ssn = faker.idNumber().ssnValid();
        registrant = new UserPojo();
        registrant.setSsn(ssn);

        Driver.waitAndSendText(registrationPage.ssnTextbox,ssn,15);

        /*
        registrationPage.ssnTextbox.sendKeys(ssn);
        sendData(registrationPage.ssnTextbox,ssn);
        */

    }
    @And("Kullanici,gecerli bir {string} ve {string} girer aa")
    public void kullaniciGecerliBirVeGirerAa(String firstname, String lastname) {
        jse.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 4px solid black;');", registrationPage.firstnameTextbox);
        waitFor(1);
        firstname = faker.name().firstName();
        lastname = faker.name().lastName();

        //save the records into pojo
        registrant.setFirstName(firstname);
        registrant.setLastName(lastname);


        Driver.waitAndSendText(registrationPage.firstnameTextbox,firstname,5);
        jse.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 4px solid black;');", registrationPage.lastnameTextbox);
        waitFor(1);
        Driver.waitAndSendText(registrationPage.lastnameTextbox,lastname,7);


    }


    @Then("user enters firstname and lastname as {string} and {string}")
    public void user_enters_firstname_and_lastname_as_and(String firstname, String lastname) {


        firstname = faker.name().firstName();
        lastname = faker.name().lastName();

        //save the records into pojo
        registrant.setFirstName(firstname);
        registrant.setLastName(lastname);


        Driver.waitAndSendText(registrationPage.firstnameTextbox,firstname,5);
        Driver.waitAndSendText(registrationPage.lastnameTextbox,lastname,7);



    }

    @And("Kullanici,gecerli bir login {string} girer aa")
    public void kullaniciGecerliBirLoginGirerAa(String username) {
        jse.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 4px solid black;');", registrationPage.usernameTextbox);
        waitFor(1);
        username = registrant.getFirstName() + registrant.getLastName();

        registrant.setLogin(username);

        Driver.waitAndSendText( registrationPage.usernameTextbox,username,5);


    }

    @Then("user provides a username {string}")
    public void user_provides_a_username(String username) {

        username = registrant.getFirstName() + registrant.getLastName();

        registrant.setLogin(username);

        Driver.waitAndSendText( registrationPage.usernameTextbox,username,5);



    }

    @Then("user provides email id as {string}")
    public void user_provides_email_id_as(String email) {

        email = registrant.getLogin() + "@gmail.com";

        registrant.setEmail(email);

        Driver.waitAndSendText(registrationPage.emailTextbox,email,15);

    }
    @And("Kullanici,gecerli bir sifre {string} girer aa")
    public void kullaniciGecerliBirSifreGirerAa(String firstPassword) {
        jse.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 4px solid black;');", registrationPage.firstPasswordTextbox);
        waitFor(1);
        firstPassword = faker.internet().password(8,30,true,true);

        registrant.setPassword(firstPassword);

        Driver.waitAndSendText( registrationPage.firstPasswordTextbox,firstPassword,5);

    }

    @When("user enters the password as {string}")
    public void user_enters_the_password_as(String firstPassword) {

        firstPassword = faker.internet().password(8,30,true,true);

        registrant.setPassword(firstPassword);

        Driver.waitAndSendText( registrationPage.firstPasswordTextbox,firstPassword,5);


    }
    @And("Kullanici,gecerli sifreyi {string} tekrar girer aa")
    public void kullaniciGecerliSifreyiTekrarGirerAa(String secondPassword) {
        jse.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 4px solid black;');", registrationPage.newPasswordTextbox);
        waitFor(1);

        secondPassword = registrant.getPassword();

        Driver.waitAndSendText(registrationPage.newPasswordTextbox,secondPassword,5);
    }

    @When("user confirms the new password {string}")
    public void user_confirms_the_new_password(String secondPassword) {


        secondPassword = registrant.getPassword();

        Driver.waitAndSendText(registrationPage.newPasswordTextbox,secondPassword,5);
    }
    @Then("Kullanici, register butonuna basar ve basari mesajini dogrular")
    public void kullaniciRegisterButonunaBasarVeBasariMesajiniDogrular() {
        Driver.waitAndClick(registrationPage.registerSubmit);
    }

    @Then("user clicks on register button and sees the success message as {string}")
    public void user_clicks_on_register_button_and_sees_the_success_message_as(String expectedMessage) {

        Driver.waitAndClick(registrationPage.registerSubmit);

    }

    @Then("user reads all registrant data")
    public void user_reads_all_registrant_data() {
        System.out.println("registrant.toString() = " + registrant.toString());

    }






    @And("Kullanici,gecerli bir {string} girer aa")
    public void kullaniciGecerliBirGirerAa(String email) {
        jse.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 4px solid black;');", registrationPage.emailTextbox);
        waitFor(1);
        email = registrant.getLogin() + "@gmail.com";

        registrant.setEmail(email);

        Driver.waitAndSendText(registrationPage.emailTextbox,email,15);

    }







}
