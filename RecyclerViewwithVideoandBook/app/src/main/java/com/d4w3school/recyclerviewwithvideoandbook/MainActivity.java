package com.d4w3school.recyclerviewwithvideoandbook;

<<<<<<< HEAD
        import androidx.appcompat.app.AppCompatActivity;
        import androidx.recyclerview.widget.RecyclerView;

        import android.os.Bundle;

        import java.util.ArrayList;
        import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    HashMap<String,String> hashMap;
    ArrayList<HashMap<String,String>> arrayList;
=======
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

   RecyclerView recyclerView;
   HashMap<String,String> hashMap;
   ArrayList<HashMap<String,String>> arrayList;
>>>>>>> 029bcced7b350b5462860a1626508529e9c30d7d




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        arrayList = new ArrayList<>();

//======= for book=================
        hashMap = new HashMap<>();
<<<<<<< HEAD
        hashMap.put("itemType","Book");
        hashMap.put("bookName","কুরআনের শব্দাবলি (লেভেল - ২) (পেপারব্যাক)");
        hashMap.put("writerName","জোবায়ের আল মাহমুদ");
        hashMap.put("bookLink","https://www.rokomari.com/book/266924/quraner-shobdaboli-level-2");
        hashMap.put("bookImage","https://ds.rokomari.store/rokomari110/ProductNew20190903/260X372/Quraner_Shobdaboli_Level_2-Jobayer_Al_Mahmud-d4903-266924.jpg");
=======
        hashMap.put("itemType","BOOK");
        hashMap.put("BookName","কুরআন থেকে নেওয়া জীবনের পাঠ ");
        hashMap.put("WriterName","আরিফ আজাদ");
        hashMap.put("bookLink","https://www.rokomari.com/book/279506/quran-theke-newa-jiboner-path");
        hashMap.put("bookImage","https://lh3.googleusercontent.com/GtHDEg-4j0qb5QdazyJvOJYc5NZ7i4bL8Mj1O17OD66udIBZWUxKh8iZV9Camlw6LmoFjAKBTYHQc7EeZhuWntbSOeAOhxx0rHm9RocY2Q");
>>>>>>> 029bcced7b350b5462860a1626508529e9c30d7d
        arrayList.add(hashMap);


        //======= for Video=================
        hashMap = new HashMap<>();
        hashMap.put("itemType","VIDEO");
<<<<<<< HEAD
        hashMap.put("videoTitle","সহজ পদ্ধতিতে  সূরা ফাতিহা  সহিহ করুন ।");
        hashMap.put("videoId","h7KNhhiH0ac");
        arrayList.add(hashMap);




=======
        hashMap.put("videoTitle","সুরা ফাতেহা ভুল ঠিক করুন || সূরা ফাতিহা শুদ্ধ করে শিখুন ");
        hashMap.put("videoId","_1zw7tGV7MY");
        arrayList.add(hashMap);


        XAdapter adapter = new XAdapter();
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
>>>>>>> 029bcced7b350b5462860a1626508529e9c30d7d

    }

    //==========================================================
<<<<<<< HEAD


    private class XAdapter extends RecyclerView.Adapter{

        


    }

=======
    //Adapter create
    private class XAdapter extends RecyclerView.Adapter{

        int BOOK_ITEM = 0;
        int VIDEO_ITEM = 1;

        // video ViewHolder create
        private class videoViewHolder extends RecyclerView.ViewHolder{

        TextView tvVideoTitle;
        ImageView imageThumbnail;
            public videoViewHolder(@NonNull View itemView) {
                super(itemView);

                tvVideoTitle = itemView.findViewById(R.id.tvVideoTitle);
                imageThumbnail = itemView.findViewById(R.id.imageThumbnail);
            }
        }

        // Book ViewHolder create

        private class bookViewHolder extends RecyclerView.ViewHolder{

            ImageView imgBook;
            TextView tvBookName,tvWriterName;
            MaterialButton buttonGetBook;

            public bookViewHolder(@NonNull View itemView) {
                super(itemView);

                imgBook = itemView.findViewById(R.id.imgBook);
                tvBookName = itemView.findViewById(R.id.tvBookName);
                tvWriterName = itemView.findViewById(R.id.tvWriterName);
                buttonGetBook = itemView.findViewById(R.id.buttonGetBook);

            }
        }



        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent , int viewType) {

// ==========LayoutInflate ==========
            LayoutInflater inflater = getLayoutInflater();

            if(viewType==BOOK_ITEM){

                View myView = inflater.inflate(R.layout.item_book,parent,false);
                return  new bookViewHolder(myView);
            }
            else {

                View myView = inflater.inflate(R.layout.item_video,parent,false);
                return  new videoViewHolder(myView);

            }


        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder , int position) {
        //====bookViewHolder========================

            if(getItemViewType(position)==BOOK_ITEM){

                bookViewHolder hafizBookHolder = (bookViewHolder) holder;
                hashMap = arrayList.get(position);

                String BookName = hashMap.get("tvBookName");
                String WriterName = hashMap.get("tvWriterName");
                String bookLink = hashMap.get("bookLink");
                String bookImage = hashMap.get("imgBook");

                //==============================
                hafizBookHolder.tvBookName.setText(BookName);
                hafizBookHolder.tvWriterName.setText(WriterName);

                hafizBookHolder.buttonGetBook.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Toast.makeText(getApplicationContext() , bookLink , Toast.LENGTH_SHORT).show();
                    }
                });

                Picasso.get().load(bookImage).into(hafizBookHolder.imgBook);



            }else if (getItemViewType(position)==VIDEO_ITEM){
               videoViewHolder hafizVideoHolder = (videoViewHolder) holder;

                hashMap = arrayList.get(position);

                String videoTitle = hashMap.get("videoTitle");
                String videoId = hashMap.get("videoId");
                String imageURL = "https://img.youtube.com/vi/"+videoId+"/0.jpg";

                Picasso.get().load(imageURL).into(hafizVideoHolder.imageThumbnail);







            }


        }

        @Override
        public int getItemCount() {
            return arrayList.size();

        }
//=====getItemViewType @Override method call==========
        @Override
        public int getItemViewType(int position) {

            //==itemType find out======
            hashMap =arrayList.get(position);
            String itemType = hashMap.get("itemType");

            if(itemType.contains("BOOk")) return BOOK_ITEM;
            else return VIDEO_ITEM;



        }
    }
  //=======================================
>>>>>>> 029bcced7b350b5462860a1626508529e9c30d7d

}