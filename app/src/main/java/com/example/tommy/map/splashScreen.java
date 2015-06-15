package com.example.tommy.map;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.Handler;


/**
 * Created by Tommy on 6/12/2015.
 */
public class splashScreen extends Activity {

    private static int SPLASH_SCREEN_DELAY = 3000;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        setContentView(R.layout.splash_screen);

        //new Handler.postDelayed(new Runnable() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent (splashScreen.this, MainActivity.class);
                startActivity(intent);

                finish();

            }
        },SPLASH_SCREEN_DELAY);


    }
}
