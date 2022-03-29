package com.example.popupmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityLihatData extends AppCompatActivity {

    TextView tvnama, tvnomor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        tvnama = findViewById(R.id.tvNamaKontak);
        tvnomor = findViewById(R.id.tvNomorTelp);

        Bundle bundle = getIntent().getExtras();

        String nama = bundle.getString("a");

        switch (nama)
        {
            case "Jongin":
                tvnama.setText("Jongin");
                tvnomor.setText("080914011994");
                break;
            case "Junmyeon":
                tvnama.setText("Junmyeon");
                tvnomor.setText("080922051991");
                break;
            case "Erina":
                tvnama.setText("Eri");
                tvnomor.setText("080905082014");
                break;
            case "Minseok":
                tvnama.setText("Minseok");
                tvnomor.setText("080926031990");
                break;
            case "Kyung":
                tvnama.setText("Kyung");
                tvnomor.setText("080912011993");
                break;
            case "Pcy":
                tvnama.setText("PCY");
                tvnomor.setText("080927111992");
                break;
            case "Yixing":
                tvnama.setText("Yixing");
                tvnomor.setText("080907101991");
                break;
            case "Osh":
                tvnama.setText("OSH");
                tvnomor.setText("080912041994");
                break;
            case "Jongdae":
                tvnama.setText("Jongdae");
                tvnomor.setText("080921091992");
                break;
            case "Baek":
                tvnama.setText("BBH");
                tvnomor.setText("080906051992");
        }
    }
}