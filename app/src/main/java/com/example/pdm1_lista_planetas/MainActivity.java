package com.example.pdm1_lista_planetas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.pdm1_lista_planetas.adapters.PlanetaAdapter;
import com.example.pdm1_lista_planetas.model.Planeta;
import com.example.pdm1_lista_planetas.util.Util;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvPlanetas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvPlanetas = findViewById(R.id.lv_lista);

        popularListaDePlanetas();
    }

    private Context getActivity(){
        return this;
    }

    private void popularListaDePlanetas(){
        List<Planeta> planetaList = Planetas.popular();

        enviarPraTela(planetaList);
    }

    private void enviarPraTela(List<Planeta> planetaList){

        PlanetaAdapter planetaAdapter = new PlanetaAdapter(planetaList, getActivity());
        lvPlanetas.setAdapter(planetaAdapter);

        pegarClickNaLista();
    }

    private void pegarClickNaLista(){
        lvPlanetas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Planeta planeta = (Planeta) adapterView.getItemAtPosition(i);
                Util.mostrarUmaMensagem_AlertDialog(getActivity(), "Nome do planeta", planeta.getNome());
                Util.mostrarUmaMensagem_Toast(getActivity(), planeta.getNome());
            }
        });
    }
}