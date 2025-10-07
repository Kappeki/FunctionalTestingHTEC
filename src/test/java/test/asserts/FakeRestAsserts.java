package test.asserts;

import data.models.GetAllActivitiesResponse;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class FakeRestAsserts {

    public SoftAssert softAssert = new SoftAssert();

    public void assertGetAllActivities(GetAllActivitiesResponse[] getAllActivitiesResponse) {
        Assert.assertEquals(getAllActivitiesResponse.length, 0, "");
    }
}
