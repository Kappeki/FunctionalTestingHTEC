package test.common;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class TestBase {

    //Poziva jednom pre klase
    @BeforeClass
    public void beforeClass() {
        RestAssured.baseURI = "https://fakerestapi.azurewebsites.net/api/v1/";
    }
}
