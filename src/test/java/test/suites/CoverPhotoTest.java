package test.suites;

import calls.FakeRestAPI;
import data.models.CreateCoverPhotoRequest;
import data.models.ErrorResponse;
import data.models.GetCoverPhotosByBookIdResponse;
import jdk.jfr.Description;
import org.testng.annotations.Test;
import test.asserts.CoverPhotoAssert;
import test.common.TestBase;

public class CoverPhotoTest extends TestBase {

    @Test
    @Description("Creating new cover photo with bad parameters")
    public void createNewCoverPhoto() {
        CreateCoverPhotoRequest createCoverPhotoRequest = new CreateCoverPhotoRequest("abc", 1.2, "test123.com");

        ErrorResponse errorResponse = FakeRestAPI.createNewCoverPhoto(createCoverPhotoRequest);

        CoverPhotoAssert coverPhotoAssert = new CoverPhotoAssert();
        coverPhotoAssert.assertCreateNewCoverPhoto(errorResponse);
    }

    @Test
    @Description("Getting a cover photo with an invalid id")
    public void getCoverPhoto() {
        ErrorResponse errorResponse = FakeRestAPI.getCoverPhoto(-1);

        CoverPhotoAssert coverPhotoAssert = new CoverPhotoAssert();
        coverPhotoAssert.assertGetCoverPhoto(errorResponse);
    }

    @Test
    @Description("Verifying that an empty array is returned for book that doesn't exist")
    public void getCoverPhotosByBookId() {
        GetCoverPhotosByBookIdResponse[] getCoverPhotosByBookIdResponse = FakeRestAPI.getCoverPhotosByBookId(201);

        CoverPhotoAssert coverPhotoAssert = new CoverPhotoAssert();
        coverPhotoAssert.assertGetCoverPhotosByBookId(getCoverPhotosByBookIdResponse);
    }
}
