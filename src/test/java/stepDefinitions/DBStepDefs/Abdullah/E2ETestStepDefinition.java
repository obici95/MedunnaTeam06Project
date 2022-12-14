package stepDefinitions.DBStepDefs.Abdullah;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pojos.Abdullah.UserPojo;

import java.util.List;

import static org.junit.Assert.assertTrue;
import static utilities.DatabaseUtility.*;


public class E2ETestStepDefinition {
    public static UserPojo registrant;

    List<Object> actualData;

    @Given("Kullanici connection kurar aa")
    public void kullaniciConnectionKurarAa() {
        createConnection();
    }


    @And("Kullanici tum yeni kayitli bilgileri ceker {string} ve {string} aa")
    public void kullaniciTumYeniKayitliBilgileriCekerVeAa(String query, String columnName) {
        actualData = getColumnData(query,columnName);
    }

    @Then("Kullanici ssn bilgilerini dogrular aa")
    public void kullaniciSsnBilgileriniDogrularAa() {
        assertTrue("data not matched ",actualData.contains(registrant.getSsn()));

    }
    @Then("Kullanici email bilgilerini dogrular aa")
    public void kullaniciEmailBilgileriniDogrularAa() {
        assertTrue("data not matched ",actualData.contains(registrant.getEmail().toLowerCase()));
    }
    @Then("Kullanici kullanici bilgilerini dogrular aa")
    public void kullaniciKullaniciBilgileriniDogrularAa() {
        assertTrue("data not matched ",actualData.contains(registrant.getSsn()));
    }


    @Then("Kullanici {string} bilgilerini dogrular aa")
    public void kullaniciBilgileriniDogrularAa(String SSN) {
        assertTrue("data not matched ",actualData.contains(SSN));
    }
}
