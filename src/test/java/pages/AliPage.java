package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AliPage {

    public AliPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="//*[@class='d-none d-md-inline']")
    public WebElement makeAnAppointmentButonu;

    @FindBy(xpath = "//*[@id='firstName']")
    public WebElement firstnameButonu;

    @FindBy(xpath = "//*[@id='lastName']")
    public WebElement lastnameButonu;

    @FindBy(xpath = "//*[@id='ssn']")
    public WebElement ssnButonu;

    @FindBy(xpath = "//*[@id='email']")
    public WebElement emailButonu;

    @FindBy(xpath = "//*[@id='phone']")
    public WebElement phoneButonu;

    @FindBy(xpath = "//*[@id='register-submit']")
    public WebElement sendRequestButonu;

    @FindBy(xpath = "//*[@id='account-menu']")
    public WebElement accountMenuButonu;

    @FindBy(xpath = "//*[text()='ALEX Scientist']")
    public WebElement KullaniciIsim;

    @FindBy(xpath = "//*[@id='login-item']")
    public WebElement signInButonu;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement usernameButonu;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement passwordButonu;

    @FindBy(xpath = "(//*[text()='Sign in'])[3]")
    public WebElement signInGirisButonu;

    @FindBy(xpath = "//*[@id='entity-menu']")
    public WebElement entityButonu;

    @FindBy(xpath = "(//*[@class='dropdown-item'])[1]")
    public WebElement myAppointmentButonu;

    @FindBy(xpath = "//*[@id='appointment-heading']")
    public WebElement randevuDogrulama2;;

    @FindBy(xpath = "//div/table/tbody/tr/td")
    public WebElement randevuDogrulama;;
}
