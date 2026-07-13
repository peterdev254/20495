package com.example.stylenest20495;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.AppCompatActivity;

public class activity_splsh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splsh);

        // Delay for 2 seconds then transition to MainActivity
        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            Intent intent = new Intent(activity_splsh.this, activity_main.class);
            startActivity(intent);
            finish(); // Close splash
        }, 2000);
    }
}
