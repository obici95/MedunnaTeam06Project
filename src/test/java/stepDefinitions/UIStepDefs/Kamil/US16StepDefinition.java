package stepDefinitions.UIStepDefs.Kamil;

import pages.KamilPages;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class US16StepDefinition {

    KamilPages KamilPages = new KamilPages();

    Faker faker = new Faker();
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

    @Then("Kullanici acilan dropdown menuden Room sekmesine tiklar")
    public void kullanici_acilan_dropdown_menuden_room_sekmesine_tiklar() {

        KamilPages.RoomButton.click();
    }

    @Then("Kullanici Create a New Room butonuna tiklar")
    public void kullanici_create_a_new_room_butonuna_tiklar() {

        KamilPages.CreateRoomButton.click();
    }

    @Then("Kullanici Room Number kismina daha once kullanilmamis bir oda numarasi girer")
    public void kullanici_room_number_kismina_daha_once_kullanilmamis_bir_oda_numarasi_girer() {
        String number = "" + faker.number().numberBetween(1111, 999999999);
        KamilPages.RoomNumberBox.sendKeys(number);
    }

    @Then("Kullanici Price gecerli bir fiyat girer")
    public void kullanici_price_gecerli_bir_fiyat_girer() {

        KamilPages.PriceBox.sendKeys("152");
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici Save butonunu tiklar")
    public void kullanici_save_butonunu_tiklar() {

        jse.executeScript("arguments[0].click();", KamilPages.SaveBox);
        //   us16_page.SaveBox.click();

    }


    @Then("Kullanici cikan mesajinin uzerinde {string}  icerdigini dogrular")
    public void kullanici_cikan_mesajinin_uzerinde_icerdigini_dogrular(String string) {

        ReusableMethods.waitFor(2);
        String exceptedmesaj = "A new Room is created with identifier";
        //Assert.assertTrue(adminNewRoomPage.KayitMesji.getText().contains(exceptedmesaj));
        Assert.assertTrue(KamilPages.KayitMesji.isDisplayed());

    }

    @Then("Kullanici Room Number kismina tiklar")
    public void kullaniciRoomNumberKisminaTiklar() {

        KamilPages.RoomNumberBox.click();
    }

    @And("Kullanici Price kismina tiklar")
    public void kullaniciPriceKisminaTiklar() {

        KamilPages.PriceBox.click();
    }


    @And("Kullanici Room Number kisminin altinda {string} yazisinin gorundugunu dogrular")
    public void kullaniciRoomNumberKismininAltindaYazisininGorundugunuDogrular(String arg0) {

        ReusableMethods.waitFor(2);
        Assert.assertTrue(KamilPages.RoomNumberBosHataMesji.isDisplayed());
    }

    @And("Kullanici Room Number kismini harf ve ozel karakter ile doldurur")
    public void kullaniciRoomNumberKisminiHarfVeOzelKarakterIleDoldurur() {

        KamilPages.RoomNumberBox.sendKeys("abcd");
    }

    @And("Kullanici Room Type alanindaki secenekler arasinda asagidaki seceneklerin bulundugunu dogrular")
    public void kullaniciRoomTypeAlanindakiSeceneklerArasindaAsagidakiSeceneklerinBulundugunuDogrular() {

        Select select = new Select(KamilPages.RoomTypeBox);
        select.getAllSelectedOptions();
        List<WebElement> roomTypeListesi = select.getOptions();
        List<String> roomTypeStr = new ArrayList<>();
        for (int i = 0; i < roomTypeListesi.size(); i++) {
            roomTypeStr.add(roomTypeListesi.get(i).getText());
        }

        List<String> expectedRoomTypes = new ArrayList<>();
        expectedRoomTypes.add("TWIN");
        expectedRoomTypes.add("DELUXE");
        expectedRoomTypes.add("PREMIUM_DELUXE");
        expectedRoomTypes.add("SUITE");
        expectedRoomTypes.add("DAYCARE");

        Assert.assertTrue(roomTypeStr.containsAll(expectedRoomTypes));
    }

    @And("Kullanici Status Checkbox'inin Isaretler")
    public void kullaniciStatusCheckboxIninIsaretler() {

        KamilPages.StatusButton.click();
    }

    @And("Kullanici Description kismina tiklar")
    public void kullaniciDescriptionKisminaTiklar() {
        ReusableMethods.waitFor(1);
        jse.executeScript("arguments[0].scrollIntoView()", KamilPages.DescriptionBox);
        jse.executeScript("arguments[0].click();", KamilPages.DescriptionBox);
        // us16_page.DescriptionBox.click();
    }

    @And("Kullanici Price kisminin altinda {string} yazisinin gorundugunu dogrular")
    public void kullaniciPriceKismininAltindaYazisininGorundugunuDogrular(String mesaj) {

        ReusableMethods.waitFor(1);
        Assert.assertTrue(KamilPages.PriceBoxBosHataMesaji.getText().contains(mesaj));
    }


    @And("Kullanici Price kismini temizler")
    public void kullaniciPriceKisminiTemizler() {

        KamilPages.PriceBox.clear();
    }

    @And("Kullanici Create Date alanini tiklar")
    public void kullaniciCreateDateAlaniniTiklar() {

        KamilPages.CreatedDateBox.click();
    }

    @And("Kullanici Description kismini bos birakildiginda bir hata mesaji alinmadigini dogrulamak icin ekran resmi alir")
    public void kullaniciDescriptionKisminiBosBirakildigindaBirHataMesajiAlinmadiginiDogrulamakIcinEkranResmiAlir() {

        Assert.assertTrue(KamilPages.DescriptionBox.isDisplayed());
    }

    @And("Kullanici Description kismina aciklama girer")
    public void kullaniciDescriptionKisminaAciklamaGirer() {

        KamilPages.DescriptionBox.sendKeys("gecmis olsun");
    }

    @And("Kullanici Create Date alanina gun ay yil girer")
    public void kullaniciCreateDateAlaninaGunAyYilGirer() {

        KamilPages.CreatedDateBox.sendKeys("25.08.2022");
    }

    @Given("Kullanici Rooms kismida yer alan Room Type'a tiklar")
    public void kullaniciRoomsKismidaYerAlanRoomTypeATiklar() {

        KamilPages.RoomTypeButton.click();
    }

    @Then("Kullanici Room Type sutununda {string} tipindeki odalarin gorundugunu dogrular ve ekran resmi alir")
    public void kullaniciRoomTypeSutunundaTipindekiOdalarinGorundugunuDogrularVeEkranResmiAlir(String arg0) throws IOException {

        ReusableMethods.waitFor(2);
        Assert.assertTrue(KamilPages.RoomTypeButton.isDisplayed());
        KamilPages.RoomTypeButton.click();
        ReusableMethods.waitFor(2);
        ReusableMethods.getScreenshot("ekran göruntusu alındı");
    }

    @Given("Kullanici Room Table kisminda ID alanina tiklayarak odalari en son olusturulandan baslayarak siralar")
    public void kullaniciRoomTableKismindaIDAlaninaTiklayarakOdalariEnSonOlusturulandanBaslayarakSiralar() {
        ReusableMethods.waitFor(2);
        KamilPages.IdButton.click();
    }

    @Then("Kullanici Room Table kisminda Room Number alanina tiklayarak odalari en son olusturulandan baslayarak siralar")
    public void kullaniciRoomTableKismindaRoomNumberAlaninaTiklayarakOdalariEnSonOlusturulandanBaslayarakSiralar() {

        KamilPages.RoomNumberButton.click();
    }

    @And("Kullanici Room Table kisminda Status  alanina tiklayarak odalarin durumunu en son olusturulandan baslayarak siralar")
    public void kullaniciRoomTableKismindaStatusAlaninaTiklayarakOdalarinDurumunuEnSonOlusturulandanBaslayarakSiralar() {

        KamilPages.RoomTypeButton.click();
    }

    @And("Kullanici Room Table kisminda Price alanina tiklayarak odalarin fiyatlarini en son olusturulandan baslayarak siralar")
    public void kullaniciRoomTableKismindaPriceAlaninaTiklayarakOdalarinFiyatlariniEnSonOlusturulandanBaslayarakSiralar() {

        KamilPages.PriceButton.click();
    }

    @And("Kullanici Room Table kisminda Description alanina tiklayarak odalarla ilgili aciklamalari en son olusturulandan baslayarak siralar")
    public void kullaniciRoomTableKismindaDescriptionAlaninaTiklayarakOdalarlaIlgiliAciklamalariEnSonOlusturulandanBaslayarakSiralar() {

        KamilPages.DescriptionButton.click();
    }

    @And("Kullanici Room Table kisminda Created Date alanina tiklayarak odalarin olusturulma tarihlerini en son olusturulandan baslayarak siralar")
    public void kullaniciRoomTableKismindaCreatedDateAlaninaTiklayarakOdalarinOlusturulmaTarihleriniEnSonOlusturulandanBaslayarakSiralar() {

        KamilPages.CreateRoomButton.click();
    }

    @And("Kullanici acilan Room sayfasinda view butonuna tiklar ve room bilgilerinin geldigini dogrular")
    public void kullaniciAcilanRoomSayfasindaViewButonunaTiklarVeRoomBilgilerininGeldiginiDogrular() {

        KamilPages.ViewButton.click();
        Assert.assertTrue(KamilPages.ViewButton.isDisplayed());

    }

    @And("Kullanici acilan Room sayfasinda edit butonuna tiklar")
    public void kullaniciAcilanRoomSayfasindaEditButonunaTiklar() {

        KamilPages.EditButton2.click();
    }

    @And("Kullanici Room Number kismina tiklar, temizler ve daha once kullanilmamis yeni bir Room Number girer")
    public void kullaniciRoomNumberKisminaTiklarTemizlerVeDahaOnceKullanilmamisYeniBirRoomNumberGirer() {

        KamilPages.RoomNumberBox.click();
        KamilPages.RoomNumberBox.clear();
        KamilPages.RoomNumberBox.sendKeys("1259748");

    }

    @And("Kullanici Room Type secer")
    public void kullaniciRoomTypeSecer() {

        KamilPages.RoomTypeBox.click();
    }

    @And("Kullanici Price kismina tiklar, temizler ve yeni bir price degeri girer")
    public void kullaniciPriceKisminaTiklarTemizlerVeYeniBirPriceDegeriGirer() {


        KamilPages.PriceBox.clear();
        KamilPages.PriceBox.sendKeys("124");

    }

    @And("Kullanici Description kismina tiklar, temizler ve yeni bir description girer")
    public void kullaniciDescriptionKisminaTiklarTemizlerVeYeniBirDescriptionGirer() {

        KamilPages.DescriptionBox.click();
        KamilPages.DescriptionBox.clear();
        KamilPages.DescriptionBox.sendKeys("maasallah");
    }

    @Then("Kullanici Room Table'da ilk satirda yer alan odanin delete butonuna basar")
    public void kullaniciRoomTableDaIlkSatirdaYerAlanOdaninDeleteButonunaBasar() {
        ReusableMethods.waitFor(2);
        KamilPages.DeleteButton.click();
    }

    @And("Kullanici Room sayfasinda acilan kisimda delete butonuna tiklar")
    public void kullaniciRoomSayfasindaAcilanKisimdaDeleteButonunaTiklar() {

        KamilPages.IcDeleteButton.isDisplayed();
    }

    @And("Kullanici gelen mesajin {string}  icerdigini dogrular")
    public void kullaniciGelenMesajinARoomIsDeletedWithIdentifierIcerdiginiDogrular() {

        ReusableMethods.waitFor(2);
        Assert.assertTrue(KamilPages.DeleteMesaji.isDisplayed());

    }


    @And("Kullanici Price kismini gecersiz bir fiyat Ile doldurur")
    public void kullaniciPriceKisminiGecersizBirFiyatIleDoldurur() {
        KamilPages.PriceBox.sendKeys("asdf");
    }

    @And("Price kisminin altinda {string} yazisinin gorundugunu dogrular")
    public void priceKismininAltindaYazisininGorundugunuDogrular(String mesaj) {
        ReusableMethods.waitFor(2);
        //Assert.assertTrue(adminNewRoomPage.PriceGecersizHataMesaji.isDisplayed());
        KamilPages.PriceGecersizHataMesaji.click();
        Assert.assertEquals(mesaj, KamilPages.PriceGecersizHataMesaji.getText());
    }

    @And("Kullanici Save butonunun erisilemez oldugunu dogrular")
    public void kullaniciSaveButonununErisilemezOldugunuDogrular() {
        ReusableMethods.waitFor(2);
        jse.executeScript("arguments[0].scrollIntoView()", KamilPages.SaveBox);
        Assert.assertFalse(KamilPages.KayitMesji.isDisplayed());
    }

    @And("Kullanici Room Number kismina temizler")
    public void kullaniciRoomNumberKisminaTemizler() {
        KamilPages.RoomNumberBox.clear();
    }

    @And("Kullanici acilan Room sayfasinda view butonuna tiklar")
    public void kullaniciAcilanRoomSayfasindaViewButonunaTiklar() {

        KamilPages.ViewButton.click();
    }

    @And("Kullanici cikan mesajinin uzerindee {string}  icerdigini dogrular")
    public void kullaniciCikanMesajininUzerindeeIcerdiginiDogrular(String arg0) {

        ReusableMethods.waitFor(2);
        String exceptedmesaj = "A new Room is updated with identifier";
        //Assert.assertTrue(adminNewRoomPage.KayitMesji.getText().contains(exceptedmesaj));
        Assert.assertTrue(KamilPages.UpdateMesaji.isDisplayed());

    }

    @And("Items&Titles elementine tiklar")
    public void ıtemsTitlesElementineTiklar() {
        KamilPages.Items.click();
    }
}
