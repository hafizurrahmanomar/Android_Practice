package com.example.recyclerviewwithcit;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;

public class NameViewHolder extends RecyclerView.ViewHolder {

    TextView nameItem;


    public NameViewHolder(@NonNull @NotNull View itemView) {
        super(itemView);

        nameItem = itemView.findViewById(R.id.nameItem);

    }
}
