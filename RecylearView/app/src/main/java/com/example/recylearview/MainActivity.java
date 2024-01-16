package com.example.recylearview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.Picasso;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    HashMap<String,String> hashMap;
    ArrayList<HashMap<String,String>> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);


        arrayList = new ArrayList<>();


        hashMap = new HashMap<>();
        hashMap.put("video_id","h7KNhhiH0ac");
        hashMap.put("video_title","সূরা ফাতিহা সহজ পদ্ধতিতে সহিহ করুন । ");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("video_id","ehIegRZmduo");
        hashMap.put("video_title","সহজ পদ্ধতিতে সূরা ইখলাস সহিহ করুন । ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("video_id","YwYeFcIC-bo");
        hashMap.put("video_title","দোয়ায় কুনুত না পারলে করনীয় কি !! খুব সহজে জেনে নিন । ");
        arrayList.add(hashMap);



        MyAdapter adapter = new MyAdapter();
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));



    }
//==============================================================

    private class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{




        private class MyViewHolder extends RecyclerView.ViewHolder{

            ImageView imageView;
            TextView myTextView;


            public MyViewHolder(@NonNull @NotNull View itemView) {
                super(itemView);

                imageView = itemView.findViewById(R.id.imageView);
                myTextView = itemView.findViewById(R.id.myTextView);
            }
        }




        @NonNull
        @NotNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {

            // LayoutInflater

            LayoutInflater inflater = getLayoutInflater();
            View myView = inflater.inflate(R.layout.recylear_item,parent,false);
            
            //null out and new  MyViewHolder(myView) add here
            return new MyViewHolder(myView) ;
        }

        @Override
        public void onBindViewHolder(@NonNull @NotNull MyViewHolder holder, int position) {

            //holder.myTextView.setText("Item position: " +position);

            hashMap = arrayList.get(position);
            String video_title =hashMap.get("video_title");
            String video_id =hashMap.get("video_id");
            String  imageURL = "https://img.youtube.com/vi/"+ video_id +"/0.jpg";

            //picasso implement
            holder.myTextView.setText(video_title);
            Picasso.get()
                    .load(imageURL)
                    .into(holder.imageView);


        }

        @Override
        public int getItemCount() {
            return arrayList.size();
        }


    }

//=========================================================================================




}