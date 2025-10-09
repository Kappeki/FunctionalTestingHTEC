package data.models;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetCoverPhotosByBookIdResponse implements Serializable
{
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("idBook")
    @Expose
    private Integer idBook;
    @SerializedName("url")
    @Expose
    private String url;
//    private final static long serialVersionUID = 1612802384121544324L;

    public GetCoverPhotosByBookIdResponse() {
    }

    public GetCoverPhotosByBookIdResponse(Integer id, Integer idBook, String url) {
        super();
        this.id = id;
        this.idBook = idBook;
        this.url = url;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdBook() {
        return idBook;
    }

    public void setIdBook(Integer idBook) {
        this.idBook = idBook;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}