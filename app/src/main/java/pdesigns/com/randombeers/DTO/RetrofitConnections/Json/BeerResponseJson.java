package pdesigns.com.randombeers.DTO.RetrofitConnections.Json;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Patrick on 23/05/2017.
 */

public class BeerResponseJson {

    @SerializedName("message")
    private String message;
    @SerializedName("data")
    private BeerJson data;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public BeerJson getResults() {
        return data;
    }

    public void setResults(BeerJson data) {
        this.data = data;
    }


}
