package com.hafizurrahmanomar.setonclicklistener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button myButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.tvDisplay);
        myButton = findViewById(R.id.myButton);

//        ================myButton OnClickListener=====================

    myButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            tvDisplay.setText("Hello android Programmer");


        }
    });
//=======================tvDisplay OnClickListener==================

        tvDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                myButton.setText("Text change ok");

            }
        });

    }
}