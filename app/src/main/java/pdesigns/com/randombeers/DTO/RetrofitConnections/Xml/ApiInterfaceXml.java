package pdesigns.com.randombeers.DTO.RetrofitConnections.Xml;

import pdesigns.com.randombeers.DTO.RetrofitConnections.Xml.BeerResponseXml;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Patrick on 23/05/2017.
 */

public interface ApiInterfaceXml {


    // Builds the get request that will be sent to the APIClient Class
    @GET("beer/random")
    Call<BeerResponseXml> getRandomBeer(@Query("key") String apiKey, @Query("format") String type);


}
