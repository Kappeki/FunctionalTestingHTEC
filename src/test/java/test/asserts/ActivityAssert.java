package test.asserts;

import data.models.CreateActivityResponse;
import data.models.GetActivityResponse;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class ActivityAssert {

    public SoftAssert softAssert = new SoftAssert();

    public void assertGetAllActivities(GetActivityResponse[] getAllActivitiesResponse) {
        if(getAllActivitiesResponse == null)
            Assert.fail();

        Assert.assertEquals(getAllActivitiesResponse.length, 30, "");
    }

    public void assertCreateNewActivity(CreateActivityResponse createActivityResponse) {
        if(createActivityResponse == null)
            Assert.fail();

        softAssert.assertEquals(createActivityResponse.getId(), Integer.valueOf(50), "Id didn't match");
        softAssert.assertEquals(createActivityResponse.getTitle(), "Proba123", "Title didn't match");
        softAssert.assertEquals(createActivityResponse.getDueDate(), "2025-10-07T11:06:02.662Z", "Due data didn't match");
        softAssert.assertEquals(createActivityResponse.getCompleted(), Boolean.TRUE, "Completed didn't match");
        softAssert.assertAll();

    }

//    public static boolean doesUserExist(String id) {
//    }
}
