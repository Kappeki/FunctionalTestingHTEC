package common;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RestAssuredFunctions {

    public static Response getAllActivities(String url) {
        return given().contentType(ContentType.JSON).get(url);
    }

    public static Response postActivity(String url, Object requestBody) {
        return given().contentType(ContentType.JSON).body(requestBody).post(url).then().extract().response();
    }

    public static Response getActivity(String url) {
        return given().contentType(ContentType.JSON).get(url);
    }

    public static Response putAuthor(String url, Object requestBody) {
        return given().contentType(ContentType.JSON).body(requestBody).put(url).then().extract().response();
    }

    public static Response getAuthorsByBookId(String url) {
        return given().contentType(ContentType.JSON).get(url);
    }

}
