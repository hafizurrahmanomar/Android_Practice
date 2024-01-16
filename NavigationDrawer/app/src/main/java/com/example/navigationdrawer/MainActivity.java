package com.example.navigationdrawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    MaterialToolbar materialToolbar;

    NavigationView navigationView;

    //part of NavigationView
    TextView header_title;
    View headerView;
    ImageView header_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        drawerLayout = findViewById(R.id.drawerLayout);
        materialToolbar = findViewById(R.id.materialToolbar);
        navigationView = findViewById(R.id.navigationView);

        //part of NavigationView
        headerView = navigationView.getHeaderView(0);
        header_title = headerView.findViewById(R.id.header_title);
        header_image = headerView.findViewById(R.id.header_image);

        //Header title change now
        header_title.setText("Hafizur Rahman Omar");

        // All time FirstFagment run code here
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frameLayout,new FirstFagment());
        fragmentTransaction.commit();



//drawerLayout linkUp materialToolbar
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                MainActivity.this,drawerLayout,materialToolbar,R.string.close_drawer,R.string.open_drawer);

        drawerLayout.addDrawerListener(toggle);

        //=====setOnMenuItemClickListener========
        materialToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if (item.getItemId()==R.id.share){

                    Toast.makeText(MainActivity.this, "Share Items click now", Toast.LENGTH_SHORT).show();
                }

                return false;
            }
        });



        //setNavigationItemSelectedListener =======
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if (item.getItemId()==R.id.facebook){
                    //Toast.makeText(MainActivity.this, "Facebook Items click now", Toast.LENGTH_SHORT).show();

                    FirstFagment.WEB_URL="https://wwww.facebook.com/";

                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
                    fragmentTransaction.add(R.id.frameLayout,new FirstFagment());
                    fragmentTransaction.commit();


                    drawerLayout.closeDrawer(GravityCompat.START);
                }

                else if (item.getItemId()==R.id.instragram){

                    //Toast.makeText(MainActivity.this, "Instragram Items click now", Toast.LENGTH_SHORT).show();
                    FirstFagment.WEB_URL="https://www.instagram.com/";

                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
                    fragmentTransaction.add(R.id.frameLayout,new FirstFagment());
                    fragmentTransaction.commit();


                    drawerLayout.closeDrawer(GravityCompat.START);
                }
                else if (item.getItemId()==R.id.twitter){

                    //Toast.makeText(MainActivity.this, "Twitter Items click now", Toast.LENGTH_SHORT).show();
                    FirstFagment.WEB_URL="https://twitter.com/";

                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
                    fragmentTransaction.add(R.id.frameLayout,new FirstFagment());
                    fragmentTransaction.commit();

                    drawerLayout.closeDrawer(GravityCompat.START);
                }

                else if (item.getItemId()==R.id.setting){

                    Toast.makeText(MainActivity.this, "Setting Items click now", Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                }

                return true;
            }
        });
        //setNavigationItemSelectedListener  End=======
    }
    //====onCreat Bundle end===========


}