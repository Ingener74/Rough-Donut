package com.example.pavel.roughdonut;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.rockybreeze.TimeSource;

public class RoughDonutActivity extends AppCompatActivity {

    private TextTimeView _timeView = null;
    private TimeSource _timeSource = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rough_donut);
    }

    @Override
    protected void onResume() {
        super.onResume();

        _timeView = new TextTimeView((TextView) findViewById(R.id.Text1));
        _timeSource = new TimeSource(_timeView);
    }

    @Override
    protected void onPause() {
        super.onPause();
        _timeView = null;
        _timeSource = null;
    }

    static {
        System.loadLibrary("RockyBreezeAndroid");
    }
}
