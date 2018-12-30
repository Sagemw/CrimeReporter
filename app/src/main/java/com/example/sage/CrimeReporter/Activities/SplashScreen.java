package com.example.sage.CrimeReporter.Activities;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

import com.daimajia.androidanimations.library.Techniques;
import com.example.sage.CrimeReporter.R;
import com.viksaa.sssplash.lib.activity.AwesomeSplash;
import com.viksaa.sssplash.lib.cnst.Flags;
import com.viksaa.sssplash.lib.model.ConfigSplash;

public class SplashScreen extends AwesomeSplash {

//    private static int SPLASH_TIME_OUT = 3000;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_splash_screen);
//
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Intent i = new Intent(SplashScreen.this, Permissions.class);
//                startActivity(i);
//
//                finish();
//            }
//        }, SPLASH_TIME_OUT);
//    }

    @Override
    public void initSplash(ConfigSplash configSplash) {
//        ActionBar actionBar = getSupportActionBar();
//        actionBar.hide();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

//       Background animation
        configSplash.setBackgroundColor(R.color.colorWhite);
        configSplash.setAnimCircularRevealDuration(3000);
        configSplash.setRevealFlagX(Flags.REVEAL_LEFT);
        configSplash.setRevealFlagX(Flags.REVEAL_BOTTOM);


//        logo

        configSplash.setLogoSplash(R.drawable.logo_text);
        configSplash.setAnimLogoSplashDuration(10000);
        configSplash.setAnimLogoSplashTechnique(Techniques.Bounce);

//        title
        configSplash.setTitleSplash("Built With Love By WISDOM M");
        configSplash.setTitleTextColor(R.color.colorPinkTrans);
        configSplash.setTitleTextSize(20f);
        configSplash.setAnimTitleDuration(3000);
        configSplash.setAnimTitleTechnique(Techniques.SlideOutUp);



    }
    @Override
    public void animationsFinished () {
        startActivity(new Intent(SplashScreen.this, Permissions.class));
        finish();
    }
}
