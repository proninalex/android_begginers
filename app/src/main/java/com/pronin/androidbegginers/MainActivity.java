package com.pronin.androidbegginers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate() called with: savedInstanceState = [" + savedInstanceState + "]");
        setContentView(R.layout.activity_main);
        findViewById(R.id.button_sample).setOnClickListener(view -> {
            Toast
                    .makeText(this, "Button is working", Toast.LENGTH_SHORT)
                    .show();
        });
    }
}