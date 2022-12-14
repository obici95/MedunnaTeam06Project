package stepDefinitions.UIStepDefs.Abdullah;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AbdullahPage;
import pojos.Abdullah.MessagePojo;
import utilities.ConfigReader;
import utilities.Driver;


import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.DatabaseUtility.createConnection;
import static utilities.DatabaseUtility.getRowMap;
import static utilities.ReusableMethods.waitFor;
import static utilities.ReusableMethods.waitForVisibility;

public class US_026_027_StepDefinitions {
    Map<String, Object> actualData;
    String query;

    public static MessagePojo messagePojo = new MessagePojo();
    AbdullahPage US26 = new AbdullahPage();
    Actions action = new Actions(Driver.getDriver());
    Faker faker = new Faker();

    public static void enterField(String fieldValue, String fieldName) {
        By locator = By.xpath("//*[text()='" + fieldName + "']//parent::label//following-sibling::div//child::input");
        Driver.getDriver().findElement(locator).sendKeys(fieldValue);
    }

    public static void enterField(String fieldName, String fieldValue, String fieldTarget) {
        By locator = By.xpath("//label[text()='" + fieldName + "']//following-sibling::" + fieldTarget + "");
        Driver.getDriver().findElement(locator).sendKeys(fieldValue);

    }

    public static void selectAndClick(String fieldValue, String fieldName) {
        By locator = By.xpath("//*[text()='" + fieldValue + "']//following-sibling::td//*[text()='" + fieldName + "']");
        Driver.getDriver().findElement(locator).click();
    }


    public static void click(String fieldName) {
        By locator = By.xpath("//span[text()='" + fieldName + "']");
        Driver.getDriver().findElement(locator).click();
    }


