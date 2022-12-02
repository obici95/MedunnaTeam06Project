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
    @FindBy(xpath = "//*[@placeholder='Your email']")
    public WebElement ppointmentEmail;



}

