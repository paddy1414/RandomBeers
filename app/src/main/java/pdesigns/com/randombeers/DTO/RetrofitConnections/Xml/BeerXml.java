package pdesigns.com.randombeers.DTO.RetrofitConnections.Xml;

/**
 * Created by Patrick on 23/05/2017.
 */
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "data", strict = false)
public class BeerXml {

    @Element(name = "nameDisplay")
    private String nameDisplay;

    @Element(name = "description" , required=false)
    private String description;


    @Element(name = "labels", required=false)
    private ImageUrlXml imageObj;

    private String imageUrl;

    public String getTitle() {
        return nameDisplay;
    }

    public void setTitle(String title) {
        this.nameDisplay = title;
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
            this.imageUrl = "http://www.pizzasole.ro/uploads/menu/menu-noimage.jpg";
        } else {
            this.imageUrl = imageObj.getLarge();
        }
        return imageUrl;
    }





    @Override
    public String toString() {
        return "BeerXml{" +
                "nameDisplay='" + nameDisplay + '\'' +
               ", description='" + description + '\'' +
   //             ", labels=" + imageUrl +
                '}';
    }


}
