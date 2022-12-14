package stepDefinitions.API_StepDefs.Lokman;



import base_url.MedunnaBaseUrl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.chrome.ChromeOptions;
import utilities.Driver;
import utilities.ReusableMethods;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static stepDefinitions.UIStepDefs.Lokman.US15_StepDefs.patientIdNumber;
import static utilities.Authentication.generateToken;

public class US15_TC08_VerifyPatientStepDefs extends MedunnaBaseUrl {
    Response response;
JavascriptExecutor jse=(JavascriptExecutor) Driver.getDriver();
    ChromeOptions options = new ChromeOptions();

    @Given("LB Kullanici hasta IP nosu ile get request yollar.")
    public void lb_kullanici_hasta_ip_nosu_ile_get_request_yollar() {
        setup();

       specMedunna.pathParams("first","api","second","patients","third",394893);//315443, 394893,361212



        response=given()
                .spec(specMedunna)
                .headers("Authorization", "Bearer " + generateToken())
                .when().get("/{first}/{second}/{third}");


    }

    @Then("LB Kullanici hasta bilgilerini alir ve dogrular.")
    public void lb_kullanici_hasta_bilgilerini_alir_ve_dogrular() {
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

        response.prettyPrint();

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

    }

    @Then("LB admin kullanici kaydin silindigini API ile dogrular.")
    public void lbAdminKullaniciKaydinSilindiginiAPIIleDogrular() {

     //   System.out.println("patientIdNumber = " + patientIdNumber);
        setup();

        specMedunna.pathParams("first","api","second","patients","third",patientIdNumber);//315443, 394893,361212



        response=given()
                .spec(specMedunna)
                .headers("Authorization", "Bearer " + generateToken())
                .when().get("/{first}/{second}/{third}");
     //   response.prettyPrint();

        response.then().assertThat().statusCode(404);



    }
}
