package com.example.yudha.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by yudha on 29/03/2016.
 */
public class ChatlistActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textview = new TextView(this);
        textview.setText("This is Chatlist tab");
        setContentView(textview);
        //setContentView(R.layout.test_test);
    }
}