package com.dims13.peminjamanbuku.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.dims13.peminjamanbuku.R;
import com.dims13.peminjamanbuku.databuku.ActivityDatabuku;
import com.dims13.peminjamanbuku.pengguna.HalamanLogin;

public class AdminActivity extends AppCompatActivity {
    private Button btnkeluar, btndatabuku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        initView();
        keluar();
    }

    private void keluar() {
        btnkeluar.setOnClickListener(view -> startActivity(new Intent(AdminActivity.this, HalamanLogin.class)));
    }

    private void initView() {
        btnkeluar = findViewById(R.id.btnkeluar);
    }
}
