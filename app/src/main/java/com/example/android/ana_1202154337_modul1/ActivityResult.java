package com.example.android.ana_1202154337_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityResult extends AppCompatActivity {
    private TextView nama_tempat,menu,porsi,harga;

    int tagihan_eatbus = 50000;
    int tagihan_abnormal = 30000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();

        nama_tempat = findViewById(R.id.nama_tempat);
        menu = findViewById(R.id.menu);
        porsi = findViewById(R.id.porsi);
        harga = findViewById(R.id.harga);

        String tempat = intent.getStringExtra("nama_tempat");
        String makanan = intent.getStringExtra("nama_makanan");
        String jumlah = intent.getStringExtra("jumlah_porsi");
        int uang = intent.getIntExtra("uang_osas", 0);

        // parsing dari int ke string
        int int_jumlah = Integer.parseInt(jumlah);

        nama_tempat.setText(tempat);
        menu.setText(makanan);
        porsi.setText(jumlah);

        switch (tempat) {
            case "abnormal":
                harga.setText(String.valueOf(tagihan_abnormal*int_jumlah));
                if (tagihan_abnormal*int_jumlah > uang) {
                    Toast.makeText(this,
                            "Uang kamu ga cukup, silahkan cari tempat lain",Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(this,
                            "Uang kamu cukup, silahkan berkunjung",Toast.LENGTH_LONG).show();
                }
                break;
            case "eatbus":
                harga.setText(String.valueOf(tagihan_eatbus*int_jumlah));
                if (tagihan_eatbus*int_jumlah > uang) {
                    Toast.makeText(this,
                            "Uang kamu ga cukup, silahkan cari tempat lain",Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(this,
                            "Uang kamu cukup, silahkan berkunjung",Toast.LENGTH_LONG).show();
                }
                break;
        }
    }
}
