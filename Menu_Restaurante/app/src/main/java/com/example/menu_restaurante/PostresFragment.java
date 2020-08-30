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
import com.example.menu_restaurante.Adaptador.RecyclerViewAdaptadorPostres;
import com.example.menu_restaurante.Modelo.Bebidas;
import com.example.menu_restaurante.Modelo.Postres;
import com.example.menu_restaurante.ui.home.HomeViewModel;

import java.util.ArrayList;
import java.util.List;

public class PostresFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private RecyclerView recyclerViewPostres;
    private RecyclerViewAdaptadorPostres adaptadorPostres;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_postres, container, false);
        recyclerViewPostres=(RecyclerView)root.findViewById(R.id.recyclerpostres);
        recyclerViewPostres.setLayoutManager(new LinearLayoutManager(getActivity()));
        adaptadorPostres=new RecyclerViewAdaptadorPostres(obtenerpostres());
        recyclerViewPostres.setAdapter(adaptadorPostres);
        return root;
    }

    public List<Postres> obtenerpostres(){
        List<Postres>postres=new ArrayList<>();
        postres.add(new Postres(R.drawable.flan_celestial));
        postres.add(new Postres(R.drawable.cupcakes_festival));
        return postres;
    }
}