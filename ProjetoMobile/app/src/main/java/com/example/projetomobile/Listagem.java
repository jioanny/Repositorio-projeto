package com.example.projetomobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.projetomobile.adapter.ListaAdapter;
import com.example.projetomobile.model.ModeloLista;

import java.util.ArrayList;
import java.util.List;

public class Listagem extends AppCompatActivity {
    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listagem);
        lista = findViewById(R.id.listaReceita);
        List <ModeloLista> lista1 = new ArrayList<ModeloLista>();
        lista1.add(new ModeloLista("Bolo de Chocolate", R.drawable.ic_launcher_background));
        lista1.add(new ModeloLista("Panquecas", R.drawable.ic_launcher_background));
        lista1.add(new ModeloLista("Brigadeiro", R.drawable.ic_launcher_background));
        lista1.add(new ModeloLista("Pavê de Chocolate", R.drawable.ic_launcher_background));
        lista1.add(new ModeloLista("Bolo de Cenoura", R.drawable.ic_launcher_background));
        ListaAdapter adapter = new ListaAdapter(lista1, this);
        lista.setAdapter(adapter);
    }
}
