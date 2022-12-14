package pojos.Lokman;

import base_url.MedunnaBaseUrl;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;

public class VerifyPatient extends MedunnaBaseUrl {

             @Test
            public void test01() {
                 PatientCountryPojo countryPojo=new PatientCountryPojo("Türkiyem");
                 PatientCstatePojo  cstatePojo=new PatientCstatePojo("Ankara");
                 PatientDataPojo patientDataPojo=new PatientDataPojo("lokmanfake","user","2000-12-10T22:00:00Z","5355353535","MALE",
                         "Apositive","merkez ankara","unvalidq@gmail.com","yeni hasta",countryPojo,cstatePojo);


               //  System.out.println("patientDataPojo = " + patientDataPojo);


                 specMedunna.pathParams("first","api","second","patients","third",394893);//315443, 394893,361212

                 Response response=given()
                         .spec(specMedunna)
                         .headers("Authorization", "Bearer " + generateToken())
                         .when().get("/{first}/{second}/{third}");

               //  response.prettyPrint();
                 /*
                 {
    "firstName": "lokmanfake",
    "lastName": "user",
    "birthDate": "2000-12-10T22:00:00Z",
    "phone": "5355353535",
    "gender": "MALE",
    "bloodGroup": "Apositive",
    "adress": "merkez ankara",
    "email": "unvalidq@gmail.com",
    "description": "yeni hasta",

    "country": {
        "name": "T�rkiyem"
    },
    "cstate": {
        "name": "Ankara",
    }
}

                  */

                 response.then().assertThat().statusCode(200);

                 response.then().assertThat().body("firstName",equalTo("lokmanfake")
                 ,"lastName",equalTo("user")
                 ,"birthDate",equalTo("2000-12-10T22:00:00Z")
                 ,"phone",equalTo("5355353535")
                 ,"gender",equalTo("MALE")
                 ,"bloodGroup",equalTo("Apositive")
                 ,"adress",equalTo("merkez ankara")
                 ,"email",equalTo("unvalidq@gmail.com")
                 ,"description",equalTo("yeni hasta")
                 ,"country.name",equalTo("Türkiyem")
                 ,"cstate.name",equalTo("Ankara"));


                PatientDataPojo actualPatientData=response.as(PatientDataPojo.class);
            //     System.out.println("actualPatientData = " + actualPatientData);

                 assertEquals(actualPatientData.getFirstName(),patientDataPojo.getFirstName());
                assertEquals(actualPatientData.getLastName(),patientDataPojo.getLastName());
                assertEquals(actualPatientData.getBirthDate(),patientDataPojo.getBirthDate());
                assertEquals(actualPatientData.getPhone(),patientDataPojo.getPhone());
                assertEquals(actualPatientData.getGender(),patientDataPojo.getGender());
                assertEquals(actualPatientData.getBloodGroup(),patientDataPojo.getBloodGroup());
                assertEquals(actualPatientData.getAdress(),patientDataPojo.getAdress());
                assertEquals(actualPatientData.getEmail(),patientDataPojo.getEmail());
                assertEquals(actualPatientData.getDescription(),patientDataPojo.getDescription());
                assertEquals(countryPojo.getName(),actualPatientData.getCountry().getName());
                assertEquals(cstatePojo.getName(),actualPatientData.getCstate().getName());

             }
}
