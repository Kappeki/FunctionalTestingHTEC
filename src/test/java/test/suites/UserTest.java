package test.suites;

import calls.FakeRestAPI;
import data.models.ErrorResponse;
import io.restassured.response.Response;
import jdk.jfr.Description;
import org.testng.annotations.Test;
import test.asserts.UserAssert;
import test.common.TestBase;

public class UserTest extends TestBase {

    //Nikada nece da prodje jer delete za bilo koji broj vraca status code 200
    @Test
    @Description("Deleting a user with non existing id")
    public void deleteUserWithNonExistingId() {
        Response response = FakeRestAPI.deleteUserWithNonExistingId("99999");

        UserAssert userAssert = new UserAssert();
        userAssert.assertDeleteUserWithNonExistingId(response);
    }

    @Test
    @Description("Deleting a user with invalid id format")
    public void deleteUserWithInvalidIdFormat() {
        ErrorResponse errorResponse = FakeRestAPI.deleteUserWithInvalidIdFormat("adc");

        UserAssert userAssert = new UserAssert();
        userAssert.assertDeleteUserWithInvalidIdFormat(errorResponse);
    }
}
