package hw1.android.csulb.edu.hw1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;


public class SplashScreenActivity extends AppCompatActivity {


    private static final int SPLASH_SCREEN_DURATION = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hideActionbar();
        setContentView(R.layout.activity_splash_screen);
        final Thread splashThread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(SPLASH_SCREEN_DURATION);

                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    finish();
                }

            }
        };
        splashThread.start();

    }
    private void hideActionbar(){
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }

}
