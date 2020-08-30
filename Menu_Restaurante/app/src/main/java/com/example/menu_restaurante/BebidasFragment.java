package com.example.menu_restaurante;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.menu_restaurante.Adaptador.RecyclerViewAdaptadorBebidas;
import com.example.menu_restaurante.Modelo.Bebidas;
import com.example.menu_restaurante.ui.home.HomeViewModel;

import java.util.ArrayList;
import java.util.List;

public class BebidasFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private RecyclerView recyclerViewBebidas;
    private RecyclerViewAdaptadorBebidas adaptadorBebidas;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_bebidas, container, false);
        recyclerViewBebidas=(RecyclerView)root.findViewById(R.id.recyclerbebidas);
        recyclerViewBebidas.setLayoutManager(new LinearLayoutManager(getActivity()));
        adaptadorBebidas=new RecyclerViewAdaptadorBebidas(obtenerbebidas());
        recyclerViewBebidas.setAdapter(adaptadorBebidas);
        return root;
    }

    public List<Bebidas>obtenerbebidas(){
        List<Bebidas>bebidas=new ArrayList<>();
        bebidas.add(new Bebidas(R.drawable.cafe));
        bebidas.add(new Bebidas(R.drawable.coctel_jordano));
        bebidas.add(new Bebidas(R.drawable.coctel));
        bebidas.add(new Bebidas(R.drawable.jugo_natural));
        bebidas.add(new Bebidas(R.drawable.vino_tinto));
        return bebidas;
    }
}