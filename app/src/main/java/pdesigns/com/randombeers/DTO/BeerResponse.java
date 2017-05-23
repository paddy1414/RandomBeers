package pdesigns.com.randombeers.DTO;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Patrick on 23/05/2017.
 */

public class BeerResponse {

    @SerializedName("message")
    private String message;
    @SerializedName("data")
    private Beer data;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Beer getResults() {
        return data;
    }

    public void setResults(Beer data) {
        this.data = data;
    }


}
