package test;

import common.RestAssuredFunctions;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Proba {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://fakerestapi.azurewebsites.net/api/v1/";

        Response response = RestAssuredFunctions.getAllActivities("Activities");

        System.out.println(response.body().asString());
    }
}
