package calls;

import common.GsonFunctions;
import common.RestAssuredFunctions;
import constants.ApiEndpoints;
import data.models.*;

public class FakeRestAPI {

    public static GetActivityResponse[] getAllActivities() {
        return GsonFunctions.parseSuccessResponseToModel(RestAssuredFunctions.getAllActivities(ApiEndpoints.ACTIVITIES), GetActivityResponse[].class);
    }

    public static CreateActivityResponse createNewActivity(CreateActivityRequest createActivityRequest) {
        return GsonFunctions.parseSuccessResponseToModel(RestAssuredFunctions.postActivity(ApiEndpoints.ACTIVITIES, createActivityRequest), CreateActivityResponse.class);
    }

    public static GetActivityResponse getActivity(Integer activityId) {
        return GsonFunctions.parseSuccessResponseToModel(RestAssuredFunctions.getActivity(ApiEndpoints.singleActivity(activityId)), GetActivityResponse.class);
    }

    public static UpdateAuthorResponse updateAuthor(UpdateAuthorRequest updateAuthorRequest, Integer authorId) {
        return GsonFunctions.parseSuccessResponseToModel(RestAssuredFunctions.putAuthor(ApiEndpoints.singleAuthor(authorId), updateAuthorRequest), UpdateAuthorResponse.class);
    }

    public static GetAuthorsByBookIdResponse[] getAuthorsByBookId(Integer bookId) {
        return GsonFunctions.parseSuccessResponseToModel(RestAssuredFunctions.getAuthorsByBookId(ApiEndpoints.authorsByBookId(bookId)), GetAuthorsByBookIdResponse[].class);
    }

}
