package com.d4w3school.customrecyclerviewcit;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.RecyclerView;

import de.hdodenhof.circleimageview.CircleImageView;

//extends RecyclerView.ViewHolder and UserViewHolder implement methods create==Step#08

public class UserViewHolder extends RecyclerView.ViewHolder {
    //    item_user.xml id introduce==#step#09
    CircleImageView profile_image;
    TextView name,phone,email;
    AppCompatButton btn;
    public UserViewHolder(@NonNull View itemView) {
        super(itemView);

        //item_user.xml id identify==#step#10
        //go to create UserAdapter.java class==#step#11

        profile_image = itemView.findViewById(R.id.profile_image);
        name = itemView.findViewById(R.id.name);
        phone = itemView.findViewById(R.id.phone);
        email = itemView.findViewById(R.id.email);
        btn = itemView.findViewById(R.id.btn);






    }
}
