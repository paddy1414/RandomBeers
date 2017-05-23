package pdesigns.com.randombeers.DTO.RetrofitConnections.Xml;

import com.google.gson.annotations.SerializedName;


import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

/**
 * Created by Patrick on 23/05/2017.
 */
//@Root(name="root", strict=false)
public class BeerResponseXml {

    @Element(name= "message")
    private String message;

    @Element(name= "data")
    private BeerXml data;

    @Element(name= "status")
    private String status;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public BeerXml getData() {
        return data;
    }

    public void setData(BeerXml data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
