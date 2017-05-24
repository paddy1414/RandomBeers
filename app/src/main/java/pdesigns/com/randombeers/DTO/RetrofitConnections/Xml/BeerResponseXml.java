package pdesigns.com.randombeers.DTO.RetrofitConnections.Xml;

import org.simpleframework.xml.Element;


/**
 * Created by Patrick on 23/05/2017.
 */
//@Root(name="root", strict=false)
public class BeerResponseXml {

    //Element is used to pull the tags defined in the brackets
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
