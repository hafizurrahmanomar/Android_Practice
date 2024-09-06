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

   // one way
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

        // other way

        Employee hafiz_salary = new Employee("Hafiz","CEO",5000){

            @Override
            public float calculateTax() {
                return getSalary()*5/100;
            }

            @Override
            public float finalSalary() {
                return getSalary()-calculateTax();
            }
        };

        tvDisplay.append("\n\n\nName: " +hafiz_salary.getName());
        tvDisplay.append("\nPosition: "+hafiz_salary.getPosition());
        tvDisplay.append("\nTotal Tax: "+hafiz_salary.calculateTax());
        tvDisplay.append("\nFinal Salary: "+hafiz_salary.finalSalary());


    }
}