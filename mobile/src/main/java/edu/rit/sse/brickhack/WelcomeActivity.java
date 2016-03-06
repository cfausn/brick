package edu.rit.sse.brickhack;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by Kayla on 3/5/2016.
 */
public class WelcomeActivity extends AppCompatActivity {

    private static ImageView sprite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        sprite = (ImageView)findViewById(R.id.sprite);


    }


}
