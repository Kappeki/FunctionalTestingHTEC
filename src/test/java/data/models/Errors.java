package data.models;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Errors implements Serializable {

    @SerializedName("$.url")
    @Expose
    private List<String> $Url;
//    private final static long serialVersionUID = -5474204761867823865L;

    public Errors() {
    }

    public Errors(List<String> $Url) {
        super();
        this.$Url = $Url;
    }

    public List<String> get$Url() {
        return $Url;
    }

    public void set$Url(List<String> $Url) {
        this.$Url = $Url;
    }
}

