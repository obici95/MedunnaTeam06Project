package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MehmetPages {

    public MehmetPages() {PageFactory.initElements(Driver.getDriver(), this);}


    @FindBy(xpath="//span[normalize-space()='CONTACT']")
    public WebElement anasayfaContact;
    @FindBy(xpath="//h2[normalize-space()='Contact']")
    public WebElement contactText;
    @FindBy(xpath="//input[@id='name']")
    public WebElement name;
    @FindBy(xpath="//input[@id='email']")
    public WebElement email;
    @FindBy(xpath="//input[@id='subject']")
    public WebElement subject;
    @FindBy(xpath="//textarea[@id='message']")
    public WebElement message;
    @FindBy(xpath="//button[@id='register-submit']")
    public WebElement sendButton;
    @FindBy(xpath="//div[@role='alert']")
    public WebElement yourMessageHasBeenReceived;
    @FindBy(xpath="//div[@class='Toastify__toast Toastify__toast--success toastify-toast']")
    public WebElement yourMessageHasBeenReceived2;



    @FindBy(xpath="//a[@class='d-flex align-items-center dropdown-toggle nav-link']//*[name()='svg']")
    public WebElement signInRegister;
    @FindBy(xpath="//span[normalize-space()='Sign in']")
    public WebElement signIn1;
    @FindBy(xpath="//input[@id='username']")
    public WebElement username;
    @FindBy(xpath="//input[@id='password']")
    public WebElement password;
    @FindBy(xpath="//button[@type='submit']//span[contains(text(),'Sign in')]")
    public WebElement signIn2;


    @FindBy(xpath="//span[normalize-space()='Administration']")
    public WebElement administration;

    @FindBy(xpath="//span[normalize-space()='Items&Titles']")
    public WebElement ItemsTitles;

    @FindBy(xpath="//span[normalize-space()='Country']")
    public WebElement Country;

    @FindBy(xpath="//span[normalize-space()='Countries']")
    public WebElement CountryDogrulamaYazısı;

    @FindBy(xpath="//a[@id='jh-create-entity']")
    public WebElement CreateAnewCountry;

    @FindBy(xpath="//*[@id='hospitalmsappfrontendApp.country.home.createOrEditLabel']/span")
    public WebElement CreateOrEditCountry;

    @FindBy(xpath="//input[@id='country-name']")
    public WebElement CreateOrEditCountryName;

    @FindBy(xpath="//span[normalize-space()='Save']")
    public WebElement CreateOrEditCountryNameSave;

    @FindBy(xpath="//div[@role='alert']")
    public WebElement CreateOrEditCountrySaveAlert;

    @FindBy(xpath="//a[@role='menuitem']//span[contains(text(),'State/City')]")
    public WebElement StateCityButonu;

    @FindBy(xpath="//span[normalize-space()='Create a new State/City']")
    public WebElement CreateStateCityButonu;


    @FindBy(xpath="//input[@id='c-state-name']")
    public WebElement CreateOrEditCityNameBox;

    @FindBy(xpath="//button[@id='save-entity']")
    public WebElement stateCitySaveButton;

    @FindBy(xpath="//div[@role='alert']")
    public WebElement cityStateSaveAlert;

    @FindBy(xpath="//button[@id='jhi-confirm-delete-country']")
    public WebElement countryDeleteConfirmButton;

    @FindBy(xpath="//div[@class='Toastify__toast Toastify__toast--success toastify-toast']")
    public WebElement countryDeletedAlert;

    @FindBy(xpath = "//input[@id='country-name']")
    public WebElement CountryEditNameBOx;

    @FindBy(xpath = "//button[@id='save-entity']")
    public WebElement CountryEditSaveButton;


    @FindBy(xpath = "//div[@role='alert']")
    public WebElement countryEditAlert;

    @FindBy(xpath = "//span[normalize-space()='Create a new Message']")
    public WebElement CreatemessageButton;

    @FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Messages')]")
    public WebElement messageButton;

    @FindBy(xpath = "//input[@id='c-message-name']")
    public WebElement createNewMessageNameTextBox;

    @FindBy(xpath = "//input[@id='c-message-email']")
    public WebElement createNewMessageEmailTextBox;

    @FindBy(xpath = "//input[@id='c-message-subject']")
    public WebElement createNewMessageSubjectTextBox;

    @FindBy(xpath = "//input[@id='c-message-message']")
    public WebElement createNewMessageMessageTextBox;

    @FindBy(xpath = "//span[normalize-space()='Save']")
    public WebElement createNewMessageSaveButton;

    @FindBy(xpath = "(//div[@role='alert'])[1]")
    public WebElement createNewMessageSaveAllert;

    @FindBy(xpath = "(//*[name()='svg'][@role='img'])[18]")
    public WebElement createNewMessageIdSıralamaButonu;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/div[1]/a[2]")
    public WebElement createNewMessageEditButonu;

    @FindBy(xpath = "//input[@id='c-message-name']")
    public WebElement createNewMessageEditNameTextBox;

    @FindBy(xpath = "//input[@id='c-message-email']")
    public WebElement createNewMessageEditEmailTextBox;

    @FindBy(xpath = "//input[@id='c-message-subject']")
    public WebElement createNewMessageEditSubjectTextBox;

    @FindBy(xpath = "//input[@id='c-message-message']")
    public WebElement createNewMessageEditMessageTextBox;

    @FindBy(xpath = "//span[normalize-space()='Save']")
    public WebElement createNewMessageSave2Button;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement createNewMessageSuccessMessage;

    @FindBy(xpath = "//button[@id='jhi-confirm-delete-cMessage']")
    public WebElement deleteConfirmMessageButton;






}
