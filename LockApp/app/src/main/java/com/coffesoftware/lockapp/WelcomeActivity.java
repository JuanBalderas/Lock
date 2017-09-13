package com.coffesoftware.lockapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {
    TextView nombrecin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        nombrecin = (TextView) findViewById(R.id.nombrecin);
        Bundle extras = getIntent().getExtras();
        String s = extras.getString("nombref");
        nombrecin.setText(s);
    }

}