    @Given("AA User goes to {string} homepage")
    public void aa_user_goes_to_homepage(String istenenURL) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenURL));
    }

    @When("AA {string} clicks on {string}")
    public void aa_clicks_on(String string, String fieldName) {
        waitFor(1);
        click(fieldName);
    }


    @And("AA {string} enters {string} for name")
    public void aaEntersForName(String fieldValue, String fieldName) {
        String fieldTarget = "input";
        action.sendKeys(Keys.PAGE_DOWN).perform();
        fieldValue = faker.name().name();
        messagePojo.setName(fieldValue);
        enterField(fieldName, fieldValue, fieldTarget);
    }

    @And("AA {string} enters {string} for e-mail")
    public void aaEntersForEMail(String fieldValue, String fieldName) {
        String fieldTarget = "input";
        fieldValue = faker.internet().emailAddress();
        messagePojo.setEmail(fieldValue);
        enterField(fieldName, fieldValue, fieldTarget);

    }

    @And("AA {string} enters {string} for subject")
    public void aaEntersForSubject(String fieldValue, String fieldName) {
        String fieldTarget = "input";
        fieldValue = faker.name().title();
        messagePojo.setSubject(fieldValue);
        enterField(fieldName, fieldValue, fieldTarget);
    }

    @And("AA {string} enters {string} for message")
    public void aaEntersForMessage(String fieldValue, String fieldName) {
        String fieldTarget = "textarea";
        fieldValue = faker.lordOfTheRings().character();
        messagePojo.setMessage(fieldValue);
        enterField(fieldName, fieldValue, fieldTarget);
    }

    @And("AA {string} clicks on {string} button")
    public void aaClicksOnButton(String arg0, String fieldName) {
        waitFor(1);
        action.sendKeys(Keys.PAGE_DOWN).perform();
        waitFor(1);
        click(fieldName);

    }


    @Then("AA {string} confirms that {string}")
    public void aaConfirmsThat(String arg0, String message) {
        By locator = By.xpath("//*[contains(text(),'" + message + "')]");
        assertTrue(waitForVisibility(locator, 2).isDisplayed());

    }


    @Given("AA {string} logs into the medunna page with valid credentials {string} and {string}")
    public void logsIntoTheMedunnaPageWithValidCredentialsAnd(String arg0, String username, String password) {
        US26.accountMenu.click();
        US26.ilkSignIn.click();
        US26.username.sendKeys(ConfigReader.getProperty(username));
        US26.password.sendKeys(ConfigReader.getProperty(password));
        US26.ikinciSignIn.click();

    }


    @And("AA {string} clicks {string} button in the drop-down list")
    public void aaClicksButtonInTheDropDownList(String arg0, String arg1) {
        US26.Messages.click();
    }

    @And("AA  {string} verifies that they can view the {string}, its {string} and the {string} on the page that opens.")
    public void aaVerifiesThatTheyCanViewTheItsAndTheOnThePageThatOpens(String arg0, String messages, String name, String email) {
        click("ID");
        messages = messagePojo.getMessage();
        System.out.println("message = " + messagePojo.getMessage());
        System.out.println("name = " + messagePojo.getName());
        System.out.println("email = " + messagePojo.getEmail());
        By locator = By.xpath("//*[contains(text(),'" + messages + "')]");
        assertTrue(waitForVisibility(locator, 1).isDisplayed());
        name = messagePojo.getName();
        By locator1 = By.xpath("//*[contains(text(),'" + name + "')]");
        assertTrue(waitForVisibility(locator1, 1).isDisplayed());
        email = messagePojo.getEmail();
        By locator2 = By.xpath("//*[contains(text(),'" + email + "')]");
        assertTrue(waitForVisibility(locator2, 1).isDisplayed());
    }

    @And("AA  {string} only {string} the verified {string}")
    public void aaOnlyTheVerified(String arg0, String fieldName, String message) {
        message = messagePojo.getMessage();
        selectAndClick(message, fieldName);
    }

    @And("AA  {string}  {string} the verified {string}")
    public void aaTheVerified(String arg0, String fieldName, String message) {
        message = messagePojo.getMessage();
        selectAndClick(message, fieldName);
        waitForVisibility(US26.deleteButton, 1).click();

    }

    @And("AA {string} enters {string} for name on the page that opens")
    public void aaEntersOnThePageThatOpens(String fieldValue, String fieldName) {
        fieldValue = faker.name().username();
        messagePojo.setName(fieldValue);
        waitFor(1);
        enterField(fieldValue, fieldName);

    }

    @And("AA {string} enters {string} for email on the page that opens")
    public void aaEntersForEmailOnThePageThatOpens(String fieldValue, String fieldName) {
        fieldValue = faker.internet().emailAddress();
        messagePojo.setEmail(fieldValue);
        waitFor(1);
        enterField(fieldValue, fieldName);
    }

    @And("AA {string} enters {string} for subject on the page that opens")
    public void aaEntersForSubjectOnThePageThatOpens(String fieldValue, String fieldName) {
        fieldValue = faker.name().title();
        messagePojo.setSubject(fieldValue);
        waitFor(1);
        enterField(fieldValue, fieldName);
    }

    @And("AA {string} enters {string} for message on the page that opens")
    public void aaEntersForMessageOnThePageThatOpens(String fieldValue, String fieldName) {
        fieldValue = faker.lordOfTheRings().character();
        messagePojo.setMessage(fieldValue);
        waitFor(1);
        enterField(fieldValue, fieldName);
    }

    @And("AA {string} clicks on {string} button to save")
    public void aaClicksOnButtonToSave(String arg0, String fieldName) {
        waitFor(2);
        click(fieldName);


    }


    @And("AA {string} enters a new {string} for name on the page that opens")
    public void aaEntersANewForNameOnThePageThatOpens(String fieldValue, String fieldName) {
        fieldValue = faker.name().username();
        messagePojo.setName(fieldValue);
        waitFor(1);
        By locator = By.xpath("//*[text()='" + fieldName + "']//parent::label//following-sibling::div//child::input");
        Driver.getDriver().findElement(locator).clear();
        enterField(fieldValue, fieldName);
    }

    @And("AA {string} enters a new {string} for email on the page that opens")
    public void aaEntersANewForEmailOnThePageThatOpens(String fieldValue, String fieldName) {
        fieldValue = faker.internet().emailAddress();
        messagePojo.setEmail(fieldValue);
        waitFor(1);
        By locator = By.xpath("//*[text()='" + fieldName + "']//parent::label//following-sibling::div//child::input");
        Driver.getDriver().findElement(locator).clear();
        enterField(fieldValue, fieldName);

    }

    @And("AA {string} enters a new {string} for subject on the page that opens")
    public void aaEntersANewForSubjectOnThePageThatOpens(String fieldValue, String fieldName) {
        fieldValue = faker.name().title();
        messagePojo.setSubject(fieldValue);
        waitFor(1);
        By locator = By.xpath("//*[text()='" + fieldName + "']//parent::label//following-sibling::div//child::input");
        Driver.getDriver().findElement(locator).clear();
        enterField(fieldValue, fieldName);
    }

    @And("AA {string} enters a new {string} for message on the page that opens")
    public void aaEntersANewForMessageOnThePageThatOpens(String fieldValue, String fieldName) {
        fieldValue = faker.rickAndMorty().character();
        messagePojo.setMessage(fieldValue);
        waitFor(1);
        By locator = By.xpath("//*[text()='" + fieldName + "']//parent::label//following-sibling::div//child::input");
        Driver.getDriver().findElement(locator).clear();
        enterField(fieldValue, fieldName);
    }

    @And("AA {string} clicks on {string} button to save at last")
    public void aaClicksOnButtonToSaveAtLast(String arg0, String fieldName) {
        waitFor(2);
        action.sendKeys(Keys.PAGE_DOWN).perform();
        click(fieldName);
        waitFor(2);
        click("ID");
    }

    @Given("AA The user connects to database")
    public void aaTheUserConnectsToDatabase() {
        createConnection();
    }

    @When("AA The user pulls relevant message information from the database")
    public void aaTheUserPullsRelevantMessageInformationFromTheDatabase() {
        actualData = getRowMap("select*from public.cmessage where email ='" + messagePojo.getEmail() + "';");
        System.out.println("actualData = " + actualData);
    }

    @Then("AA The user validates message information from coming to the database")
    public void aaTheUserValidatesMessageInformationFromComingToTheDatabase() {
        assertEquals(messagePojo.getEmail(),actualData.get("email"));
        assertEquals(messagePojo.getName(),actualData.get("name"));
        assertEquals(messagePojo.getSubject(),actualData.get("subject"));
        assertEquals(messagePojo.getMessage(),actualData.get("message"));

    }


}
