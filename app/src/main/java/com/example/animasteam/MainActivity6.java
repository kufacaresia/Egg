package com.example.animasteam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.animasteam.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity6 extends AppCompatActivity {

    ActivityMainBinding binding;
    ListAdapter listAdapter;
    ArrayList<ListDate> dataArrayList = new ArrayList<>();
    ListDate listDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        int[] imageList = {R.drawable.florrueda,R.drawable.maurilima,R.drawable.tinchocaresia,R.drawable.coniekeroth,R.drawable.nazalapuyade};
        int[] tiemposList = {R.string.tiemposFlorRueda,R.string.tiemposConiEkeroth, R.string.tiemposMauriLima, R.string.tiemposTinchoCaresia, R.string.tiemposNazarethLapuyade };
        int[] carrerasList = {R.string.carrerasConi,R.string.carrerasFlor, R.string.carrerasMauri, R.string.carrerasTincho,R.string.carrerasNaza};
        String [] nameList = {"Flor Rueda", "Mauri Lima","Naza Lapuyade", "Tincho Caresia", "Coni Ekeroth"};
        String [] datosList = {"Florencia Rueda \nFecha inicio: 01/11/2021\nNacimiento: 24 de marzo 1994\nContacto: 154-601231","Mauri Lima \nFecha inicio: 01/11/2021\nNacimiento: 24 de marzo 1994\nContacto: 154-601231","Coni Ekeroth \nFecha inicio: 01/11/2021\nNacimiento: 24 de marzo 1994\nContacto: 154-601231","Naza Lapuyade \nFecha inicio: 01/11/2021\nNacimiento: 24 de marzo 1994\nContacto: 154-601231","Tincho Caresia \nFecha inicio: 01/11/2021\nNacimiento: 24 de marzo 1994\nContacto: 154-601231",  };

        for (int i = 0; i < imageList.length; i++){
            listDate = new ListDate(nameList[i], tiemposList[i], imageList[i], carrerasList[i], datosList[i]);
            dataArrayList.add(listDate);
        }
        listAdapter = new ListAdapter(MainActivity6.this, dataArrayList);
        binding.listview.setAdapter(listAdapter);
        binding.listview.setClickable(true);

        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                Intent intent = new Intent(MainActivity6.this, DetailedActivity.class);
                intent.putExtra("name", nameList[i]);
                intent.putExtra("image", imageList[i]);
                intent.putExtra("carreras", carrerasList[i]);
                intent.putExtra("datos", datosList[i]);
                intent.putExtra("tiempos", tiemposList[i]);
                startActivity(intent);
            }
        });

   }
}