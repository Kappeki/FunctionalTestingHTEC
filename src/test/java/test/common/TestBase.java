package test.common;

import environment.ConfigSetup;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class TestBase {

    //Poziva jednom pre klase
    @BeforeClass
    public void beforeClass() {
        RestAssured.baseURI = ConfigSetup.getBaseUrl();
    }
}
