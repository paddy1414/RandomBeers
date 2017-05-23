package pdesigns.com.randombeers.DTO.RetrofitConnections.Json;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Patrick on 23/05/2017.
 */

public class BeerJson {

    @SerializedName("nameDisplay")
    private String nameDisplay;

    @SerializedName("description")
    private String description;

    private String imgMedium;

    @SerializedName("labels")
    private ImageUrlJson imageObj;



    public BeerJson(String nameDisplay, String description, ImageUrlJson imageObj) {
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

    public ImageUrlJson getImageObj() {
        return imageObj;
    }

    public void setImageObj(ImageUrlJson imageObj) {
        this.imageObj = imageObj;
    }



    @Override
    public String toString() {
        return "BeerJson{" +
                "nameDisplay='" + nameDisplay + '\'' +
                ", description='" + description + '\'' +
                ", imgMedium='" + imgMedium + '\'' +
  //              ", imgMediumList='" + imgMediumList + '\'' +
                '}';
    }
}
