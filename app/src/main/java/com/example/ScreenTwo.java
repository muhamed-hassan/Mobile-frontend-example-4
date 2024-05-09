package com.example;

import android.app.Activity;
import android.os.Bundle;

public class ScreenTwo extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_two);

        // To show back-arrow along with wiring this child to its parent-activity in AndroidManifest.xml
        if (getActionBar() != null) {
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
}
