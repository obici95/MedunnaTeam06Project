package base_url;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class MedunnaBaseUrl {
    protected RequestSpecification specMedunna;

    @Before
    public void setup() {
        specMedunna = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
    }
}


