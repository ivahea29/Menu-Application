package com.example.task1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NextScreen extends AppCompatActivity {

    TextView tvFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_screen);

        tvFinal = (TextView)findViewById(R.id.tv_final);
        // passing
        Intent intent = getIntent();
        // pulling from bundle
        String text = intent.getStringExtra(MainActivity.RESULT_TEXT);

        tvFinal.setText("The final is: "+text);
    }
}