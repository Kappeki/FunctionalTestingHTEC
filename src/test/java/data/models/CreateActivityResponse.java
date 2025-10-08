package data.models;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//Request i Response za post metodu bilo kog endpoint-a su identicni (buklvano iste klase)
//Za CreateActivity sam napravio dve razlicite, cisto da bi se lakse razumeo kod
//Da li u nastavku da pravim jednu klasu koja ce da obuhvati Request i Response u jedno - npr CreateActivityRequestResponse ??

public class CreateActivityResponse implements Serializable
{
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("dueDate")
    @Expose
    private String dueDate;
    @SerializedName("completed")
    @Expose
    private Boolean completed;
//    private final static long serialVersionUID = -2569920690696738468L;

    public CreateActivityResponse() {
    }

    public CreateActivityResponse(Integer id, String title, String dueDate, Boolean completed) {
        super();
        this.id = id;
        this.title = title;
        this.dueDate = dueDate;
        this.completed = completed;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

}