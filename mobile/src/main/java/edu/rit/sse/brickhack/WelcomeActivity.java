package edu.rit.sse.brickhack;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Kayla on 3/5/2016.
 */
public class WelcomeActivity extends AppCompatActivity {

    private static LinearLayout wallpaper_main;
    private TextView TamagotchSSE;
    private int time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        wallpaper_main = (LinearLayout)findViewById(R.id.wallpaper_main);
        TamagotchSSE = (TextView)findViewById(R.id.TamagotchSSE);

    }


}
