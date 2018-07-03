package ajaymehta.customratingbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RatingBar;
import android.widget.Toast;


/*
*
* numStars : is used to set number of stars to be displayed in rating bar.
rating : is used to set default rating, specifies the number of stars in select state.
stepSize : is used to set number of steps or touches it takes to fill all stars.
isIndicator : is used to indicate whether rating bar can be changed or is display only.
progressDrawable : is used to set drawable for rating bar background for unselected and selected states.
*
* */
// you just need image background for shape ..shape i meant shape ..color will overcome what is inside the image..any desing you have
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RatingBar ratingBar = (RatingBar)findViewById(R.id.ratingBar2);
        RatingBar ratingBar6 = (RatingBar)findViewById(R.id.ratingBar6);

        ratingBar6.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener(){
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {

                Toast.makeText(MainActivity.this,
                        "Rating changed, current rating "+ ratingBar.getRating(),
                        Toast.LENGTH_SHORT).show();
            }
        });


        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener(){
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {

                Toast.makeText(MainActivity.this,
                        "Rating changed, current rating "+ ratingBar.getRating(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
