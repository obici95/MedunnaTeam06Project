package stepDefinitions.DBStepDefs.Abdullah;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pojos.Abdullah.UserPojo;

import java.util.List;

import static org.junit.Assert.assertTrue;
import static utilities.DatabaseUtility.*;


public class KullaniciData {
    public static UserPojo registrant;

    List<Object> actualData;
    @Given("Kullanici connection kurar")
    public void kullaniciConnectionKurar() {
        createConnection();
    }

    @And("Kullanici tum yeni kayitli bilgileri ceker {string} ve {string}")
    public void kullaniciTumYeniKayitliBilgileriCekerVe(String query, String columnName) {
        actualData = getColumnData(query,columnName);
    }

    @Then("Kullanici ssn bilgilerini dogrular")
    public void kullaniciSsnBilgileriniDogrular() {
        assertTrue("data not matched ",actualData.contains(registrant.getSsn()));

    }
    @Then("Kullanici email bilgilerini dogrular")
    public void kullaniciEmailBilgileriniDogrular() {
        assertTrue("data not matched ",actualData.contains(registrant.getEmail().toLowerCase()));
    }
    @Then("Kullanici kullanici bilgilerini dogrular")
    public void kullaniciKullaniciBilgileriniDogrular() {
        assertTrue("data not matched ",actualData.contains(registrant.getSsn()));
    }

}
