package pdesigns.com.randombeers;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button nextBeer;
    private TextView beerDescp, beerName;
    private ImageView beerImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        beerDescp  = (TextView) findViewById(R.id.beer_descp);
        beerName  = (TextView) findViewById(R.id.beer_title);
        beerImage  = (ImageView) findViewById(R.id.beer_image);
        beerDescp  = (Button) findViewById(R.id.next_beet_btn);

    }



}
