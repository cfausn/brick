// List Packages here:
//sup
//k-here
package main.java.edu.rit.sse.brickhack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class MainActivity extends AppCompatActivity {

    private ImageView sprite;
    private TextView text;
    private boolean evolve;
    private boolean change;
    private int timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startGame();

    }

    public void startGame(){
        sprite = (ImageView)findViewById(R.id.sprite);
        text = (TextView)findViewById(R.id.evolvedText);
        evolve = false;
        change = true;
        timer = 0;

        Runnable r = new Runnable(){
            public void run(){

                if(timer == 30){
                    evolve = true;
                    carter();
                }

                if(change){
                    sprite.setImageResource(R.mipmap.sprite_egg_form1);
                    change = false;
                }
                else {
                    sprite.setImageResource(R.mipmap.sprite_egg2);
                    change = true;
                }

                if(!evolve) {
                    sprite.postDelayed(this, 2000);
                    timer += 1;
                }
            }
        };

        sprite.postDelayed(r, 2000);



    }

    public void carter(){
        text.setText("Evolved to Carter!");
        sprite.setImageResource(R.mipmap.sprite_starter_carter1);
        evolve = false;
        timer = 0;

        Runnable r = new Runnable() {
            @Override
            public void run() {

                //one hour by default
                if (timer == 1200000) firstForm();

                if(change){
                    sprite.setImageResource(R.mipmap.sprite_starter_carter1);
                    change = false;
                }
                else{
                    sprite.setImageResource(R.mipmap.sprite_starter_carter2);
                    change = true;
                }

                if(!evolve){
                    sprite.postDelayed(this, 3000);
                    timer += 1;
                }
            }
        };

        sprite.postDelayed(r, 3000);


    }

    public void firstForm(){

    }


}

