package common;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RestAssuredFunctions {

    public static Response getAllActivities(String url) {
        return given().contentType(ContentType.JSON).get(url);
    }

//    public static Response post(String url, String RequestBody)
}
