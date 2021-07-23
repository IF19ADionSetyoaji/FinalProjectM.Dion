package com.dims13.peminjamanbuku;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.dims13.peminjamanbuku.R;

public class SplashscreenActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashscreenActivity.this, com.dims13.peminjamanbuku.LoginAwalActivity.class);
                startActivity(intent);
                finish();
            }
        }, 2000);
}
    }