package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KamilPages {

    public KamilPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[text()='Items&Titles']")
    public WebElement ItemsTitlesButton;

    @FindBy(xpath = "(//*[text()='Room'])[1]")
    public WebElement RoomButton;

    @FindBy(xpath = "//*[text()='Create a new Room']")
    public WebElement CreateRoomButton;

    @FindBy(xpath = "//input[@name='roomNumber']")
    public WebElement RoomNumberBox;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement RoomNumberBosHataMesji;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement RoomNumberRequedHataMesji;

    @FindBy(xpath = "//*[text()='Items&Titles']")
    public WebElement Items;

    @FindBy(xpath = "//select[@name='roomType']")
    public WebElement RoomTypeBox;

    @FindBy(xpath = " //*[text()='Status']")
    public WebElement StatusButton;

    @FindBy(xpath = "//input[@name='price']")
    public WebElement PriceBox;

    @FindBy(xpath = "//*[text()='This field is required.']")
    public WebElement PriceBoxBosHataMesaji;

    @FindBy(xpath = "//input[@name='description']")
    public WebElement DescriptionBox;

    @FindBy(xpath = "//input[@name='createdDate']")
    public WebElement CreatedDateBox;

    @FindBy(xpath = "//button[@id='save-entity']")
    public WebElement SaveBox;

    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement KayitMesji;

    @FindBy(xpath = "//*[contains(text(),'A new Room is updated')]")
    public WebElement KayitMesji2;

    @FindBy(xpath = "//*[text()='Administration']")
    public WebElement AdministrationButton;

    @FindBy(xpath = "//*[text()='User management']")
    public WebElement UserManagementButton;

    @FindBy(xpath = "(//th[@class='hand'])[1]")
    public WebElement IdButton;

    @FindBy(xpath = "//*[text()='Room Type']")
    public WebElement RoomTypeButton;

    @FindBy(xpath = "(//*[text()='View'])[1]")
    public WebElement ViewButton;

    @FindBy(xpath = "(//*[text()='Edit'])[1]")
    public WebElement EditButton;

    @FindBy(xpath = "//tbody//tr[1]//td[8]//a[2]")
    public WebElement EditButton2;


    @FindBy(xpath = "//tbody//tr[1]//td[8]//a[3]")
    public WebElement DeleteButton;

    @FindBy(xpath = "(//*[text()='Delete'])[21]")
    public WebElement IcDeleteButton;

    @FindBy(xpath = "//*[text()='Description']")
    public WebElement DescriptionButton;

    @FindBy(xpath = "//*[text()='Price']")
    public WebElement PriceButton;

    @FindBy(xpath = "//*[text()='Room Number']")
    public WebElement RoomNumberButton;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement PriceGecersizHataMesaji;

    @FindBy(xpath = "//div[contains(text(),\"deleted\")]")
    public WebElement DeleteMesaji;

    @FindBy(xpath = "//*[contains(text(),'A Room is updated with identifier')]")
    public WebElement UpdateMesaji;

}
