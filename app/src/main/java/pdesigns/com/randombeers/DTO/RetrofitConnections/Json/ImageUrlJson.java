package pdesigns.com.randombeers.DTO.RetrofitConnections.Json;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Patrick on 23/05/2017.
 */

public class ImageUrlJson {

    @SerializedName("icon")
    private String icon;
    @SerializedName("medium")
    private String medium;
    @SerializedName("large")
    private String large;


    public ImageUrlJson(String icon, String medium, String large) {
        this.icon = icon;
        this.medium = medium;
        this.large = large;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    @Override
    public String toString() {
        return "ImageUrlJson{" +
                "icon='" + icon + '\'' +
                ", medium='" + medium + '\'' +
                ", large='" + large + '\'' +
                '}';
    }
}
