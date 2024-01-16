package com.webappdeveloper.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       tvDisplay = findViewById(R.id.tvDisplay);
       tvDisplay.setText(" ");


JavaOopConcept Nayeem = new JavaOopConcept("Hossain Mohammod Nyeem","Hefeez", 2);

//        Nayeem.setName("Hossain Mohammod Nyeem");
//        Nayeem.setClassName("Hefeez");
//        Nayeem.setRolNumber(02);

JavaOopConcept Toha = new JavaOopConcept("Mohamud Hassan Toha","Nurani",12);

//        Toha.setName("Mohamud Hassan Toha");
//        Toha.setClassName("Nurani");
//        Toha.setRolNumber(10);

        tvDisplay.append("\n Student Name: "+Nayeem.getName());
        tvDisplay.append("\n Student Class Name: "+Nayeem.getClassName());
        tvDisplay.append("\n Student Rol Number: "+Nayeem.getRolNumber());

        tvDisplay.append("\n\n Student Name: "+Toha.getName());
        tvDisplay.append("\n Student Class Name: "+Toha.getClassName());
        tvDisplay.append("\n Student Rol Number: "+Toha.getRolNumber());

    }
}