package com.example.proyectogit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    TextView usuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Bundle extras = getIntent().getExtras();
        String emailUsuario = extras.getString("email"); // Se pasó el nombre de la variable del intent
        String nombreUsuario = extras.getString("nombre"); // Se pasó el nombre
        usuario = findViewById(R.id.tvUsuario);
        usuario.setText("Welcome "+ nombreUsuario + " " + emailUsuario);
    }
}