package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class LokmanPage {

    public LokmanPage(){ PageFactory.initElements(Driver.getDriver(),this);}



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

    @FindBy(id= "entity-menu")
    public WebElement itemsTitlesMenu;

    @FindBy(xpath= "//*[text()='Patient']")
    public WebElement patientsMenu;

    @FindBy(id= "jh-create-entity")
    public WebElement createAPatient;

    @FindBy(xpath = "(//*[@class='col-md-8'])[2]")
    public WebElement createPatientForm;

    @FindBy(id= "admin-menu")
    public WebElement adminMenu;

    @FindBy(id= "account-menu")
    public WebElement accountMenu;

    @FindBy(xpath= "//span[text()='Sign out']")
    public WebElement signOut;


    @FindBy(xpath = "//*[text()='User management']")
    public WebElement usermanagementClick;
    @FindBy(xpath = "(//tbody/tr[1]/td[11]/div/a)[1]")
    public WebElement usersFirstEdit;

    @FindBy(xpath = "(//*[text()='Register'])[1]")
    public WebElement registerButton;

    @FindBy(id = "ssn")
    public WebElement ssnBox;

    @FindBy(id = "firstName")
    public WebElement firstnameBox;

    @FindBy(id = "lastName")
    public WebElement lastnameBox;

    @FindBy(id = "username")
    public WebElement usernameBox;

    @FindBy(id = "patient-firstName")
    public WebElement patientFirstName;

    @FindBy(id = "patient-lastName")
    public WebElement patientLastName;

    @FindBy(id = "email")
    public WebElement patientEmail;

    @FindBy(id = "patient-phone")
    public WebElement patientPhone;









    @FindBy(id = "email")
    public WebElement emailBox;

    @FindBy(id = "firstPassword")
    public WebElement firstPasswordBox;

    @FindBy(id = "secondPassword")
    public WebElement secondPasswordBox;

    @FindBy(id = "register-submit")
    public WebElement registerSubmitButton;

    @FindBy(id = "activated")
    public WebElement activatedCheckBox;

    @FindBy(id = "authorities")
    public WebElement profilesSelectBox;

    @FindBy(xpath= "//*[@class='Toastify__toast-body']")
    public WebElement registerToastify;

    @FindBy(xpath= "//span[text()='Save']")
    public WebElement editUserSaveButton;
    @FindBy(xpath= "//*[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement toastifyFrame;

    @FindBy(xpath = "//div/dl/dt")
    public List<WebElement> userPageTableHeads;

    @FindBy(xpath = "//div/dl/dd")
    public List<WebElement> userPageTableDatas;

    @FindBy(xpath = "(//*[@href='/physician-appointment'])[1]")
    public WebElement myappointmentsClick;

    @FindBy(xpath = "(//*[@href='/ps-in-patient'])[1]")
    public WebElement myinpatientsClick;

    @FindBy(xpath = "//tbody/tr[1]/td[13]")
    public WebElement firstEditButton;

    @FindBy(xpath = "//*[text()='Show Test Results']")
    public WebElement showTestResultsButton;


    @FindBy(xpath = "//tbody/tr/td[2]")
    public List<WebElement> testResultNameDatas;

    @FindBy(xpath = "//tbody/tr/td[3]")
    public List<WebElement> usersListSSNColumn;

    @FindBy(xpath = "//tbody/tr/td[1]")
    public List<WebElement> patientsIdMunbersColumn;

    @FindBy(xpath = "(//button[@type='button'])[2]")
    public WebElement requestInpatientButton;

    @FindBy(xpath = "//tbody/tr[1]/td[7]")
    public WebElement viewResultsButton;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement inPatientRoleAlert;

    @FindBy(xpath = "//*[text()='545-45-1234']/following-sibling::td[2]")
    public WebElement fakeUserDeactivatedButton;

    @FindBy(xpath = "//*[text()='545-45-1234']/following-sibling::td[4]")
    public WebElement fakeUserProfile;

    @FindBy(xpath = "//thead/tr/th[1]")
    public WebElement idButton;

    @FindBy(xpath = "//tbody/tr[1]/td[16]/div/a[1]")
    public WebElement patientsViewButton;

    @FindBy(xpath = "//*[@class='jh-entity-details']")
    public WebElement patientsViewForm;



    @FindBy(xpath = "//dl/dt")
    public List<WebElement> patientsViewFormTitles;

    @FindBy(xpath = "//dl/dd")
    public List<WebElement> patientsViewFormDatas;
    @FindBy(xpath = "//*[text()='545-45-1234']/following-sibling::td[8]/*/a[3]")
    public WebElement fakeUserDeleteButton;

    @FindBy(xpath = "//*[text()='lokman']/following-sibling::td[13]/div/a[3]")
    public WebElement fakePatientDeleteButton;

    @FindBy(xpath = "//*[text()='545-45-1234']/following-sibling::td[8]/*/a[2]")
    public WebElement fakeUserEditButton;

    @FindBy(xpath = "//*[text()='lokmanfakeuser']/ancestor::tr")
    public WebElement fakeUserTableRow;

    @FindBy(xpath = "//*[text()='unvalidx@gmail.com']/ancestor::tr")
    public WebElement fakePatientTableRow;

    @FindBy(xpath = "//*[text()='unvalidx@gmail.com']/ancestor::tr/td[1]")
    public WebElement fakePatientIdNumber;

    @FindBy(xpath = "(//span[text()='Delete'])[21]")
    public WebElement comfirmDelete;


    @FindBy(xpath = "(//*[@class='form-group'])[9]")
    public WebElement editUserEmailBox;

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

    @FindBy(id="patient-heading")
    public WebElement patientHeading;

//    @FindBy(xpath = "//span[normalize-space()='Save']")
//    public WebElement editinpatientSaveButton;

    @FindBy(id="in-patient-room")
    public WebElement roomSelectBox;

    @FindBy(xpath="//tbody")
    public WebElement table_tbody;

    @FindBy(xpath="//tbody/tr[1]")
    public WebElement tableFirstRow;
}
