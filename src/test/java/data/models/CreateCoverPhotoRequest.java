package data.models;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//Ponovo ista situacija - napravio sam dve identicne klase Request i Response, samo iz razloga kako bi kod bio citljiviji

public class CreateCoverPhotoRequest implements Serializable
{

    @SerializedName("id")
    @Expose
    private Object id;
    @SerializedName("idBook")
    @Expose
    private Object idBook;
    @SerializedName("url")
    @Expose
    private String url;
//    private final static long serialVersionUID = -1567807393668014049L;

    public CreateCoverPhotoRequest() {
    }

    public CreateCoverPhotoRequest(Object id, Object idBook, String url) {
        super();
        this.id = id;
        this.idBook = idBook;
        this.url = url;
    }

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Object getIdBook() {
        return idBook;
    }

    public void setIdBook(Object idBook) {
        this.idBook = idBook;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}