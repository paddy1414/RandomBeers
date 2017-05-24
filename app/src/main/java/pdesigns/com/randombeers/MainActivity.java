package pdesigns.com.randombeers;


import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import pdesigns.com.randombeers.DTO.RetrofitConnections.ApiClientJson;
import pdesigns.com.randombeers.DTO.RetrofitConnections.ApiClientXml;
import pdesigns.com.randombeers.DTO.RetrofitConnections.Json.ApiInterfaceJson;
import pdesigns.com.randombeers.DTO.RetrofitConnections.Json.BeerJson;
import pdesigns.com.randombeers.DTO.RetrofitConnections.Json.BeerResponseJson;
import pdesigns.com.randombeers.DTO.RetrofitConnections.Xml.ApiInterfaceXml;
import pdesigns.com.randombeers.DTO.RetrofitConnections.Xml.BeerResponseXml;
import pdesigns.com.randombeers.DTO.RetrofitConnections.Xml.BeerXml;
import pdesigns.com.randombeers.ImageHandlers.LoadImage;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * The type Main activity.
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    private Button nextBeer;
    private TextView beerDescp, beerName;
    private ImageView beerImage;

    private String urlString = "https://api.brewerydb.com/v2/beerJson/random?key=bf0eac94928c81fddca1d7e246cd9753&format=json";

    private static final String TAG = MainActivity.class.getSimpleName();

    // API key
    private final static String API_KEY = "bf0eac94928c81fddca1d7e246cd9753";

    /**
     * The Beer json.
     */
    BeerJson beerJson;

    /**
     * The Beer xml.
     */
    BeerXml beerXml;

    private LoadImage loadImage;

  //  View currentView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        beerDescp  = (TextView) findViewById(R.id.beer_descp);
        beerName  = (TextView) findViewById(R.id.beer_title);
        beerImage  = (ImageView) findViewById(R.id.beer_image);
        nextBeer  = (Button) findViewById(R.id.next_beet_btn);

        nextBeer.setOnClickListener(this);
      //  currentView =  View.getRootView();

        //    new GetRandBeersJson().execute();
        new GetRandBeersXml().execute();
    }

    @Override
    public void onClick(View view) {
        if (view == nextBeer) {
            Snackbar snackbar = Snackbar
                    .make(view, "Random beer is Loading using XML", Snackbar.LENGTH_LONG);
            snackbar.show();
            new GetRandBeersXml().execute();
        }
    }


    // A background async task to load all bars by making http request
    private class GetRandBeersJson extends AsyncTask<String, String, String> {

        @Override
        protected String doInBackground(String... strings) {
            Snackbar snackbar = Snackbar
                    .make(findViewById(android.R.id.content), "Random beer is Loading using JSON", Snackbar.LENGTH_LONG);
            snackbar.show();
            //Check to see if results is empty
            if (API_KEY.isEmpty()) {
                Toast.makeText(getApplicationContext(), "Please obtain your API KEY first from brewerydb.com", Toast.LENGTH_LONG).show();
                snackbar = Snackbar
                        .make(findViewById(android.R.id.content), "Please obtain your API KEY first from brewerydb.com", Snackbar.LENGTH_LONG);
                snackbar.show();
                return null;
            }

            ApiInterfaceJson apiService =
                    ApiClientJson.getClient().create(ApiInterfaceJson.class);

            Call<BeerResponseJson> call = apiService.getRandomBeer(API_KEY, "json");
            call.enqueue(new Callback<BeerResponseJson>() {
                @Override
                public void onResponse(Call<BeerResponseJson>call, Response<BeerResponseJson> response) {
                    beerJson = response.body().getResults();
                    Log.d(TAG, "Number of beerJson received: " + beerJson.toString());
                  //  Log.d("image", beerJson.getImgMediumList().toString());
                    beerDescp.setText(beerJson.getDescription());
                    beerName.setText(beerJson.getNameDisplay());

                    loadImage = new LoadImage(getApplicationContext());
                    loadImage.DisplayImage(beerJson.getImgMedium(), beerImage);
                }
                @Override
                public void onFailure(Call<BeerResponseJson>call, Throwable t) {
                    // Log error here since request failed
                    Log.e(TAG, t.toString());
                }
            });

            return null;
        }
    }

    // A background async task to
    private class GetRandBeersXml extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... strings) {
            Snackbar snackbar = Snackbar
                    .make(findViewById(android.R.id.content), "Radom beer is Loading Using XML", Snackbar.LENGTH_LONG);
            snackbar.show();
            //Check to see if results is empty
            if (API_KEY.isEmpty()) {
      //          Toast.makeText(getApplicationContext(), "Please obtain your API KEY first from brewerydb.com", Toast.LENGTH_LONG).show();

                 snackbar = Snackbar
                        .make(findViewById(android.R.id.content), "Please obtain your API KEY first from brewerydb.com", Snackbar.LENGTH_LONG);
                snackbar.show();

                return null;
            }

            ApiInterfaceXml apiService =
                    ApiClientXml.getClient().create(ApiInterfaceXml.class);
            //Makes the call to the api usring the constructer specified in ApiClint, while passing in the API key, &type
            Call<BeerResponseXml> call = apiService.getRandomBeer(API_KEY, "xml");
            call.enqueue(new Callback<BeerResponseXml>() {
                @Override
                public void onResponse(Call<BeerResponseXml>call, Response<BeerResponseXml> response) {
                    beerXml = response.body().getData();
                    Log.d(TAG, "Number of beerXml received: " + beerXml.toString());

                    beerDescp.setText(beerXml.getDescription());
                    beerName.setText(beerXml.getTitle());

                    loadImage = new LoadImage(getApplicationContext());
                    loadImage.DisplayImage(beerXml.getImgMedium(), beerImage);
                }

                @Override
                public void onFailure(Call<BeerResponseXml>call, Throwable t) {
                    // Log error here since request failed
                    Log.e(TAG, t.toString());
                }
            });

            return null;
        }
    }




}
