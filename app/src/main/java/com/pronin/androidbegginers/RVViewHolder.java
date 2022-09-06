package com.pronin.androidbegginers;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RVViewHolder extends RecyclerView.ViewHolder {

    TextView view;

    public RVViewHolder(@NonNull TextView itemView) {
        super(itemView);
        this.view = itemView;
    }
}
