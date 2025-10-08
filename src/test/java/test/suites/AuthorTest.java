package test.suites;

import calls.FakeRestAPI;
import data.models.GetAuthorsByBookIdResponse;
import data.models.UpdateAuthorRequest;
import data.models.UpdateAuthorResponse;
import jdk.jfr.Description;
import org.testng.annotations.Test;
import test.asserts.AuthorAssert;
import test.common.TestBase;

public class AuthorTest extends TestBase {

    @Test
    @Description("Verify that the author is correctly updated")
    public void updateAuthor() {
        UpdateAuthorRequest updateAuthorRequest = new UpdateAuthorRequest(10, 100, "Dusan", "Petrovic");

        UpdateAuthorResponse updateAuthorResponse = FakeRestAPI.updateAuthor(updateAuthorRequest, 3);

        AuthorAssert authorAssert = new AuthorAssert();
        authorAssert.assertUpdateAuthor(updateAuthorResponse);
    }

    @Test
    @Description("Verify that the list of correct authors is returned")
    public void getAuthorsByBookId() {
        GetAuthorsByBookIdResponse[] getAuthorsByBookIdResponse = FakeRestAPI.getAuthorsByBookId(55);

        AuthorAssert authorAssert = new AuthorAssert();
        authorAssert.assertGetAuthorsByBookId(getAuthorsByBookIdResponse);
    }
}
