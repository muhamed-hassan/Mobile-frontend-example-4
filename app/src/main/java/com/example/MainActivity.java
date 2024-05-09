package com.example;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.screen_1:
                Intent intentOfScreenOne = new Intent(this, ScreenOne.class);
                startActivity(intentOfScreenOne);
                return true;
            case R.id.screen_2:
                Intent intentOfScreenTwo = new Intent(this, ScreenTwo.class);
                startActivity(intentOfScreenTwo);
                return true;
            case R.id.screen_3:
                Intent intentOfScreenThree = new Intent(this, ScreenThree.class);
                startActivity(intentOfScreenThree);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
