package com.example.pdm1_lista_planetas.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pdm1_lista_planetas.R;
import com.example.pdm1_lista_planetas.model.Planeta;

import java.util.List;

public class PlanetaAdapter extends BaseAdapter {
    private List<Planeta> items;
    private final Context context;

    public PlanetaAdapter(List<Planeta> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return items.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        v = LayoutInflater.from(context).inflate(R.layout.item_lista, null);

        Planeta planeta = items.get(position);

        if (planeta != null) {
            ((TextView) v.findViewById(R.id.tv_descricao)).setText(planeta.getDescricao());
            ((ImageView) v.findViewById(R.id.iv_imagem)).setImageResource(this.context.getResources().getIdentifier(planeta.getImagemNome(), "drawable", this.context.getPackageName()));
        }
        return v;
    }
}