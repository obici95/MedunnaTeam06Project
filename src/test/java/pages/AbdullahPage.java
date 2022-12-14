package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AbdullahPage {
    public AbdullahPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    //Registration Page

    @FindBy(id = "ssn")
    public WebElement ssnTextbox;
    @FindBy(name = "firstName")
    public WebElement firstnameTextbox;
    @FindBy(name = "lastName")
    public WebElement lastnameTextbox;
    @FindBy(name = "username")
    public WebElement usernameTextbox;
    @FindBy(id = "email")
    public WebElement emailTextbox;
    @FindBy(name = "firstPassword")
    public WebElement firstPasswordTextbox;
    @FindBy(name = "secondPassword")
    public WebElement newPasswordTextbox;
    @FindBy(id = "register-submit")
    public WebElement registerSubmit;
    @FindBy(xpath = "//*[text()='Registration saved!']")
    public WebElement successMessageToastContainer;

    //US_003 page

    @FindBy(id = "account-menu")
    public WebElement accountMenu;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
    public WebElement registerButton;

    @FindBy(xpath = "//input[@id='firstPassword']")
    public WebElement firstPasswordInput;

    @FindBy(xpath = "//input[@id='secondPassword']")
    public WebElement secondPassword;

    @FindBy(xpath = "//div[text()='Your password is required to be at least 4 characters.']")
    public List<WebElement> invalidFeedbackList;

    @FindBy(xpath = "//div[text()='Your password is required to be at least 4 characters.']")
    public WebElement invalidFeedback;

    @FindBy(xpath = "(//ul)[2]/li[@style='background-color: rgb(221, 221, 221);']")
    public List<WebElement> strenghtLevel;

    //US_004 Page
    @FindBy(css = "#login-item")
    public WebElement ilkSignIn;

    @FindBy(css = ".modal-title")
    public WebElement textSignIn;

    @FindBy(css = "input[name=username]")
    public WebElement username;

    @FindBy(css = "input[name=password]")
    public WebElement password;
    @FindBy(css = ".btn.btn-primary")
    public WebElement ikinciSignIn;
    @FindBy( xpath = "//span[text()='Team06 Team06']")
    public WebElement Team06;

    @FindBy(css =".alert.alert-danger.fade.show")
    public WebElement failText;

    @FindBy(css = "#rememberMe")
    public WebElement rememberMe;

    @FindBy(xpath = "//input[@value='true']")
    public WebElement rememberMeTrue;

    @FindBy(xpath = "//span[text()='Sign out']")
    public WebElement signOut;

    @FindBy(xpath = "//span[text()='Did you forget your password?']")
    public WebElement didYouForgetYourPassword;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement resetEmailInput;

    @FindBy(xpath = "//span[text()='Reset password']")
    public WebElement resetPasswordButton;

    @FindBy(xpath = "//div[contains(@class,'toast-body')]")
    public WebElement checkYourEmailsAllert;

    @FindBy(xpath= "//span[text()='Register a new account']")
    public WebElement registerANewAccount;

    @FindBy(xpath = "//span[text()='Cancel']")
    public WebElement cancelButton;

    //US_026 locations

    @FindBy(xpath = "//*[text()='CONTACT']")
    public WebElement CONTACT;
    @FindBy(xpath= "(//div[@role='menu'])[1]")
    public WebElement ItemsAndTitlesDropDownMenu;
    @FindBy(css = ".svg-inline--fa.fa-envelope-open-text.fa-w-16.fa-fw ")
    public WebElement Messages;
    @FindBy(css = "#jhi-confirm-delete-cMessage")
    public WebElement deleteButton;






}
