package stepDefinitions.API_StepDefs.Abdullah;

import com.google.gson.Gson;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.Abdullah.MessagePojo;
import pojos.Abdullah.RoomPostPojo;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;
import static stepDefinitions.API_StepDefs.Abdullah.MedunnaBaseUrl.spec;
import static utilities.Authentication.generateToken;
import static utilities.ObjectMapperUtils.convertJsonToJavaObject;

public class US_27_API_StepDefinitions {
    Response response;
    MessagePojo expectedData;

    @Given("AA The user sets the URL")
    public void aaTheUserSetsTheURL() {
        spec.pathParams("first", "api", "second", "c-messages");
    }

    @When("AA The user sets expected data")
    public void aaTheUserSetsExpectedData() {
        /*{
     "email": "asd@gmail.com",
     "message": "randevularım hakkında bilgi almak istiyorum",
     "name": "abdullah",
     "subject": "randevularım"
        }*/
        expectedData = new MessagePojo("Abdullah", "asd@gmail.com", "randevularım", "randevularım hakkında bilgi almak istiyorum");


    }

    @And("AA The user sends a post request and gets the response")
    public void aaTheUserSendsAPostRequestAndGetsTheResponse() {
        response = given().
                headers("Authorization", "Bearer " + generateToken(), "Content-Type", ContentType.JSON, "Accept", ContentType.JSON).
                spec(spec).
                contentType(ContentType.JSON).
                when().
                body(expectedData).
                post("/{first}/{second}");
        response.prettyPrint();
    }

    @Then("AA The user does assertion")
    public void aaTheUserDoesAssertion() {
        //validation 1.
        response.then().assertThat().statusCode(201);
        response.then().assertThat().
                body("message",equalTo(expectedData.getMessage())).
                body("email",equalTo(expectedData.getEmail())).
                body("subject",equalTo(expectedData.getSubject())).
                body("name",equalTo(expectedData.getName()));

        // validation 2.

        JsonPath json =response.jsonPath();
        assertEquals(json.getString("name"),expectedData.getName());
        assertEquals(json.getString("email"),expectedData.getEmail());
        assertEquals(json.getString("subject"),expectedData.getSubject());
        assertEquals(json.getString("message"),expectedData.getMessage());


        // validation 3.

        HashMap<String,Object> actualDataMap = response.as(HashMap.class);

        assertEquals(actualDataMap.get("name"),expectedData.getName());
        assertEquals(actualDataMap.get("email"),expectedData.getEmail());
        assertEquals(actualDataMap.get("subject"),expectedData.getSubject());
        assertEquals(actualDataMap.get("message"),expectedData.getMessage());


        // validation 4.

        MessagePojo actualDataPojo = response.as(MessagePojo.class);

        assertEquals(actualDataPojo.getName(),expectedData.getName());
        assertEquals(actualDataPojo.getEmail(),expectedData.getEmail());
        assertEquals(actualDataPojo.getSubject(),expectedData.getSubject());
        assertEquals(actualDataPojo.getMessage(),expectedData.getMessage());


        //validation 5.
        ObjectMapper obj = new ObjectMapper();
        MessagePojo actualDataOM =convertJsonToJavaObject(response.asString(), MessagePojo.class);

        assertEquals(actualDataOM.getName(),expectedData.getName());
        assertEquals(actualDataOM.getEmail(),expectedData.getEmail());
        assertEquals(actualDataOM.getSubject(),expectedData.getSubject());
        assertEquals(actualDataOM.getMessage(),expectedData.getMessage());

        // validation 6.

        Gson gson = new Gson();
        MessagePojo actualDataGson =gson.fromJson(response.asString(),MessagePojo.class);
        assertEquals(actualDataGson.getName(),expectedData.getName());
        assertEquals(actualDataGson.getEmail(),expectedData.getEmail());
        assertEquals(actualDataGson.getSubject(),expectedData.getSubject());
        assertEquals(actualDataGson.getMessage(),expectedData.getMessage());

    }

