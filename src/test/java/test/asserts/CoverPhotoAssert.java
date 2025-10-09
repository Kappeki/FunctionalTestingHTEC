package test.asserts;

import constants.ErrorMessages;
import data.models.ErrorResponse;
import data.models.GetCoverPhotosByBookIdResponse;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class CoverPhotoAssert {

    public SoftAssert softAssert = new SoftAssert();

    public void assertCreateNewCoverPhoto(ErrorResponse errorResponse) {
        if(errorResponse == null) {
            Assert.fail();
        }

        softAssert.assertEquals(errorResponse.getTitle(), ErrorMessages.VALIDATION_ERROR, "Parameters are valid");
        softAssert.assertAll();
    }

    public void assertGetCoverPhoto(ErrorResponse errorResponse) {
        if(errorResponse == null) {
            Assert.fail();
        }

        softAssert.assertEquals(errorResponse.getTitle(), ErrorMessages.NOT_FOUND, "Cover Photo id is correct");
        softAssert.assertEquals(errorResponse.getStatus(), Integer.valueOf(404), "Cover Photo was found");
    }

    public void assertGetCoverPhotosByBookId(GetCoverPhotosByBookIdResponse[] getCoverPhotosByBookIdResponse) {
        if(getCoverPhotosByBookIdResponse == null) {
            Assert.fail();
        }

        Assert.assertEquals(getCoverPhotosByBookIdResponse.length, 0, "Length is not 0");
    }
}
