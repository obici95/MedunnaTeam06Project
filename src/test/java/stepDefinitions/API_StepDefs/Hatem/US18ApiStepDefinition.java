package stepDefinitions.API_StepDefs.Hatem;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.Hatem.DoctorPojo;
import utilities.Authentication;
import utilities.ObjectMapperUtils;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static stepDefinitions.Hooks.spec;

public class US18ApiStepDefinition extends Authentication {
    Response response;
    @Given("HP_18_Admin endpoint olusturur")
    public void hp_AdminEndpointOlusturur() {
        spec.pathParams("first", "physicians", "second", "400666");
            }

    @When("HP_18_Admin send request ger response")
    public void hp_AdminSendRequestGerResponse() {
        response=given().spec(spec).header("Authorization","Bearer "+
                generateToken()).when().get("/{first}/{second}");


    }

    @Then("HP_18_Admin gelen bilgileri dogrular")
    public void hp_AdminGelenBilgileriDogrular() {
        DoctorPojo actual = ObjectMapperUtils.convertJsonToJavaObject(response.asString(),DoctorPojo.class);
        Map<String,Object> expecteddata=new HashMap<>();
        expecteddata.put("id",400666);
        Assert.assertEquals(expecteddata.get("id"),actual.getId());
        //Assert.assertEquals(expecteddata.get("firstName"),actual.getFirstName());


    }
}
