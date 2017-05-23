package pdesigns.com.randombeers;


import android.graphics.Movie;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import pdesigns.com.randombeers.DTO.ApiClient;
import pdesigns.com.randombeers.DTO.ApiInterface;
import pdesigns.com.randombeers.DTO.Beer;
import pdesigns.com.randombeers.DTO.BeerResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    private Button nextBeer;
    private TextView beerDescp, beerName;
    private ImageView beerImage;

    private String urlString = "https://api.brewerydb.com/v2/beer/random?key=bf0eac94928c81fddca1d7e246cd9753&format=json";

    private static final String TAG = MainActivity.class.getSimpleName();

    // API key
    private final static String API_KEY = "bf0eac94928c81fddca1d7e246cd9753";

    Beer beer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        beerDescp  = (TextView) findViewById(R.id.beer_descp);
        beerName  = (TextView) findViewById(R.id.beer_title);
        beerImage  = (ImageView) findViewById(R.id.beer_image);
        nextBeer  = (Button) findViewById(R.id.next_beet_btn);

        nextBeer.setOnClickListener(this);
        new GetRandBeers().execute();

    }

    @Override
    public void onClick(View view) {
        if (view == nextBeer) {
            new GetRandBeers().execute();
        }
    }


    // A background async task to load all bars by making http request
    private class GetRandBeers extends AsyncTask<String, String, String> {

        @Override
        protected String doInBackground(String... strings) {
            //Check to see if results is empty
            if (API_KEY.isEmpty()) {
                Toast.makeText(getApplicationContext(), "Please obtain your API KEY first from themoviedb.org", Toast.LENGTH_LONG).show();
                return null;
            }

            ApiInterface apiService =
                    ApiClient.getClient().create(ApiInterface.class);

            Call<BeerResponse> call = apiService.getRandomBeer(API_KEY);
            call.enqueue(new Callback<BeerResponse>() {
                @Override
                public void onResponse(Call<BeerResponse>call, Response<BeerResponse> response) {
                    beer = response.body().getResults();
                    Log.d(TAG, "Number of beer received: " + beer.toString());
                //    Log.d("image", beer.getImgMedium());
                    beerDescp.setText(beer.getDescription());
                    beerName.setText(beer.getNameDisplay());

                }


                @Override
                public void onFailure(Call<BeerResponse>call, Throwable t) {
                    // Log error here since request failed
                    Log.e(TAG, t.toString());
                }
            });

            return null;
        }
    }



}
