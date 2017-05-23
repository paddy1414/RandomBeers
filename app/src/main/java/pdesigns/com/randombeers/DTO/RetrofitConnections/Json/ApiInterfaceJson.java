package pdesigns.com.randombeers.DTO.RetrofitConnections.Json;

import pdesigns.com.randombeers.DTO.RetrofitConnections.Json.BeerResponseJson;
import pdesigns.com.randombeers.DTO.RetrofitConnections.Xml.BeerResponseXml;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Patrick on 23/05/2017.
 */

public interface ApiInterfaceJson {

    @GET("beer/random")
    Call<BeerResponseJson> getRandomBeer(@Query("key") String apiKey, @Query("format") String type);

  //  @GET("movie/{id}")
   // Call<BeerResponseJson> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);


}
