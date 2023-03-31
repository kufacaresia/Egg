package com.example.animasteam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }

    public void iralaSextaActivity(View view) {
        Intent myIntent = new Intent(this, MainActivity6.class);
        startActivity(myIntent);
    }

    public void iralaCuartaActivity(View view) {
        Intent myIntent = new Intent(this, MainActivity4.class);
        startActivity(myIntent);

    }

    public void iralaQuintaActivity(View view) {
        Intent myIntent = new Intent(this, MainActivity5.class);
        startActivity(myIntent);
    }
}
