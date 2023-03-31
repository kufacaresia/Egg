package com.example.animasteam;


import static com.example.animasteam.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.animasteam.databinding.ActivityDetailedBinding;

public class DetailedActivity extends AppCompatActivity {

    ActivityDetailedBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailedBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = this.getIntent();
        if (intent != null){
            String name = intent.getStringExtra("name");
            String datos = intent.getStringExtra("datos");
            String tiempos = intent.getStringExtra("tiempos");
            String carreras = intent.getStringExtra("carreras");
            int image= intent.getIntExtra("image"drawable.florrueda, drawable.maurilima, drawable.coniekeroth, drawable.tinchocaresia, drawable.nazalapuyade);

            binding.detailName.setText(name);
            binding.detailDatos.setText(datos);
            binding.detailCarreras.setText(carreras);
            binding.detailTiempos.setText(tiempos);
            binding.detailImage.setImageResource(image);


        }
    }
}