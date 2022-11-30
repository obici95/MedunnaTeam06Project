package stepDefinitions.API_StepDefs.Baki;

import base_url.MedunnaBaseUrl;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class GetRequest01 extends MedunnaBaseUrl {

    //https//:www.medunna.com/api/physicians/305870

    /*
    {"id": 305870
    "firstName": "Hst Mehmet",
    "lastname": "Demir",
    "phone" : "555-555-5555",
    "gender" : "MALE",
    "user": : {
           "login": "hstMehmet",
           "email": "ahmettestng21@gmail.com",
           "ssn": "123-55-9999"
            },
     "speciality" : "NUCLEAR_MEDICINE"
     }
     */

    @Test
    public void test01() {
        specMedunna.pathParams("pp1","patients","pp2","305870");

        Response response=given()
                .spec(specMedunna)
                .header("Authorization","Bearer"+generateToken())
                .when()
                .get("{pp1}/{pp2}");
        response.prettyPrint();
    }
}
