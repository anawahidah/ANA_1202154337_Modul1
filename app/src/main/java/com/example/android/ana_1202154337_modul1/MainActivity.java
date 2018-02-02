package com.example.android.ana_1202154337_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText nama_makanan, jumlah_porsi;

    private int UangOsas = 65500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama_makanan = findViewById(R.id.nama_makanan);
        jumlah_porsi = findViewById(R.id.jumlah_porsi);
    }


    public void ke_eatbus(View view) {
        Intent intent = new Intent(this, ActivityResult.class);
        intent.putExtra("nama_tempat", "eatbus");
        intent.putExtra("nama_makanan", nama_makanan.getText().toString());
        intent.putExtra("jumlah_porsi", jumlah_porsi.getText().toString());
        intent.putExtra("uang_osas",UangOsas);

        startActivity(intent);
    }

    public void ke_abnormal(View view) {
        Intent intent = new Intent(this, ActivityResult.class);
        intent.putExtra("nama_tempat", "abnormal");
        intent.putExtra("nama_makanan", nama_makanan.getText().toString());
        intent.putExtra("jumlah_porsi", jumlah_porsi.getText().toString());
        intent.putExtra("uang_osas",UangOsas);

        startActivity(intent);

    }
}
