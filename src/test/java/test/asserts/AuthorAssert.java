package test.asserts;

import data.models.GetAuthorsByBookIdResponse;
import data.models.UpdateAuthorResponse;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AuthorAssert {

    public SoftAssert softAssert = new SoftAssert();

    public void assertUpdateAuthor(UpdateAuthorResponse updateAuthorResponse) {
        if(updateAuthorResponse == null) {
            Assert.fail("Author doesn't exist");
        }

        softAssert.assertEquals(updateAuthorResponse.getId(), Integer.valueOf(10), "Id didn't match");
        softAssert.assertEquals(updateAuthorResponse.getIdBook(), Integer.valueOf(100), "Book Id didn't match");
        softAssert.assertEquals(updateAuthorResponse.getFirstName(), "Dusan", "First name didn't match");
        softAssert.assertEquals(updateAuthorResponse.getLastName(), "Petrovic", "Last name didn't match");
        softAssert.assertAll();
    }

    public void assertGetAuthorsByBookId(GetAuthorsByBookIdResponse[] getAuthorsByBookIdResponse) {
        if(getAuthorsByBookIdResponse == null) {
            Assert.fail("List of authors is null");
        }

        Assert.assertNotEquals(getAuthorsByBookIdResponse.length, 0, "List of authors is empty");
        for (GetAuthorsByBookIdResponse author : getAuthorsByBookIdResponse) {
            Assert.assertEquals(author.getIdBook(), Integer.valueOf(55), "Author with ID " + author.getId() + " has incorrect idBook value");
        }
    }
}
