package com.example.pavel.roughdonut;

import android.widget.TextView;

import org.rockybreeze.TimeView;

public class TextTimeView extends TimeView {
    private TextView _text = null;

    public TextTimeView(TextView text) {
        super();
        _text = text;
    }

    @Override
    public void setTime(final String s) {
        _text.post(new Runnable() {
            @Override
            public void run() {
                _text.setText(s);
            }
        });

    }
}
