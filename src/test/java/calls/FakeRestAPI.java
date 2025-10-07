package calls;

import common.GsonFunctions;
import common.RestAssuredFunctions;
import constants.ApiEndpoints;
import data.models.GetAllActivitiesResponse;

public class FakeRestAPI {

    public static GetAllActivitiesResponse[] getAllActivitiesResponse() {
        return GsonFunctions.parseSuccessResponseToModel(RestAssuredFunctions.getAllActivities(ApiEndpoints.ACTIVITIES), GetAllActivitiesResponse[].class);
    }
}
