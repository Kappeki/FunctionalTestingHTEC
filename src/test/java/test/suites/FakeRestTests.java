package test.suites;

import calls.FakeRestAPI;
import data.models.CreateActivityRequest;
import data.models.CreateActivityResponse;
import data.models.GetActivityResponse;
import jdk.jfr.Description;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.asserts.FakeRestAsserts;
import test.common.TestBase;

public class FakeRestTests extends TestBase {

    //AcitvityRequest activityRequest;
    String idOfCreatedActivity;

    @BeforeMethod
    public void prepareTestData() {
        //pozivamo prepareRequest metodu
//        idOfCreatedActivity = FakeRestAPI
    }

    @Test
    @Description("Verify that a list of activities is returned")
    public void getAllActivitiesTest() {
        GetActivityResponse[] getAllActivitiesResponse = FakeRestAPI.getAllActivities();

        FakeRestAsserts fakeRestAsserts = new FakeRestAsserts();
        fakeRestAsserts.assertGetAllActivities(getAllActivitiesResponse);
    }

    @Test
    @Description("Verify that new activity is created")
    public void createNewActivity() {
        CreateActivityRequest createActivityRequest = new CreateActivityRequest(50, "Proba123", "2025-10-07T11:06:02.662Z", true);

        CreateActivityResponse createActivityResponse = FakeRestAPI.createNewActivity(createActivityRequest);

        FakeRestAsserts fakeRestAsserts = new FakeRestAsserts();
        fakeRestAsserts.assertCreateNewActivity(createActivityResponse);
    }
}
