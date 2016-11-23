package com.pro2on.splashexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by pro2on on 23.11.16.
 */

public class MainActivity extends AppCompatActivity {



    private static final int LAYOUT = R.layout.activity_main;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(LAYOUT);
    }
}
