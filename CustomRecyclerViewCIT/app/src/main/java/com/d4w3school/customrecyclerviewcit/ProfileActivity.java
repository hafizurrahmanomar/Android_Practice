package com.d4w3school.customrecyclerviewcit;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class ProfileActivity extends AppCompatActivity {
    //    Steps#26
    ImageView Profile_photo;
    TextView name,phone,email;

    //Steps#28== intent Variable create
    Intent intent;

    //Steps#30== intent Variable create
    String name_str,phone_str,email_str,profile_str;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        //    Steps#27
        //Go to UserAdapter for put Extra

        Profile_photo = findViewById(R.id.Profile_photo);
        name = findViewById(R.id.name);
        phone = findViewById(R.id.phone);
        email = findViewById(R.id.email);

        //Steps#29== before must intent variable create than get intent

        intent=getIntent();
        if (intent.hasExtra("phone")){
            //String Variable create
            name_str=intent.getStringExtra("name");
            phone_str=intent.getStringExtra("phone");
            email_str=intent.getStringExtra("email");
            profile_str=intent.getStringExtra("profile");

        }
        //set text
        name.setText(name_str);
        phone.setText(phone_str);
        email.setText(email_str);

        //for image load
        Picasso.get().load(profile_str).into(Profile_photo);

    }
}