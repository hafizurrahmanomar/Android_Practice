package com.example.recyclerviewwithcit;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {

    //Name list through Name.java

    List<Name> nameList;

    RecyclerView recyclerView;

    //===NameAdapter.java file connection
    NameAdapter nameAdapter;

    Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        nameList = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);
        button = findViewById(R.id.button);

        // Name name = new Name("Hafiz") ;

        nameList.add(new Name("Hafiz"));
        nameList.add(new Name("Nayeem"));
        nameList.add(new Name("Toha"));
        nameList.add(new Name("Joha"));
        nameList.add(new Name("Nargis"));
        nameList.add(new Name("Salma"));
        nameList.add(new Name("Sima"));
        nameList.add(new Name("Hafiz"));
        nameList.add(new Name("Nayeem"));
        nameList.add(new Name("Toha"));
        nameList.add(new Name("Joha"));
        nameList.add(new Name("Nargis"));
        nameList.add(new Name("Salma"));
        nameList.add(new Name("Sima"));
        nameList.add(new Name("Hafiz"));
        nameList.add(new Name("Nayeem"));
        nameList.add(new Name("Toha"));
        nameList.add(new Name("Joha"));
        nameList.add(new Name("Nargis"));
        nameList.add(new Name("Salma"));
        nameList.add(new Name("Sima"));
        nameList.add(new Name("Hafiz"));
        nameList.add(new Name("Nayeem"));
        nameList.add(new Name("Toha"));
        nameList.add(new Name("Joha"));
        nameList.add(new Name("Nargis"));
        nameList.add(new Name("Salma"));
        nameList.add(new Name("Sima"));




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //Adapter object create and recyclerView add wit adapter
                nameAdapter = new NameAdapter(MainActivity.this,nameList);
                recyclerView.setAdapter(nameAdapter);


            }
        });


    }
}