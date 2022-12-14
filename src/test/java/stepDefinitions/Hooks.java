package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

import static stepDefinitions.API_StepDefs.Abdullah.MedunnaBaseUrl.medunnaSetup;

public class Hooks {

 Hatem/13/12/2022
    public static RequestSpecification spec;
    @Before(value = "@TC18")
    public void setup(){
        spec = new RequestSpecBuilder().setBaseUri("https://www.medunna.com/api/").build();
    }

   @After
    public void tearDown(Scenario scenario){
        final byte[] screenshot=((TakesScreenshot)
                Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png","screenshots");
        }
     //  Driver.quitDriver();
    }
}
