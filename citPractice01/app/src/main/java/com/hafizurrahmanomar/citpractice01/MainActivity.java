package com.hafizurrahmanomar.citpractice01;

import static com.hafizurrahmanomar.citpractice01.R.id.tvDisplay;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button followMe,callMe,messageMe;
    ImageView btnFacebook;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        followMe = findViewById(R.id.fllowMe);
        callMe = findViewById(R.id.callMe);
        messageMe = findViewById(R.id.messageMe);

        btnFacebook = findViewById(R.id.btnFacebook);


        //====setOnClickListener For Intent==================
        followMe.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,Activity2.class );
            startActivity(intent);

        });

        //====setOnClickListener For call==================
         callMe.setOnClickListener(v ->{

             String number = "01734731069";
             Uri uri = Uri.fromParts("tel",number,null);
             Intent intent = new Intent( Intent.ACTION_DIAL);
             intent.setData(uri);
             startActivity(intent);



         } );


        //====setOnClickListener For call==================
        messageMe.setOnClickListener(v ->{

            String number = "01734731069";
            Uri uri = Uri.fromParts("sms",number," ");
            Intent intent = new Intent( Intent.ACTION_VIEW);
            //intent.putExtra("sms_body", "How are you?");
            intent.setData(uri);
            startActivity(intent);



        } );

        //============Url create====================

       //lunchUrl("https://www.facebook.com/learnwithhafizurrahmanomar");


    }

    private void lunchUrl(String url) {

       // Uri uri = Uri.parse(url);

        Intent intent =new Intent(Intent.ACTION_VIEW);
        //intent.setData(uri);

        intent.setData(Uri.parse(url));

        startActivity(intent);
    }
}