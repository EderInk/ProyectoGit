package com.example.proyectogit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnLogin;
    EditText etNombre, etCorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //prueba git
        btnLogin = findViewById(R.id.buttonLogin);
        btnLogin.setOnClickListener(this);
        etNombre = findViewById(R.id.editTextNombre);
        etCorreo = findViewById(R.id.editTextCorreo);
    }


    @Override
    public void onClick(View view) {
        String nombre = etNombre.getText().toString();
        String correo = etCorreo.getText().toString();

        if(!nombre.isEmpty() && !correo.isEmpty()){
            Intent intentLogin = new Intent(this,HomeActivity.class);
            intentLogin.putExtra("email",correo);
            intentLogin.putExtra("nombre",nombre);
            startActivity(intentLogin);

        }

    }
}