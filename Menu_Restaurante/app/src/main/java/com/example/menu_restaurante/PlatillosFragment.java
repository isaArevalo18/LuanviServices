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
import com.example.menu_restaurante.Adaptador.RecyclerViewAdaptadorPlatillos;
import com.example.menu_restaurante.Modelo.Bebidas;
import com.example.menu_restaurante.Modelo.Platillos;
import com.example.menu_restaurante.ui.home.HomeViewModel;

import java.util.ArrayList;
import java.util.List;

public class PlatillosFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private RecyclerView recyclerViewPlatillos;
    private RecyclerViewAdaptadorPlatillos adaptadorPlatillos;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_platillos, container, false);
        recyclerViewPlatillos=(RecyclerView)root.findViewById(R.id.recyclerplatillos);
        recyclerViewPlatillos.setLayoutManager(new LinearLayoutManager(getActivity()));
        adaptadorPlatillos=new RecyclerViewAdaptadorPlatillos(obtenerplatillos());
        recyclerViewPlatillos.setAdapter(adaptadorPlatillos);
        return root;
    }

    public List<Platillos> obtenerplatillos(){
        List<Platillos>platillos=new ArrayList<>();
        platillos.add(new Platillos(R.drawable.camarones));
        platillos.add(new Platillos(R.drawable.lomo_cerdo));
        platillos.add(new Platillos(R.drawable.sandwich));
        platillos.add(new Platillos(R.drawable.sushi));
        return platillos;
    }
}