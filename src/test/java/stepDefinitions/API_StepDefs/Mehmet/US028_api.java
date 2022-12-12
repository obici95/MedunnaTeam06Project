package stepDefinitions.API_StepDefs.Mehmet;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import utilities.Authentication;

import java.util.HashMap;

public class US028_api {


    Response response;
    RequestSpecification spec;
    HashMap<String, Object> expectedData= new HashMap<>();




    @Given("kullanici country icin path params olusturur.")
    public void kullaniciCountryIcinPathParamsOlusturur() {
        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com/").build();

        spec.pathParams("1", "api", "2", "countries");
    }

    @Then("kullanici country expected data olusturur, {string}")
    public void kullaniciCountryExpectedDataOlusturur(String country) {

        expectedData.put("name", country);

    }

    @And("kullanici country post request gonderir ve response alir")
    public void kullaniciCountryPostRequestGonderirVeResponseAlir() {

        response = RestAssured.given().spec(spec).contentType(ContentType.JSON).
                header("Authorization","Bearer "+ Authentication.generateToken()).body(expectedData).post("{1}/{2}");

        response.prettyPrint();
    }

    @And("kullanici country response dogrular")
    public void kullaniciCountryResponseDogrular() {

        HashMap<String, Object> actualData = response.as(HashMap.class);

//        System.out.println("expectedData = " + expectedData);
//        System.out.println("actualData = " + actualData);
        Assert.assertEquals(expectedData.get("name"),actualData.get("name"));









    }
}
