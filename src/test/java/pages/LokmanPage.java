package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class LokmanPage {

    public LokmanPage(){ PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(id="account-menu")
    public WebElement accountMenu;

    @FindBy(id="login-item")
    public WebElement signIn;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement usernamebox;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement passwordbox;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement signInButton;

    @FindBy(id= "entity-menu")
    public WebElement myPagesMenu;

    @FindBy(xpath = "(//*[@href='/physician-appointment'])[1]")
    public WebElement myappointmentsClick;

    @FindBy(xpath = "(//*[@href='/ps-in-patient'])[1]")
    public WebElement myinpatientsClick;

    @FindBy(xpath = "//tbody/tr[1]/td[13]")
    public WebElement firstEditButton;

    @FindBy(xpath = "//tbody/tr/td[13]")
    public List<WebElement> editButtonsSize;


    @FindBy(xpath = "//*[text()='Show Test Results']")
    public WebElement showTestResultsButton;

    @FindBy(xpath = "//tbody/tr/td")
    public List<WebElement> testResultAllDatas;

    @FindBy(xpath = "//tbody/tr/td[2]")
    public List<WebElement> testResultNameDatas;

    @FindBy(xpath = "(//button[@type='button'])[2]")
    public WebElement requestInpatientButton;

    @FindBy(xpath = "//tbody/tr[2]/td[7]")
    public WebElement viewResultsButton;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement inPatientRoleAlert;


    @FindBy(xpath = "//thead/tr/th")
    public List<WebElement> testResultsTheads;

    @FindBy(xpath = "//tbody//tr/td[8]")
    public List<WebElement> inpatientAppointmentsIds;

    @FindBy(xpath = "//tbody//tr/td[9]")
    public List<WebElement> inPatientDatas;

    @FindBy(xpath = "//thead/tr/th")
    public List<WebElement> inPatientTableHeads;

    @FindBy(xpath = "//tbody/tr/td")
    public List<WebElement> inPatientTableAllDatas;

    @FindBy(xpath = "//tbody/tr[1]/td[10]")
    public WebElement inPatientTableFirstEdit;

    @FindBy(xpath = "//*[@id='in-patient-status']")
    public WebElement statusSelectBox;

    @FindBy(id="save-entity")
    public WebElement editinpatientSaveButton;

    @FindBy(id="in-patient-room")
    public WebElement roomSelectBox;

    @FindBy(xpath="//tbody")
    public WebElement table_tbody;
}
