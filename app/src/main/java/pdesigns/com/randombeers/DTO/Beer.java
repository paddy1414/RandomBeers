package pdesigns.com.randombeers.DTO;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Patrick on 23/05/2017.
 */

public class Beer {

    @SerializedName("nameDisplay")
    private String nameDisplay;

    @SerializedName("description")
    private String description;

    @SerializedName("medium")
    private String imgMedium;




    /*
    public Beer(String nameDisplay, String description, String imgMedium) {
        this.nameDisplay = nameDisplay;
        this.description = description;
        this.imgMedium = imgMedium;
    }
    */

    public Beer(String nameDisplay, String description, String imgMedium) {
        this.nameDisplay = nameDisplay;
        this.description = description;
        this.imgMedium = imgMedium;
    }

    public String getNameDisplay() {
        return nameDisplay;
    }

    public void setNameDisplay(String nameDisplay) {
        this.nameDisplay = nameDisplay;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgMedium() {
        return imgMedium;
    }

    public void setImgMedium(String imgMedium) {
        this.imgMedium = imgMedium;
    }



    /*
    @Override
    public String toString() {
        return "Beer{" +
                "nameDisplay='" + nameDisplay + '\'' +
                ", description='" + description + '\'' +
                ", imgMedium='" + imgMedium + '\'' +
                '}';
    }
    */

    @Override
    public String toString() {
        return "Beer{" +
                "nameDisplay='" + nameDisplay + '\'' +
                ", description='" + description + '\'' +
                ", imgMedium='" + imgMedium + '\'' +
                '}';
    }
}
