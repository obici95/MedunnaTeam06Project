package stepDefinitions.API_StepDefs.Abdullah;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class MedunnaBaseUrl {
        public static RequestSpecification spec;
        public static void medunnaSetup(){
            spec = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
        }
    }

