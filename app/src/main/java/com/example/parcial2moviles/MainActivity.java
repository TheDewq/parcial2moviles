package com.example.parcial2moviles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void agregar(View view){
        Intent instancia = new Intent(this, agregarAmigo.class);
        startActivity(instancia);
    }
    public void about(View view){
        Intent instancia = new Intent(this, abau.class);
        startActivity(instancia);
    }
}