package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HatemPage {
    public HatemPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }
    //Doctor locatleri

    @FindBy(xpath = "//*[@id='entity-menu']")                             public WebElement item_Titles;
    @FindBy(xpath = "//*[@class='dropdown-item'][3]")                     public WebElement physicianMenuItem;
    @FindBy(xpath ="//*[@id='app-view-container']")                       public WebElement PhysicianMenuIsDisplay;
    @FindBy(xpath="//span[text()='Create a new Physician']")              public WebElement PhysicianCreateNew;
    @FindBy(xpath="//input[@name='useSSNSearch']")                        public WebElement SSNSearchCheckBox;
    @FindBy(xpath ="//*[@id='searchSSN']")                                public  WebElement SSNSearchbox;
    @FindBy(xpath = "//div/button")                                       public WebElement SSNSearchButton;
    @FindBy(xpath ="//*[@id='admin-menu']")                               public WebElement AdminDropDownMenu;
    @FindBy(xpath = "//*[text()='User management']")                      public WebElement UserManagementMenu;

    @FindBy(xpath = "(//td//div//span[text()='ROLE_PHYSICIAN'])[1]")      public WebElement ROLE_PHYSICIAN;
    @FindBy(css ="(//td//div//a[@class='btn btn-primary btn-sm'])[1]")    public WebElement ROLE_PHYSICIANEdit;
    @FindBy(xpath ="//div//div//input[@placeholder='Your username']")     public WebElement doctoreditUserName;
    @FindBy(xpath ="//*[@placeholder='Your password']")                   public WebElement doctoreditPassword;
    @FindBy(xpath ="//*[@class='btn btn-primary']")                       public WebElement doctoreditSignIn;
    //Sign in Locatleri
    @FindBy(xpath="//*[@class='dropdown nav-item']")                      public WebElement SignInDropdown;
    @FindBy(xpath="//*[@id='login-item']")                                public WebElement SignInGiris;
    @FindBy(xpath ="//*[contains(@placeholder,'Your username')]")         public WebElement userName_box;
    @FindBy(xpath ="//*[contains(@placeholder,'Your password')]")         public WebElement userNamePassword_box;
    @FindBy(xpath ="//*[@class='btn btn-primary']")                       public WebElement SignInButton;
   //Staff Locatleri
    @FindBy(xpath="//*[@id='entity-menu']")                              public WebElement MyPageTabOnTheHomePage;
    @FindBy(xpath ="(//*[@class='dropdown-item'])[1]")                   public WebElement SearchPatientTabOnMyPage;
    @FindBy(xpath ="//*[@class='form-control']")                         public WebElement PatientSSNBox;
    @FindBy(xpath ="//*[text()='Show Appointments']")                    public WebElement ShowAppointments;
    @FindBy(xpath ="//*[text()='Edit']")                                 public WebElement AppointmentsEdit;
    @FindBy(xpath ="//*[text()='Show Tests']")                           public WebElement showTest;
    @FindBy(xpath ="//*[text()='Tests']")                                public WebElement testIsDisplayed;
    @FindBy(xpath ="//*[@placeholder='YYYY-MM-DD HH:mm']")               public WebElement birthDate;
    @FindBy(xpath ="//*[@id='patient-adress']")                          public WebElement patientAddress;
    @FindBy(xpath ="//*[@id='patient-description']")                     public WebElement patientDescription;









}
