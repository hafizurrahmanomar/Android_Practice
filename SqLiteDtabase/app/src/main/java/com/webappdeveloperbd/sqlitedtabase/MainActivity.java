package com.webappdeveloperbd.sqlitedtabase;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edName,edMobile;
    Button buttonInsert,buttonShow;
    SqLiteDataBase sqLiteDataBase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        edName = findViewById(R.id.edName);
        edMobile = findViewById(R.id.edMobile);
        buttonInsert = findViewById(R.id.buttonInsert);
        buttonShow = findViewById(R.id.buttonShow);
        sqLiteDataBase = new SqLiteDataBase(MainActivity.this);


        buttonInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /// Code here
                sqLiteDataBase.insertData(edName.getText().toString(),edMobile.getText().toString());

            }
        });


    }
}