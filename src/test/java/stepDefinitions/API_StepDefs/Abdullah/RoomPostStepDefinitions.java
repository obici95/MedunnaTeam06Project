package stepDefinitions.API_StepDefs.Abdullah;

import com.google.gson.Gson;
import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.Abdullah.RoomPostPojo;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;
import static stepDefinitions.API_StepDefs.Abdullah.MedunnaBaseUrl.spec;
import static utilities.Authentication.generateToken;

public class RoomPostStepDefinitions {
    Response response;
    RoomPostPojo room = new RoomPostPojo();

    @Given("user send a post request for rooms")
    public void userSendAPostRequestForRooms() {
        spec.pathParams("first", "api", "second", "rooms");

        //Room Data oluşturma ; istersec constructor ile de yapabiliriz

        room.setDescription("Batch81Room12");
        room.setPrice(200);
        room.setRoomNumber(378912);
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
    public void userGetsTheRoomDataAndValidates() throws JsonProcessingException {
        response.then().assertThat().statusCode(201);
        //validation 1.

        response.then().assertThat().
                body("roomNumber",equalTo(room.getRoomNumber())).
                body("roomType",equalTo(room.getRoomType())).
                body("price",equalTo(room.getPrice())).
                body("status",equalTo(room.isStatus()));

        // validation 2.

        JsonPath json =response.jsonPath();
        assertEquals(json.getInt("roomNumber"),room.getRoomNumber());
        assertEquals(json.getString("roomType"),room.getRoomType());
        assertEquals(json.getInt("price"),room.getPrice());
        assertEquals(json.getBoolean("status"),room.isStatus());
        assertEquals(json.getString("description"),room.getDescription());

        // validation 3.

        HashMap<String,Object>actualData = response.as(HashMap.class);

        assertEquals(actualData.get("description"),room.getDescription());
        assertEquals(actualData.get("roomNumber"),room.getRoomNumber());
        assertEquals(actualData.get("roomType"),room.getRoomType());
        assertEquals(actualData.get("price"),room.getPrice());
        assertEquals(actualData.get("status"),room.isStatus());

        //validation 5.
        ObjectMapper obj = new ObjectMapper();
        RoomPostPojo actualRoomOM =obj.readValue(response.asString(), RoomPostPojo.class);
        assertEquals(actualRoomOM.getRoomNumber(),room.getRoomNumber());
        assertEquals(actualRoomOM.getRoomType(),room.getRoomType());
        assertEquals(actualRoomOM.getPrice(),room.getPrice());
        assertEquals(actualRoomOM.getDescription(),room.getDescription());
        assertEquals(actualRoomOM.isStatus(),room.isStatus());





        // validation 6.

        Gson gson = new Gson();
        RoomPostPojo actualRoomGson =gson.fromJson(response.asString(), RoomPostPojo.class);
        assertEquals(actualRoomGson.isStatus(),room.isStatus());
        assertEquals(actualRoomGson.getDescription(),room.getDescription());
        assertEquals(actualRoomGson.getPrice(),room.getPrice());
        assertEquals(actualRoomGson.getRoomNumber(),room.getRoomNumber());
        assertEquals(actualRoomGson.getRoomType(),room.getRoomType());

        // validation 4.
       /* RoomPostPojo actualRoom = response.as(RoomPostPojo.class);

        assertEquals(actualRoom.getDescription(),room.getDescription());
        assertEquals(actualRoom.getRoomNumber(),room.getRoomNumber());
        assertEquals(actualRoom.getPrice(),room.getPrice());
        assertEquals(actualRoom.isStatus(),room.isStatus());
        assertEquals(actualRoom.getRoomType(),room.getRoomType());*/


    }
}
