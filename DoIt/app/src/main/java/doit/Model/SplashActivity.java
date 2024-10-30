package com.example.doit.Model;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.content.Intent;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

import com.example.doit.MainActivity;
import com.example.doit.R;

public class SplashActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.fab), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        final Intent i = new Intent(SplashActivity.this, MainActivity.class);
        new Handler() {
            public void postDelayed(Runnable runnable, int i) {

            }

            @Override
            public void publish(LogRecord record) {

            }

            @Override
            public void flush() {

            }

            @Override
            public void close() throws SecurityException {

            }
        }.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(i);
                finish();
            }
        }, 2000);
    }
}