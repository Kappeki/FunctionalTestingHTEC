package test.suites;

import calls.FakeRestAPI;
import data.models.GetAllActivitiesResponse;
import jdk.jfr.Description;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
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
        GetAllActivitiesResponse[] getAllActivitiesResponse = FakeRestAPI.getAllActivitiesResponse();

        FakeRestAsserts fakeRestAsserts = new FakeRestAsserts();
        fakeRestAsserts.assertGetAllActivities(getAllActivitiesResponse);
    }

    @Test
    @Description("Verify that an activity is created")
    public void createActivity() {

    }
}
