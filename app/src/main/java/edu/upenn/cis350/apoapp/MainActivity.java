package edu.upenn.cis350.apoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    //This will probably be the activity after you log in that shows your stats
    //oohh can we connect it to the javascript code for the spreadsheet search?
    //and then have a menu somewhere to go to the calendars, spreadsheets, etc

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
