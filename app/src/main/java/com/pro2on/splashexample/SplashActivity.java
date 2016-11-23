package com.pro2on.splashexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by pro2on on 23.11.16.
 */

public class SplashActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**
         * We don't setup contentView, just use style
         *
         * The only thing we do here - start main activity, and finish
         *
         * */


        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

        finish();
    }
}
