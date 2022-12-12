package stepDefinitions.API_StepDefs.Kamil;

import com.github.javafaker.Faker;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.Kamil.US16_RoomsPojo_Get;
import pojos.Kamil.US16_RoomsPojo_Post;
import utilities.Authentication;
import utilities.ConfigReader;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
public class US16_ApiStepDef {

    Response response;
    String token = Authentication.generateToken();
    US16_RoomsPojo_Get[] rooms;
    US16_RoomsPojo_Post roomsPojoPost=new US16_RoomsPojo_Post();

    US16_RoomsPojo_Get putRequest=new US16_RoomsPojo_Get();

    @Given("admin sends GET request")
    public void admin_sends_get_request() {
        response = given().headers("Authorization",
                "Bearer " + token,
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).when().get(ConfigReader.getProperty("room_endpoint01"));

        //  response.then().assertThat().statusCode(200);
        //  response.then().assertThat().statusCode(200);

        //response.prettyPrint();
    }

    @Given("admin deserializes the data coming from DB")
    public void admin_deserializes_the_data_coming_from_DB() throws IOException {

        ObjectMapper obj = new ObjectMapper();
        rooms = obj.readValue(response.asString(), US16_RoomsPojo_Get[].class);
        System.out.println(rooms.length);
        for (int i = 0; i <rooms.length ; i++) {
            System.out.println(rooms[i].getDescription());
            System.out.println(rooms[i].getPrice());
        }

    }

    @Given("admin validates the data")
    public void admin_validates_the_data() {
        US16_RoomsPojo_Get roomsPojo_get=response.as(US16_RoomsPojo_Get.class);

        assertEquals(roomsPojo_get.getRoomNumber(),roomsPojoPost.getRoomNumber());
        assertEquals(roomsPojo_get.getRoomType(),roomsPojoPost.getRoomType());


    }

    @Given("admin sends post request for rooms")
    public void admin_sends_post_request_for_rooms() {
        // post yaparken istenilen datayi set etmek gerekir
        Faker faker=new Faker();
        int number=faker.number().numberBetween(1111,999999999);
        roomsPojoPost.setRoomType("TWIN");
        roomsPojoPost.setPrice(501);
        roomsPojoPost.setRoomNumber(number);
        roomsPojoPost.setStatus(false);
        roomsPojoPost.setDescription("our new born Child room");
        response=given().headers("Authorization",
                "Bearer " + token,
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).body(roomsPojoPost).contentType(ContentType.JSON).when().post(ConfigReader.getProperty("room_endpoint_post"));

    }

    @Given("admin validates the post request")
    public void admin_validates_the_post_request() {
        /*
        response.then().assertThat().statusCode(201);
        response.then().assertThat().body("price",equalTo(501)).
                body("roomNumber",equalTo(19887700))
                .body("roomType",equalTo("TWIN"));
         */
        // 2. yol
        JsonPath jsonPath=response.jsonPath();

        //  assertEquals(roomsPojoPost.getRoomType(),jsonPath.getString("roomType"));
        //  assertEquals(roomsPojoPost.getRoomNumber(),jsonPath.getInt("roomNumber"));
        //  assertEquals(roomsPojoPost.getPrice(),jsonPath.getInt("price"));

        // 3 . yol

        US16_RoomsPojo_Get roomsPojo_get=response.as(US16_RoomsPojo_Get.class);

        assertEquals(roomsPojo_get.getRoomNumber(),roomsPojoPost.getRoomNumber());
        assertEquals(roomsPojo_get.getRoomType(),roomsPojoPost.getRoomType());


    }

    @Given("admin sends put request for rooms")
    public void admin_sends_put_request_for_rooms() {

        putRequest.setId(1451);
        putRequest.setRoomType("TWIN");
        putRequest.setRoomNumber(27241);
        putRequest.setPrice(1399);
        putRequest.setStatus(true);


        response = given().headers("Authorization",
                        "Bearer " + token,
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON).body(putRequest).contentType(ContentType.JSON)
                .when().put(ConfigReader.getProperty("room_endpoint_post"));




    }


    @And("Admin validates the put request")
    public void adminValidatesThePutRequest() {
        JsonPath jsonPath=response.jsonPath();

        assertEquals(putRequest.getRoomType(),jsonPath.getString("roomType"));
        assertEquals(putRequest.getRoomNumber(),jsonPath.getInt("roomNumber"));
        assertEquals(putRequest.getPrice(),jsonPath.getInt("price"));
    }


    // delete
    @Given("admin sends delete request for rooms {string}")
    public void adminSendsDeleteRequestForRooms(String id) {

        response = given().headers("Authorization",
                        "Bearer " + token,
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .when().delete("https://medunna.com/api/rooms"+"/"+id);


    }
    @Given("admin validates the delete request")
    public void admin_validates_the_delete_request() {
        response.then().assertThat().statusCode(204);


    }

}
