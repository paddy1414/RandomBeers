package pdesigns.com.randombeers.DTO.RetrofitConnections.Json;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Patrick on 23/05/2017.
 */
public class BeerResponseJson {

    //SerializedName pulls in the data node that matches the one provided
    @SerializedName("message")
    private String message;
    @SerializedName("data")
    private BeerJson data;


    /**
     * Gets message.
     *
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets message.
     *
     * @param message the message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Gets results.
     *
     * @return the results
     */
    public BeerJson getResults() {
        return data;
    }

    /**
     * Sets results.
     *
     * @param data the data
     */
    public void setResults(BeerJson data) {
        this.data = data;
    }


}
