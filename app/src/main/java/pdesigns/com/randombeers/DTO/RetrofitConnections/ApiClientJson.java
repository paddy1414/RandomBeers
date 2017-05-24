package pdesigns.com.randombeers.DTO.RetrofitConnections;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Patrick on 23/05/2017.
 */
public class ApiClientJson {


    /**
     * The constant BASE_URL.
     */
    public static final String BASE_URL = "https://api.brewerydb.com/v2/";
    private static Retrofit retrofit = null;


    /**
     * Build the get Requset using the BASE_URL & api key provided
     *
     * @return the client
     */
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
