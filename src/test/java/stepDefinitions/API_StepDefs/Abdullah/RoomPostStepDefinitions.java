package stepDefinitions.API_StepDefs.Abdullah;

import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.Abdullah.RoomPostPojo;

import static io.restassured.RestAssured.given;
import static stepDefinitions.API_StepDefs.Abdullah.MedunnaBaseUrl.spec;
import static utilities.Authentication.generateToken;

public class RoomPostStepDefinitions {
    Response response;
    RoomPostPojo room = new RoomPostPojo();

    @Given("user send a post request for rooms")
    public void userSendAPostRequestForRooms() {
        spec.pathParams("first", "api", "second", "rooms");

        //Room Data oluşturma ; istersec constructor ile de yapabiliriz

        room.setDescription("Batch81Room");
        room.setPrice(200);
        room.setRoomNumber(33489);
        room.setRoomType("DELUXE");
        room.setStatus(true);

        response = given().
                headers("Authorization", "Bearer " + generateToken(), "Content-Type", ContentType.JSON, "Accept", ContentType.JSON).
                spec(spec).
                contentType(ContentType.JSON).
                when().
                body(room).
                post("/{first}/{second}");
        response.prettyPrint();

    }

    @And("user gets the room data and validates")
    public void userGetsTheRoomDataAndValidates() {
        response.then().assertThat().statusCode(201);
    }
}
