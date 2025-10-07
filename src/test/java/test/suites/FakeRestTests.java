package test.suites;

import calls.FakeRestAPI;
import data.models.GetAllActivitiesResponse;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.asserts.FakeRestAsserts;
import test.common.TestBase;

public class FakeRestTests extends TestBase {

    @Test
    @Description("Verify that a list of activities is returned")
    public void getAllActivitesTest() {
        GetAllActivitiesResponse[] getAllActivitiesResponse = FakeRestAPI.getAllActivitiesResponse("Activities");

        FakeRestAsserts fakeRestAsserts = new FakeRestAsserts();
        fakeRestAsserts.assertGetAllActivities(getAllActivitiesResponse);
    }

    @Test
    @Description("Verify that an activity is created")
    public void createActivity() {

    }
}
