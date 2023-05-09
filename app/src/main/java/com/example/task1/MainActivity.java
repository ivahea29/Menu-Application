package com.example.task1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String RESULT_TEXT = "com.example.task1.RESULT_TEXT";
    //Create objects for ID references
    Button btnAdd;
    Button btnMinus;
    Button btnNextScreen;
    TextView tvResult;
    int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Register objects with XML layout activity
        btnAdd = (Button) findViewById(R.id.btn_add);
        btnMinus = (Button) findViewById(R.id.btn_minus);
        btnNextScreen = (Button) findViewById(R.id.btn_next_screen);
        tvResult = (TextView) findViewById(R.id.tv_result);

        // Create events for button clicks
        // increase number
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num++;
                tvResult.setText(String.valueOf(num));
            }
        });
        // decrease number
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num--;
                tvResult.setText(String.valueOf(num));
            }
        });

        btnNextScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onNewScreen(view);
            }
        });
    }
    public void onNewScreen(View view){
        // grab text out, and moved into variable result
        String result = tvResult.getText().toString();

        // Open new screen, move to next Java class
        Intent intent = new Intent(this, NextScreen.class);
        // bundling, allowing to be passed between classes
        intent.putExtra(RESULT_TEXT, result);
        // click new event, move to java, private, create new intent and contain java class and activate
        startActivity(intent);
    }
}