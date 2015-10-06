package com.example.pavel.roughdonut;

import android.util.Log;
import android.widget.TextView;

import org.rockybreeze.TimeView;

public class Test1 extends TimeView {
    private TextView _text = null;

    public Test1(TextView text) {
        super();
        _text = text;
    }


    @Override
    public void setTime(final String s) {
        Log.d(Test1.class.getName(), "setTime called");
        _text.post(new Runnable() {
            @Override
            public void run() {
                _text.setText(s);
            }
        });

    }
}
