package stepDefinitions.API_StepDefs.Abdullah;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

import pojos.Abdullah.UserPojo;
import utilities.ObjectMapperUtils;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;

public class US_03API_StepDefinitions {
    Response response;

    @Given("Kullanici, {string} kullanicinin tum bilgilerine GET request gonderir")
    public void kullaniciKullanicininTumBilgilerineGETRequestGonderir(String istenenSsn) {
        response = given().
                headers("Authorization", "Bearer " + generateToken()).
                when().
                get("https://medunna.com/api/user?ssn=" + istenenSsn + "");
        response.prettyPrint();
    }

    @Then("Kullanici,status kodunun {int} oldugunu dogrular")
    public void kullaniciStatusKodununOldugunuDogrular(int istenenStatusCode) {
        assertEquals(response.getStatusCode(), istenenStatusCode);

    }

    @And("Kullanici,bilgilerin doğruluğunu kontrol eder")
    public void kullaniciBilgilerinDoğruluğunuKontrolEder() {
        /*
        {
    "id": 336360,
    "login": "heribertoconsidine",
    "firstName": "Heriberto",
    "lastName": "Considine",
    "ssn": "458-58-2401",
    "email": "heribertoconsidine@gmail.com",
    "imageUrl": null,
    "activated": false,
    "langKey": null,
    "createdBy": null,
    "createdDate": null,
    "lastModifiedBy": null,
    "lastModifiedDate": null,
    "authorities": null
}

         */
        // set the expected data
        UserPojo expectedUserData = new UserPojo(
                336360,
                "heribertoconsidine",
                "Heriberto",
                "Considine",
                "458-58-2401",
                "heribertoconsidine@gmail.com",
                null,
                false,
                null,
                null,
                null,
                null,
                null,
                null);
        //set the actual data
        UserPojo actualUserData = ObjectMapperUtils.convertJsonToJavaObject(response.asString(), UserPojo.class);
        System.out.println("actualUserPojo = " + actualUserData);

        assertEquals("Id Not Match", expectedUserData.getId(), actualUserData.getId());
        assertEquals("Username Not Match", expectedUserData.getLogin(), actualUserData.getLogin());
        assertEquals("FirstName Not Match", expectedUserData.getFirstName(), actualUserData.getFirstName());
        assertEquals("Lastname Not Match", expectedUserData.getLastName(), actualUserData.getLastName());
        assertEquals("Ssn Not Match", expectedUserData.getSsn(), actualUserData.getSsn());
        assertEquals("Email Not Match", expectedUserData.getEmail(), actualUserData.getEmail());
        assertEquals("ImageUrl Not Match", expectedUserData.getImageUrl(), actualUserData.getImageUrl());
        assertEquals("Activated Not Match", expectedUserData.getActivated(), actualUserData.getActivated());
        assertEquals("LangKey Not Match", expectedUserData.getLangKey(), actualUserData.getLangKey());
        assertEquals("CreatedBy Not Match", expectedUserData.getCreatedBy(), actualUserData.getCreatedBy());
        assertEquals("CreatedDate Not Match", expectedUserData.getCreatedBy(), actualUserData.getCreatedBy());
        assertEquals("LastModifiedBy Not Match", expectedUserData.getLastModifiedBy(), actualUserData.getLastModifiedBy());
        assertEquals("Authorities Not Match", expectedUserData.getAuthorities(), actualUserData.getAuthorities());

    }
}
