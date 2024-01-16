package com.hafizurrahmanomar.citquizapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {

    TextView tvScore,tvQuestion;
    AppCompatButton btn_check;
    RadioGroup radioGroup;
    RadioButton option1,option2,option3,option4;
    
    protected void onCreate(Bundle savedInstanceState, Object question) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvScore = findViewById(R.id.tvScore);
        tvQuestion = findViewById(R.id.tvQuestion);
        btn_check = findViewById(R.id.btn_check);
        radioGroup = findViewById(R.id.radioGroup);
        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);
        option4 = findViewById(R.id.option4);




    }


}

