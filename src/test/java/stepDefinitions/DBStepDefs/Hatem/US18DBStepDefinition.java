package stepDefinitions.DBStepDefs.Hatem;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static utilities.DatabaseUtility.createConnection;

public class US18DBStepDefinition {
    @Given("HP_Kullanici DB baglanti kurar")
    public void hp_kullaniciDBBaglantiKurar() {
        createConnection();


    }

    @When("HP_Kullanici DB Users tablosundan gerekli olan profiles  sutunu alir.")
    public void hp_kullaniciDBUsersTablosundanGerekliOlanProfilesSutunuAlir() {


    }




    @Then("HP_Kullanici DB ile Role_Physician bilgilerinin dogrulamasini yapar")
    public void hp_kullaniciDBIleRole_PhysicianBilgilerininDogrulamasiniYapar() {
    }

}
