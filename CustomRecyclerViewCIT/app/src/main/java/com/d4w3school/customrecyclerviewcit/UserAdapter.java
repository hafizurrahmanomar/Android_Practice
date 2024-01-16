package com.d4w3school.customrecyclerviewcit;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

//extends RecyclerView.Adapter<UserViewHolder> and UserAdapter implement methods create==#12
public class UserAdapter extends RecyclerView.Adapter<UserViewHolder> {
    // create Context context; List<User> userList;==#13

    Context context;
    List<User> userList;

    // Create Constructor ==#14
    public UserAdapter(Context context , List<User> userList) {
        this.context = context;
        this.userList = userList;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent , int viewType) {
        // create view by LayoutInflater==#15

        View view = LayoutInflater.from(context).inflate(R.layout.item_user,parent,false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder , int position) {

        //===Step#16==get=name,phone,email and profile==
        //===Step#17====go to picasso library add to gradle module==

        User user =userList.get(position);
        holder.name.setText(user.getName());
        holder.phone.setText(user.getPhone());
        holder.email.setText(user.getEmail());

        //after picasso library add than below code here==Step#18
        //go to activity_main.xml and add RecyclerView==Step#19

        Picasso.get().load(user.getProfile()).into(holder.profile_image);

        //btn clickable and ProfileActivity and java class create for Intent==Steps#24
        //Go to activity_profile.xml design

        holder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Must be help context cause this file no MainActivity
                Intent intent = new Intent(context,ProfileActivity.class);

                intent.putExtra("name",user.getName());
                intent.putExtra("phone",user.getPhone());
                intent.putExtra("email",user.getEmail());
                intent.putExtra("profile",user.getProfile());

                //Step # 28 for Put Extra end
                //Go to ProfileActivity.java for get intent
                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {

        return userList.size();
    }
}
