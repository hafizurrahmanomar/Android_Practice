package com.example.recyclerviewwithcit;

import android.content.Context;
import android.hardware.lights.LightState;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class NameAdapter extends RecyclerView.Adapter<NameViewHolder> {

    Context context;
    List<Name> nameList;

    //Constructor Create
    public NameAdapter(Context context, List<Name> nameList) {
        this.context = context;
        this.nameList = nameList;
    }

    @NonNull
    @NotNull
    @Override
    public NameViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {

        //LayoutInflater create and ashing MyView Variable

        View MyView = LayoutInflater.from(context).inflate(R.layout.item_name,parent,false);
        return new NameViewHolder(MyView);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull NameViewHolder holder, int position) {

        Name name = nameList.get(position);
        holder.nameItem.setText(name.getName());



    }

    @Override
    public int getItemCount() {

        return nameList.size();
    }
}
