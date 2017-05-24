package pdesigns.com.randombeers.DTO.RetrofitConnections;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

/**
 * Created by Patrick on 23/05/2017.
 */

public class ApiClientXml {

    /**
     * Build the get Requset using the BASE_URL & api key provided
     *
     * @return the client
     */

    public static final String BASE_URL = "https://api.brewerydb.com/v2/";
    private static Retrofit retrofitXml = null;

    public static Retrofit getClient() {
        if (retrofitXml==null) {
            retrofitXml = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(new OkHttpClient())
                    .addConverterFactory(SimpleXmlConverterFactory.create())
                    .build();
        }
        return retrofitXml;
    }



}
