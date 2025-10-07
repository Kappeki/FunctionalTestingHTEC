package calls;

import common.GsonFunctions;
import common.RestAssuredFunctions;
import data.models.GetAllActivitiesResponse;

public class FakeRestAPI {

    public static GetAllActivitiesResponse[] getAllActivitiesResponse(String url) {
        return GsonFunctions.parseSuccessResponseToModel(RestAssuredFunctions.getAllActivities(url), GetAllActivitiesResponse[].class);
    }
}
