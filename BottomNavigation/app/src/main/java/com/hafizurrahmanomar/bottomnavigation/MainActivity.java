package com.hafizurrahmanomar.bottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);


        // Fragment code here
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frameLayout, new Home_Fragment());
        fragmentTransaction.commit();

        //bottomNavigationView setOnItemSelectedListener call here

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            //getItemId call bottom_navigation.xml
            if (item.getItemId()==R.id.home){

                // Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
                // Toast.makeText(getApplicationContext(),"This is Home",Toast.LENGTH_LONG).show();

                // Fragment code here
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.frameLayout, new Home_Fragment());
                fragmentTransaction.commit();


            }

                else if (item.getItemId()==R.id.about){

                // Toast.makeText(MainActivity.this, "About Me", Toast.LENGTH_SHORT).show();
                // Toast.makeText(getApplicationContext(),"About Me",Toast.LENGTH_LONG).show();

                // Fragment code here
                    FragmentManager fragmentManager=getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
                    fragmentTransaction.add(R.id.frameLayout, new About_Me_Fragment());
                    fragmentTransaction.commit();


                }

            else if (item.getItemId()==R.id.about){

                // Toast.makeText(MainActivity.this, "Contact Me", Toast.LENGTH_SHORT).show();
                // Toast.makeText(getApplicationContext(),"Contact Me",Toast.LENGTH_LONG).show();

                // Fragment code here
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.frameLayout, new Contact_Me_Fragment());
                fragmentTransaction.commit();


            }


                return true;
            }
        });


    }
}