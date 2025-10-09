package calls;

import common.GsonFunctions;
import common.RestAssuredFunctions;
import constants.ApiEndpoints;
import data.models.*;
import io.restassured.response.Response;

public class FakeRestAPI {

    public static GetActivityResponse[] getAllActivities() {
        return GsonFunctions.parseSuccessResponseToModel(RestAssuredFunctions.getAllActivities(ApiEndpoints.ACTIVITIES), GetActivityResponse[].class);
    }

    public static CreateActivityResponse createNewActivity(CreateActivityRequest createActivityRequest) {
        return GsonFunctions.parseSuccessResponseToModel(RestAssuredFunctions.postActivity(ApiEndpoints.ACTIVITIES, createActivityRequest), CreateActivityResponse.class);
    }

    public static ErrorResponse createNewCoverPhoto(CreateCoverPhotoRequest createCoverPhotoRequest) {
        return GsonFunctions.parseErrorResponseToModel(RestAssuredFunctions.postCoverPhoto(
                ApiEndpoints.COVER_PHOTOS, createCoverPhotoRequest), ErrorResponse.class);
    }

    public static ErrorResponse getCoverPhoto(Integer coverPhotoId) {
        return GsonFunctions.parseErrorResponseToModel(RestAssuredFunctions.getCoverPhoto(
                ApiEndpoints.singleCoverPhoto(coverPhotoId)), ErrorResponse.class);
    }

    public static GetCoverPhotosByBookIdResponse[] getCoverPhotosByBookId(Integer bookId) {
        return GsonFunctions.parseSuccessResponseToModel(RestAssuredFunctions.getCoverPhotosByBookId(
                ApiEndpoints.coverPhotosByBookId(bookId)), GetCoverPhotosByBookIdResponse[].class);
    }

    public static Response deleteUserWithNonExistingId(String userId) {
        return RestAssuredFunctions.deleteUserWithNonExistingId(ApiEndpoints.singleUser(userId));
    }

    public static ErrorResponse deleteUserWithInvalidIdFormat(String userId) {
        return GsonFunctions.parseErrorResponseToModel(RestAssuredFunctions.deleteUserWithInvalidIdFormat(
                ApiEndpoints.singleUser(userId)), ErrorResponse.class);
    }
}
