package pdesigns.com.randombeers.DTO.RetrofitConnections.Xml;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Patrick on 23/05/2017.
 */
@Root(name = "labels", strict = false)
public class ImageUrlXml {

    //Pulls in any data that the element specifies
    @Element(name = "icon")
    private String icon;

    @Element(name = "medium")
    private String medium;

    @Element(name = "large")
    private String large;

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


}