    @Given("AA The user sets the URL for get request")
    public void aaTheUserSetsTheURLForGetRequest() {
        spec.pathParams("first", "api", "second", "c-messages","third","403011");
    }

    @When("AA The user sets expected data for get request")
    public void aaTheUserSetsExpectedDataForGetRequest() {
        /*{
    "id": 403011,
    "name": "Abdullah",
    "email": "asd@gmail.com",
    "subject": "randevularım",
    "message": "randevularım hakkında bilgi almak istiyorum"
        }*/
        expectedData= new MessagePojo(403011,"Abdullah","asd@gmail.com","randevularım","randevularım hakkında bilgi almak istiyorum");
    }

    @And("AA The user sends a get request and gets the response")
    public void aaTheUserSendsAGetRequestAndGetsTheResponse() {
        response = given().
                headers("Authorization", "Bearer " + generateToken(), "Content-Type", ContentType.JSON, "Accept", ContentType.JSON).
                spec(spec).
                contentType(ContentType.JSON).
                when().
                get("/{first}/{second}/{third}");
        response.prettyPrint();
    }

    @Then("AA The user does assertion for get request")
    public void aaTheUserDoesAssertionForGetRequest() {
        //validation 1.
        response.then().assertThat().statusCode(200);
        response.then().assertThat().
                body("id",equalTo(expectedData.getId())).
                body("message",equalTo(expectedData.getMessage())).
                body("email",equalTo(expectedData.getEmail())).
                body("subject",equalTo(expectedData.getSubject())).
                body("name",equalTo(expectedData.getName()));

        // validation 2.

        JsonPath json =response.jsonPath();
        assertEquals(json.getInt("id"),(long)expectedData.getId());
        assertEquals(json.getString("name"),expectedData.getName());
        assertEquals(json.getString("email"),expectedData.getEmail());
        assertEquals(json.getString("subject"),expectedData.getSubject());
        assertEquals(json.getString("message"),expectedData.getMessage());


        // validation 3.

        HashMap<String,Object> actualDataMap = response.as(HashMap.class);
        assertEquals(actualDataMap.get("id"),expectedData.getId());
        assertEquals(actualDataMap.get("name"),expectedData.getName());
        assertEquals(actualDataMap.get("email"),expectedData.getEmail());
        assertEquals(actualDataMap.get("subject"),expectedData.getSubject());
        assertEquals(actualDataMap.get("message"),expectedData.getMessage());


        // validation 4.

        MessagePojo actualDataPojo = response.as(MessagePojo.class);
        assertEquals(actualDataPojo.getId(),expectedData.getId());
        assertEquals(actualDataPojo.getName(),expectedData.getName());
        assertEquals(actualDataPojo.getEmail(),expectedData.getEmail());
        assertEquals(actualDataPojo.getSubject(),expectedData.getSubject());
        assertEquals(actualDataPojo.getMessage(),expectedData.getMessage());


        //validation 5.
        ObjectMapper obj = new ObjectMapper();
        MessagePojo actualDataOM =convertJsonToJavaObject(response.asString(), MessagePojo.class);
        assertEquals(actualDataOM.getId(),expectedData.getId());
        assertEquals(actualDataOM.getName(),expectedData.getName());
        assertEquals(actualDataOM.getEmail(),expectedData.getEmail());
        assertEquals(actualDataOM.getSubject(),expectedData.getSubject());
        assertEquals(actualDataOM.getMessage(),expectedData.getMessage());

        // validation 6.

        Gson gson = new Gson();
        MessagePojo actualDataGson =gson.fromJson(response.asString(),MessagePojo.class);
        assertEquals(actualDataGson.getId(),expectedData.getId());
        assertEquals(actualDataGson.getName(),expectedData.getName());
        assertEquals(actualDataGson.getEmail(),expectedData.getEmail());
        assertEquals(actualDataGson.getSubject(),expectedData.getSubject());
        assertEquals(actualDataGson.getMessage(),expectedData.getMessage());

    }


}
