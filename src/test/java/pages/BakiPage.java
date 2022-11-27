package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class BakiPage {

    public BakiPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//li[@id=\"account-menu\"]")
    public WebElement accountMenu2;

    @FindBy(xpath = "//span[text()='Sign in']")
    public WebElement ilkSignInButon;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameTextBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement ikinciSignInButon;

    @FindBy(id = "entity-menu")
    public WebElement myPagesMenu;

    @FindBy(linkText = "Make an Appointment")
    public WebElement makeAnAppointment;

    @FindBy (id = "appoDate")
    public WebElement date1;


    @FindBy (id = "register-submit")
    public WebElement registerSubmit;

    @FindBy(xpath = "//*[contains(text(), 'Appointment registration saved!')]")
    public WebElement appointmentRegistrationSaved;

    @FindBy(xpath = "//input[@name=\"phone\"]")
    public WebElement phone;

    //TC002 Locate
    @FindBy(xpath = "//*[contains(text(),'Hst Mehmet Demir')]")
    public WebElement hstMehmetDemir;

    @FindBy (xpath = "//*[contains(text(), 'Password')]")
    public WebElement accountMenuPasswordSekmesi;

    @FindBy(xpath = "//input[@name='newPassword']")
    public WebElement newPasswordTB;

    //renk1
    @FindBy(xpath = "//li[@style='background-color: rgb(255, 0, 0);']")
    public WebElement renk1;

    @FindBy (xpath = "//li[starts-with(@style,'background-color:')]")
    public List<WebElement> passwordStrenght;

    @FindBy(xpath = "//input[@id='confirmPassword']")
    public WebElement confirimPasswordTB;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement passwordConfirmationText;

    @FindBy (xpath = "//input[@name='currentPassword']")
    public WebElement currentPasswordTB;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement saveButton;

    @FindBy(xpath = "//*[text()='Password changed!']")
    public WebElement passwordChangedPopUp;

    @FindBy (xpath = "//*[(text()='An error has occurred!')]")
    public WebElement eskiSifreKullanilamiyorPopUp;


}
