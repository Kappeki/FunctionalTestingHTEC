package calls;

import common.GsonFunctions;
import common.RestAssuredFunctions;
import constants.ApiEndpoints;
import data.models.CreateActivityRequest;
import data.models.CreateActivityResponse;
import data.models.GetActivityResponse;

public class FakeRestAPI {

    public static GetActivityResponse[] getAllActivities() {
        return GsonFunctions.parseSuccessResponseToModel(RestAssuredFunctions.getAllActivities(ApiEndpoints.ACTIVITIES), GetActivityResponse[].class);
    }

    public static CreateActivityResponse createNewActivity(CreateActivityRequest createActivityRequest) {
        return GsonFunctions.parseSuccessResponseToModel(RestAssuredFunctions.postActivity(ApiEndpoints.ACTIVITIES, createActivityRequest), CreateActivityResponse.class);
    }
}
