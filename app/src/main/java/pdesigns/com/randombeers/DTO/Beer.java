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

    private String imgMedium;

    @SerializedName("labels")
    private ImageUrl imageObj;



    public Beer(String nameDisplay, String description, ImageUrl imageObj) {
        this.nameDisplay = nameDisplay;
        this.description = description;
        this.imageObj = imageObj;




    }

    public String getNameDisplay() {
        return nameDisplay;
    }

    public void setNameDisplay(String nameDisplay) {
        this.nameDisplay = nameDisplay;
    }

    public String getDescription() {
        if (description==null) {
            description ="This is currently no description regarding " + nameDisplay;
        }
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgMedium() {
        if(imageObj ==null) {
            this.imgMedium = "http://www.pizzasole.ro/uploads/menu/menu-noimage.jpg";
        } else {
            this.imgMedium = imageObj.getLarge();
        }
        return imgMedium;
    }

    public void setImgMedium(String imgMedium) {
        this.imgMedium = imgMedium;
    }

    public ImageUrl getImageObj() {
        return imageObj;
    }

    public void setImageObj(ImageUrl imageObj) {
        this.imageObj = imageObj;
    }



    @Override
    public String toString() {
        return "Beer{" +
                "nameDisplay='" + nameDisplay + '\'' +
                ", description='" + description + '\'' +
                ", imgMedium='" + imgMedium + '\'' +
  //              ", imgMediumList='" + imgMediumList + '\'' +
                '}';
    }
}
