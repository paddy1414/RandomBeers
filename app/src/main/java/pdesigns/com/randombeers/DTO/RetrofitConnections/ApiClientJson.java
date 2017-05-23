package pdesigns.com.randombeers.DTO.RetrofitConnections;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Patrick on 23/05/2017.
 */

public class ApiClientJson {

  //  private static final String urlString = "https://api.brewerydb.com/v2/beer/random?key=bf0eac94928c81fddca1d7e246cd9753&format=json";
    public static final String BASE_URL = "https://api.brewerydb.com/v2/";
    private static Retrofit retrofit = null;


    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
