package com.pronin.androidbegginers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyRecycler extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_recycler);

        List<String> values = Arrays.asList(
                "Some text from adapter",
                "This is my shit",
                "Marilyn Manson",
                "Dop show"
        );

        RVAdapter adapter = new RVAdapter(new RVDiffUtils());
        adapter.submitList(values);

        RecyclerView rv = findViewById(R.id.rv_list);
        rv.setAdapter(adapter);

        findViewById(R.id.button_add).setOnClickListener(view -> {
            List<String> currentList = new ArrayList<>(adapter.getCurrentList());
            currentList.add("new Item!");
            adapter.submitList(currentList);
        });
    }
}