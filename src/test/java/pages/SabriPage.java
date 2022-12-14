package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SabriPage {

    public SabriPage() { // Public Contructor olusturmamiz gerekir
        PageFactory.initElements(Driver.getDriver(), this);
        /*
        => Baska class'lardan WebElementlere ulasmamiz icin PageFactory class'indan initElements()
        methodunu kullanmamiz gerekir.
        => @FindBy notasyonunda driver olmadigi icin initElements() methodu icine Driver class'inda
        olusturdugumuz driver'i this keyword'u ile tanimladik.
        */
    }
    @FindBy(xpath = "//*[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement girisProfil;

    @FindBy(xpath = "//*[@id='login-item']")
    public WebElement signInProfile;

    @FindBy(xpath = "//*[@placeholder='Your username']")
    public WebElement userName;

    @FindBy(xpath = "//*[@placeholder='Your password']")
    public WebElement password;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement signInGiris;

    @FindBy(xpath = "(//*[@class='d-flex align-items-center dropdown-toggle nav-link'])[4]")
    public WebElement kullaniciProfil;

    @FindBy(xpath = "(//*[@class='dropdown-item'])[8]")
    public WebElement settings;

    @FindBy(xpath = "(//*[@class='dropdown-item'])[7]")
    public WebElement settings2;

    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement saveYazisi;



    @FindBy(xpath = "//*[@id='firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//*[@id='lastName']")
    public WebElement lastName;

    @FindBy(xpath = "//*[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//*[@id='email']")
    public WebElement save;

    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement savedYazisi;

    @FindBy(xpath = "(//*[@id='entity-menu'])[1]")
    public WebElement myPagesPatient;

    @FindBy(xpath = "(//*[@class='dropdown-item'])[2]")
    public WebElement makeAnAppointments;

    @FindBy(xpath = "//*[@placeholder='First Name']")
    public WebElement appointmentFirstName;

    @FindBy(xpath = "//*[@placeholder='Last Name']")
    public WebElement appointmentLastName;

    @FindBy(xpath = "//*[@placeholder='Your email']")
    public WebElement appointmentEmail;

    //************************ =>  US017  <= ***********************************************
    @FindBy(xpath = "//*[@id='entity-menu']")
    public WebElement itemsTitles;

    @FindBy(xpath = "(//*[@class='dropdown-item'])[5]")
    public WebElement testItem;

    @FindBy(xpath = "//*[@id='jh-create-entity']")
    public WebElement createNewTestItem;

    @FindBy(xpath = "//*[@id='hospitalmsappfrontendApp.cTestItem.home.createOrEditLabel']")
    public WebElement createOrEditTestItem;

    @FindBy(xpath = "//*[@id='c-test-item-name']")
    public WebElement name;

    @FindBy(xpath = "//*[@id='c-test-item-description']")
    public WebElement description;

    @FindBy(xpath = "//*[@id='c-test-item-price']")
    public WebElement price;

    @FindBy(xpath = "//*[@id='c-test-item-defaultValMin']")
    public WebElement defaultMinValue;

    @FindBy(xpath = "//*[@id='c-test-item-defaultValMax']")
    public WebElement defaultMaxValue;

    @FindBy(xpath = "//*[@id='c-test-item-createdDate']")
    public WebElement createdDate;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement saveButton;

    @FindBy(xpath = "(//*[@class='btn btn-info btn-sm'])[1]")
    public WebElement viewButton;

    @FindBy(xpath = "//h2")
    public WebElement testItemBasligi;

    @FindBy(xpath = "(//*[@class='hand'])[1]")
    public WebElement idButton;

    @FindBy(xpath = "(//*[@class='btn btn-danger btn-sm'])[1]")
    public WebElement deleteButton;

    @FindBy(xpath = "//*[@id='jhi-confirm-delete-cTestItem']")
    public WebElement deleteUyariButton;

    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement testItemDeletedYazisi;

    //************************ =>  US021  <= ***********************************************
    @FindBy(xpath = "(//*[@class='d-flex align-items-center dropdown-toggle nav-link'])[1]")
    public WebElement myPages;

    @FindBy(xpath = "(//*[@class='dropdown-item'])[1]")
    public WebElement searchPatient;

    @FindBy(xpath = "//*[@class='form-control']")
    public WebElement ssnMetinKutusu;

    @FindBy(xpath = "(//*[@class='d-none d-md-inline'])[3]")
    public WebElement showAppointment;

    @FindBy(xpath = "//*[@class='btn btn-warning btn-sm']")
    public WebElement editButton;

    @FindBy(xpath = "//h2")
    public WebElement createOrEditAnAppointmentBasligi;

    @FindBy(xpath = "//*[@id='appointment-status']")
    public WebElement statusBox;

    @FindBy(xpath = "//*[@value='UNAPPROVED']")
    public WebElement unapproved;

    @FindBy(xpath = "//*[@value='PENDING']")
    public WebElement pending;

    @FindBy(xpath = "//*[@value='CANCELLED']")
    public WebElement cancelled;

    @FindBy(xpath = "//*[text()='COMPLETED']")
    public WebElement completed;

    @FindBy(xpath = "//*[@id='appointment-anamnesis']")
    public WebElement anamnesis;

    @FindBy(xpath = "//*[@id='appointment-treatment']")
    public WebElement treatment;

    @FindBy(xpath = "//*[@id='appointment-diagnosis']")
    public WebElement diagnosis;

    @FindBy(xpath = "//*[@id='appointment-physician']")
    public WebElement physician;

    @FindBy(xpath = "//*[@id='save-entity']")
    public WebElement appointmentSave;

    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement savedYazisiUS21;

    @FindBy(xpath = "//*[@class='appointment-btn scrollto']")
    public WebElement makeAnAppointment;

    @FindBy(xpath = "//*[@id='firstName']")
    public WebElement firstNameUS21;

    @FindBy(xpath = "//*[@id='lastName']")
    public WebElement lastNameUS21;

    @FindBy(xpath = "//*[@id='ssn']")
    public WebElement ssn;

    @FindBy(xpath = "//*[@id='email']")
    public WebElement emailUS21;

    @FindBy(xpath = "//*[@id='phone']")
    public WebElement phone;

    @FindBy(xpath = "(//div//option)[9]")
    public WebElement selectedPhysician;


}

