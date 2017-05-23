package pdesigns.com.randombeers.DTO.RetrofitConnections;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

/**
 * Created by Patrick on 23/05/2017.
 */

public class ApiClientXml {


    //  private static final String urlString = "https://api.brewerydb.com/v2/beer/random?key=bf0eac94928c81fddca1d7e246cd9753&format=json";
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
