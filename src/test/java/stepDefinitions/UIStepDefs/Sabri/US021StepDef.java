package stepDefinitions.UIStepDefs.Sabri;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.SabriPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US021StepDef {
    SabriPage medunna021 = new SabriPage();

    @Given("SG Staff Medunna url'ine gider")
    public void sgStaffMedunnaUrlIneGider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Then("SG Staff Sign In sayfasına gider")
    public void sgStaffSignInSayfasınaGider() {
        medunna021.girisProfil.click();
        ReusableMethods.waitFor(2);
        medunna021.signInProfile.click();
    }

    @And("SG Staff Kullanıcı bilgileriyle sign in olunur")
    public void sgStaffKullanıcıBilgileriyleSignInOlunur() {
        ReusableMethods.waitFor(2);
        medunna021.userName.sendKeys("ykg");
        ReusableMethods.waitFor(1);
        medunna021.password.sendKeys("Yk.3814641");
        ReusableMethods.waitFor(1);
        medunna021.signInGiris.click();
        ReusableMethods.waitFor(2);
    }

    @Then("SG Staff My Pages sekmesini tıklar")
    public void sgStaffMyPagesSekmesiniTıklar() {
        medunna021.myPages.click();
        ReusableMethods.waitFor(2);
    }

    @And("SG Staff açılan menüden Search Patient butonunu tıklar")
    public void sgStaffAçılanMenüdenSearchPatientButonunuTıklar() {
        medunna021.searchPatient.click();

    }

    @Then("SG Staff açılan sayfadan Patient SSN metin kutusuna hastanın SSN numarasını girer ve enter'a tıklar")
    public void sgStaffAçılanSayfadanPatientSSNMetinKutusunaHastanınSSNNumarasınıGirerVeEnterATıklar() {
        ReusableMethods.waitFor(2);
        medunna021.ssnMetinKutusu.sendKeys("001-18-1818", Keys.ENTER);

    }

    @And("SG Staff açılan sayfadan Show Appintments butonunu tıklar")
    public void sgStaffAçılanSayfadanShowAppintmentsButonunuTıklar() {
        ReusableMethods.waitFor(4);
        medunna021.showAppointment.click();

    }

    @Then("SG Staff açılan sayfadan Edit butonunu tıklar")
    public void sgStaffAçılanSayfadanEditButonunuTıklar() {
        ReusableMethods.waitFor(2);
        medunna021.editButton.click();
    }

    @And("SG  Staff Create or Edit an Appointment ekranının açıldığını görür")
    public void sgStaffCreateOrEditAnAppointmentEkranınınAçıldığınıGörür() {
        ReusableMethods.waitFor(4);
        Assert.assertTrue(medunna021.createOrEditAnAppointmentBasligi.isDisplayed());
    }

    @And("SG  Staff açılan sayfadan Status kısmını UNAPPROVED, PENDING veya CANCELLED yapabilir ancak COMPLETED yapamaz")
    public void sgStaffAçılanSayfadanStatusKısmınıUNAPPROVEDPENDINGVeyaCANCELLEDYapabilirAncakCOMPLETEDYapamaz() {

        ReusableMethods.jsScrollClick(medunna021.statusBox);
        ReusableMethods.waitFor(2);
        medunna021.unapproved.click();
        ReusableMethods.waitFor(2);
        medunna021.statusBox.click();
        ReusableMethods.waitFor(2);
        medunna021.pending.click();
        ReusableMethods.waitFor(2);
        medunna021.statusBox.click();
        ReusableMethods.waitFor(2);
        medunna021.cancelled.click();
        ReusableMethods.waitFor(2);
        medunna021.statusBox.click();
        ReusableMethods.waitFor(2);
        medunna021.completed.click();

        Assert.assertTrue(medunna021.unapproved.isEnabled());
        Assert.assertTrue(medunna021.pending.isEnabled());
        Assert.assertTrue(medunna021.cancelled.isEnabled());
        Assert.assertFalse(medunna021.completed.isEnabled());


    }

    @And("SG  Staff açılan sayfadan Anamnesis \\(Hastalık Geçmişi), Treatment \\( Tedavi) veya Diagnosis\\(Teşhis) kısımlarına data giremez")
    public void sgStaffAçılanSayfadanAnamnesisHastalıkGeçmişiTreatmentTedaviVeyaDiagnosisTeşhisKısımlarınaDataGiremez() {
        medunna021.anamnesis.clear();
        ReusableMethods.waitFor(2);
        medunna021.anamnesis.sendKeys("Data Girişi Yapıldı");
        ReusableMethods.waitFor(2);
        medunna021.treatment.clear();
        ReusableMethods.waitFor(2);
        medunna021.treatment.sendKeys("Data Girişi Yapıldı");
        ReusableMethods.waitFor(2);
        medunna021.diagnosis.clear();
        ReusableMethods.waitFor(2);
        medunna021.diagnosis.sendKeys("Data Girişi Yapıldı");

        String input = "Data Girişi Yapıldı";
        String anamnesisValue = medunna021.anamnesis.getText();
        System.out.println("anamnesisValue = " + anamnesisValue);
        String treatmentValue = medunna021.treatment.getText();
        System.out.println("treatmentValue = " + treatmentValue);
        String diagnosisValue = medunna021.diagnosis.getText();
        System.out.println("diagnosisValue = " + diagnosisValue);

        /*
        Assert.assertNotEquals(input,anamnesisValue);
        Assert.assertNotEquals(input,treatmentValue);
        Assert.assertNotEquals(input,diagnosisValue);
        */
        Assert.assertEquals(input, anamnesisValue);
        Assert.assertEquals(input, treatmentValue);
        Assert.assertEquals(input, diagnosisValue);


    }

    @And("SG Staff açılan sayfada  Physician kısmından ilgili doktoru secip Save butonuna tıklar")
    public void sgStaffAçılanSayfadaPhysicianKısmındanIlgiliDoktoruSecipSaveButonunaTıklar() {
        ReusableMethods.jsScrollClick(medunna021.physician);
        ReusableMethods.waitFor(3);
        medunna021.selectedPhysician.click();
        ReusableMethods.waitFor(3);
        medunna021.appointmentSave.click();

        Assert.assertTrue(medunna021.savedYazisi.isDisplayed());

    }

    @Given("SG Staff Medunna url'ine gider ve appointment olusturur")
    public void sgStaffMedunnaUrlIneGiderVeAppointmentOlusturur() {

        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
        ReusableMethods.waitFor(2);
        ReusableMethods.appointmentOlustur();
    }

    @And("SG Staff Sayfayi kapatir")
    public void sgStaffSayfayiKapatir() {
        Driver.quitDriver();
    }
}
