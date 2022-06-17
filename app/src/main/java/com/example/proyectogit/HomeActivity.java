package com.example.proyectogit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lista;
    List<String> versionesAndroid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //1 Se conecta nuestro listView (lista) al componente visual
        lista = findViewById(R.id.lvVersionesAndroid);

        //2 Cargar la lista de elementos
        versionesAndroid = new ArrayList<>();
        versionesAndroid.add("Version 5");
        versionesAndroid.add("Version 6");
        versionesAndroid.add("Version 7");
        versionesAndroid.add("Version 8");
        versionesAndroid.add("Version 9");
        versionesAndroid.add("Version 10");
        versionesAndroid.add("Version 11");
        versionesAndroid.add("...");

        //3 Adapter (Hace la lista a parte gráfica), se usó una predeterminada
        ArrayAdapter adaptadorDeVersiones = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,
                versionesAndroid
        );

        //4 Vincular listView con el adaptador
        lista.setAdapter(adaptadorDeVersiones);

        // 5 Gestión de evento click en la lista
        lista.setOnItemClickListener(this);
        }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
            String androidVersion = versionesAndroid.get(position);
            Log.i("App", "Versión click:" + androidVersion);

        }
}
