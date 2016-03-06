// List Packages here:
//sup
//k-here
package edu.rit.sse.brickhack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private static ImageView sprite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sprite = (ImageView)findViewById(R.id.sprite);


    }


}
