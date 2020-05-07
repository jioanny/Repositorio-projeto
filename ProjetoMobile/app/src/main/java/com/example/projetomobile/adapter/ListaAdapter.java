package com.example.projetomobile.adapter;

import android.content.Context;
import android.icu.text.Transliterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.projetomobile.R;
import com.example.projetomobile.model.ModeloLista;

import java.util.List;

public class ListaAdapter extends BaseAdapter{
    List <ModeloLista> lista;
    Context context;

    public ListaAdapter(List<ModeloLista> lista, Context context) {
        this.lista = lista;
        this.context = context;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.modelo_de_lista,parent,false);
        TextView descricao = view.findViewById(R.id.txtPrimeiro);
        ImageView descricao1 = view.findViewById(R.id.imgPrimeiro);
        ModeloLista lista1 = lista.get(position);
        descricao.setText(lista1.getDescricao());
        descricao1.setImageResource(lista1.getFoto());
        return view;
    }
}
