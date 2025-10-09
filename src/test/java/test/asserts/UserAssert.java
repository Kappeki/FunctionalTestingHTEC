package test.asserts;

import constants.ErrorMessages;
import data.models.ErrorResponse;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class UserAssert {

    public SoftAssert softAssert = new SoftAssert();

    public void assertDeleteUserWithNonExistingId(Response response) {
        if(response.statusCode() < 400 || response.statusCode() >= 500) {
            Assert.fail("Status code is not in the 400s");
        }

        softAssert.assertEquals(response.statusCode(),  404, "Status code didn't match");
        softAssert.assertAll();
    }

    public void assertDeleteUserWithInvalidIdFormat(ErrorResponse errorResponse) {
        softAssert.assertEquals(errorResponse.getStatus(), Integer.valueOf(400), "Status didn't match");
        softAssert.assertEquals(errorResponse.getTitle(), ErrorMessages.VALIDATION_ERROR, "Parameters are valid");
        softAssert.assertAll();
    }
}
