package com.hafizurrahmanomar.fragmenttablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayout);

        //Fragment Primary Home run code

        FragmentManager fragmentManager =getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.hafizLayout, new Home());
        fragmentTransaction.commit();


        //tabLayout.addOnTabSelectedListener code here

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            int tabPosition = tab.getPosition();

            // String tabText = tab.getText().toString();
            // Toast.makeText(MainActivity.this, tabText, Toast.LENGTH_SHORT).show();


             if(tabPosition==0){

                 FragmentManager fragmentManager =getSupportFragmentManager();
                 FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                 fragmentTransaction.add(R.id.hafizLayout, new Home());
                 fragmentTransaction.commit();
             }


             else if (tabPosition==1){

                 FragmentManager fragmentManager =getSupportFragmentManager();
                 FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                 fragmentTransaction.add(R.id.hafizLayout, new About());
                 fragmentTransaction.commit();
             }


             else if (tabPosition==2){

                 FragmentManager fragmentManager =getSupportFragmentManager();
                 FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                 fragmentTransaction.add(R.id.hafizLayout, new Services());
                 fragmentTransaction.commit();
             }


             else if (tabPosition==3){

                 FragmentManager fragmentManager =getSupportFragmentManager();
                 FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                 fragmentTransaction.add(R.id.hafizLayout, new Contact());
                 fragmentTransaction.commit();
             }


            }







            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }
}