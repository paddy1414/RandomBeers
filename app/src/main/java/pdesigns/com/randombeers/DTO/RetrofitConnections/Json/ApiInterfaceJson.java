package pdesigns.com.randombeers.DTO.RetrofitConnections.Json;



import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Patrick on 23/05/2017.
 */

public interface ApiInterfaceJson {

    // Builds the get request
    @GET("beer/random")
    Call<BeerResponseJson> getRandomBeer(@Query("key") String apiKey, @Query("format") String type);


}
