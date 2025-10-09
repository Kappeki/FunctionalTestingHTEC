package constants;

public class ApiEndpoints {

    //Activity
    public static final String ACTIVITIES = "api/v1/Activities";
    public static String singleActivity(Integer id) { return ACTIVITIES + "/" + id; }

    //Authors

    //Books

    //CoverPhotos
    public static final String COVER_PHOTOS = "api/v1/CoverPhotos";
    public static String singleCoverPhoto(Integer id) { return COVER_PHOTOS + "/" + id; }
    public static String coverPhotosByBookId(Integer bookId) { return COVER_PHOTOS + "/books/covers/" + bookId; }

    //Users
    public static final String USER = "api/v1/Users";
    public static String singleUser(String id) { return USER + "/" + id; }
}
