package com.d4w3school.customrecyclerviewcit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //====Step #04====
    List<User> userList;

    //Step #21
    RecyclerView recycler;
    UserAdapter userAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //userList initialization==#05
        //go to item_user.xml

        userList = new ArrayList<>();

//step #22
        recycler = findViewById(R.id.recycler);

        userList.add(new User("Md.Hafizur Rahman","+8801731234567","hafiz@gmail.com","https://images.unsplash.com/photo-1466112928291-0903b80a9466?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OXx8cHJvZmlsZXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60"));
        userList.add(new User("Md.Abdullah Mia","+8801731234565","abdullah@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQq9xq7KgImoaTx6rqbS29quEv-Ar10Yd53tg&usqp=CAU"));
        userList.add(new User("Salma","+8801731234566","salma@gmail.com","https://images.unsplash.com/photo-1494790108377-be9c29b29330?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80"));
        userList.add(new User("Nayeem","+8801731234545","nayeem@gmail.com","https://images.unsplash.com/photo-1579783902614-a3fb3927b6a5?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fHByb2ZpbGV8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60"));
        userList.add(new User("Salam","+8801731234545","salam@gmail.com","https://images.unsplash.com/photo-1497316730643-415fac54a2af?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OHx8cHJvZmlsZXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60"));
        userList.add(new User("Md.Hafizur Rahman","+8801731234567","hafiz@gmail.com","https://images.unsplash.com/photo-1466112928291-0903b80a9466?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OXx8cHJvZmlsZXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60"));
        userList.add(new User("Md.Abdullah Mia","+8801731234565","abdullah@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQq9xq7KgImoaTx6rqbS29quEv-Ar10Yd53tg&usqp=CAU"));
        userList.add(new User("Md.Hafizur Rahman","+8801731234567","hafiz@gmail.com","https://images.unsplash.com/photo-1466112928291-0903b80a9466?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OXx8cHJvZmlsZXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60"));
        userList.add(new User("Md.Abdullah Mia","+8801731234565","abdullah@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQq9xq7KgImoaTx6rqbS29quEv-Ar10Yd53tg&usqp=CAU"));
        userList.add(new User("Md.Hafizur Rahman","+8801731234567","hafiz@gmail.com","https://images.unsplash.com/photo-1466112928291-0903b80a9466?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OXx8cHJvZmlsZXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60"));
        userList.add(new User("Md.Abdullah Mia","+8801731234565","abdullah@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQq9xq7KgImoaTx6rqbS29quEv-Ar10Yd53tg&usqp=CAU"));
        userList.add(new User("Salma","+8801731234566","salma@gmail.com","https://images.unsplash.com/photo-1494790108377-be9c29b29330?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80"));
        userList.add(new User("Nayeem","+8801731234545","nayeem@gmail.com","https://images.unsplash.com/photo-1579783902614-a3fb3927b6a5?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fHByb2ZpbGV8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60"));
        userList.add(new User("Salam","+8801731234545","salam@gmail.com","https://images.unsplash.com/photo-1497316730643-415fac54a2af?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OHx8cHJvZmlsZXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60"));
        userList.add(new User("Salma","+8801731234566","salma@gmail.com","https://images.unsplash.com/photo-1494790108377-be9c29b29330?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80"));
        userList.add(new User("Nayeem","+8801731234545","nayeem@gmail.com","https://images.unsplash.com/photo-1579783902614-a3fb3927b6a5?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fHByb2ZpbGV8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60"));
        userList.add(new User("Salam","+8801731234545","salam@gmail.com","https://images.unsplash.com/photo-1497316730643-415fac54a2af?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OHx8cHJvZmlsZXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60"));
        userList.add(new User("Salma","+8801731234566","salma@gmail.com","https://images.unsplash.com/photo-1494790108377-be9c29b29330?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80"));
        userList.add(new User("Md.Hafizur Rahman","+8801731234567","hafiz@gmail.com","https://images.unsplash.com/photo-1466112928291-0903b80a9466?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OXx8cHJvZmlsZXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60"));
        userList.add(new User("Md.Abdullah Mia","+8801731234565","abdullah@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQq9xq7KgImoaTx6rqbS29quEv-Ar10Yd53tg&usqp=CAU"));
        userList.add(new User("Salma","+8801731234566","salma@gmail.com","https://images.unsplash.com/photo-1494790108377-be9c29b29330?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80"));
        userList.add(new User("Nayeem","+8801731234545","nayeem@gmail.com","https://images.unsplash.com/photo-1579783902614-a3fb3927b6a5?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fHByb2ZpbGV8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60"));
        userList.add(new User("Salam","+8801731234545","salam@gmail.com","https://images.unsplash.com/photo-1497316730643-415fac54a2af?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OHx8cHJvZmlsZXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60"));
        userList.add(new User("Md.Hafizur Rahman","+8801731234567","hafiz@gmail.com","https://images.unsplash.com/photo-1466112928291-0903b80a9466?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OXx8cHJvZmlsZXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60"));
        userList.add(new User("Md.Abdullah Mia","+8801731234565","abdullah@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQq9xq7KgImoaTx6rqbS29quEv-Ar10Yd53tg&usqp=CAU"));
        userList.add(new User("Md.Hafizur Rahman","+8801731234567","hafiz@gmail.com","https://images.unsplash.com/photo-1466112928291-0903b80a9466?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OXx8cHJvZmlsZXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60"));
        userList.add(new User("Md.Abdullah Mia","+8801731234565","abdullah@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQq9xq7KgImoaTx6rqbS29quEv-Ar10Yd53tg&usqp=CAU"));
        userList.add(new User("Md.Hafizur Rahman","+8801731234567","hafiz@gmail.com","https://images.unsplash.com/photo-1466112928291-0903b80a9466?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OXx8cHJvZmlsZXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60"));
        userList.add(new User("Md.Abdullah Mia","+8801731234565","abdullah@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQq9xq7KgImoaTx6rqbS29quEv-Ar10Yd53tg&usqp=CAU"));
        userList.add(new User("Salma","+8801731234566","salma@gmail.com","https://images.unsplash.com/photo-1494790108377-be9c29b29330?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80"));
        userList.add(new User("Nayeem","+8801731234545","nayeem@gmail.com","https://images.unsplash.com/photo-1579783902614-a3fb3927b6a5?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fHByb2ZpbGV8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60"));
        userList.add(new User("Salam","+8801731234545","salam@gmail.com","https://images.unsplash.com/photo-1497316730643-415fac54a2af?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OHx8cHJvZmlsZXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60"));
        userList.add(new User("Salma","+8801731234566","salma@gmail.com","https://images.unsplash.com/photo-1494790108377-be9c29b29330?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80"));
        userList.add(new User("Nayeem","+8801731234545","nayeem@gmail.com","https://images.unsplash.com/photo-1579783902614-a3fb3927b6a5?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fHByb2ZpbGV8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60"));
        userList.add(new User("Salam","+8801731234545","salam@gmail.com","https://images.unsplash.com/photo-1497316730643-415fac54a2af?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OHx8cHJvZmlsZXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60"));
        userList.add(new User("Salma","+8801731234566","salma@gmail.com","https://images.unsplash.com/photo-1494790108377-be9c29b29330?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80"));
        userList.add(new User("Nayeem","+8801731234545","nayeem@gmail.com","https://images.unsplash.com/photo-1579783902614-a3fb3927b6a5?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fHByb2ZpbGV8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60"));
        userList.add(new User("Salam","+8801731234545","salam@gmail.com","https://images.unsplash.com/photo-1497316730643-415fac54a2af?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OHx8cHJvZmlsZXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60"));
        userList.add(new User("Nayeem","+8801731234545","nayeem@gmail.com","https://images.unsplash.com/photo-1579783902614-a3fb3927b6a5?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fHByb2ZpbGV8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60"));
        userList.add(new User("Salam","+8801731234545","salam@gmail.com","https://images.unsplash.com/photo-1497316730643-415fac54a2af?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OHx8cHJvZmlsZXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60"));

        //step #23
        //goto UserAdapter for btn clickable
        userAdapter = new UserAdapter(MainActivity.this,userList);
        recycler.setAdapter(userAdapter);


    }
}