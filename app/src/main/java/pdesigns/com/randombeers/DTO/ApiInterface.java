package pdesigns.com.randombeers.DTO;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Patrick on 23/05/2017.
 */

public interface  ApiInterface {

    @GET("beer/random")
    Call<BeerResponse> getRandomBeer(@Query("key") String apiKey);

  //  @GET("movie/{id}")
   // Call<BeerResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);


}
