package com.pronin.androidbegginers;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

public class RVAdapter extends ListAdapter<String, RVViewHolder> {

    protected RVAdapter(@NonNull DiffUtil.ItemCallback<String> diffCallback) {
        super(diffCallback);
    }

    @NonNull
    @Override
    public RVViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_layout, parent, false);
        return new RVViewHolder(view.findViewById(R.id.tv_rv_item_title));
    }

    @Override
    public void onBindViewHolder(@NonNull RVViewHolder holder, int position) {
        String value = getItem(position);
        holder.view.setText(value);
    }
}
