package constants;

public class ApiEndpoints {

    //Activity
    public static final String ACTIVITIES = "api/v1/Activities";
    public static String singleActivity(Integer id) { return ACTIVITIES + "/" + id; }

    //Authors
    public static final String AUTHORS = "api/v1/Authors";
    public static String singleAuthor(Integer id) { return AUTHORS + "/" + id; }
    public static String authorsByBookId(Integer bookId) { return AUTHORS + "/authors/books/" + bookId; }

    //Books

    //CoverPhotos

    //Users
    public static final String USERS = "api/v1/Users";
    public static String singleUser(Integer id) { return USERS + "/" + id; }
}
