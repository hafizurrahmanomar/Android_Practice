package com.webappdeveloper.javaabstract;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView tvDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

   tvDisplay = findViewById(R.id.tvDisplay);
   tvDisplay.setText("");
   Employee fultimeemployee = new FullTimeEmployee("Hafiz","CEO", 1000);
   tvDisplay.append("\nName: " +fultimeemployee.getName());
   tvDisplay.append("\nPosition: "+fultimeemployee.getPosition());
   tvDisplay.append("\nTotal Tax: " +fultimeemployee.calculateTax());
   tvDisplay.append("\nFinal Salary: "+fultimeemployee.finalSalary());


Employee partimeemployee = new PartTimeEmployee ("Joly Khatun","EO", 1000);
        tvDisplay.append("\n\n\nName: " +partimeemployee.getName());
        tvDisplay.append("\nPosition: "+partimeemployee.getPosition());
        tvDisplay.append("\nTotal Tax: "+partimeemployee.calculateTax());
        tvDisplay.append("\nFinal Salary: "+partimeemployee.finalSalary());

    }

}