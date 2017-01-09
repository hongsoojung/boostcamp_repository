package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";
    TextView mWeatherDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mWeatherDetail = (TextView) findViewById(R.id.tv_weather_detail);

        // TODO (2) Display the weather forecast that was passed from MainActivity
        Intent getIntent = getIntent();
        if(getIntent != null) {
            if(getIntent.hasExtra(Intent.EXTRA_TEXT) == true) {
                String getWeatherData = getIntent.getStringExtra(Intent.EXTRA_TEXT);
                mWeatherDetail.setText(getWeatherData);
            }
        }
    }
}