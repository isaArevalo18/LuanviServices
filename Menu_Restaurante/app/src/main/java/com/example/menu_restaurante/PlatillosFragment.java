package com.example.menu_restaurante;

import android.content.Intent;
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

        adaptadorPlatillos.setOnClicKListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),DetalleProducto.class);
                intent.putExtra("imagen",obtenerplatillos().get(recyclerViewPlatillos.getChildAdapterPosition(view)).getImgPlatillo());
                intent.putExtra("nombre",obtenerplatillos().get(recyclerViewPlatillos.getChildAdapterPosition(view)).getNombre());
                intent.putExtra("precio",obtenerplatillos().get(recyclerViewPlatillos.getChildAdapterPosition(view)).getPrecio());
                intent.putExtra("descripcion",obtenerplatillos().get(recyclerViewPlatillos.getChildAdapterPosition(view)).getDescripcion());
                startActivity(intent);
            }
        });
        return root;
    }

    public List<Platillos> obtenerplatillos(){
        List<Platillos>platillos=new ArrayList<>();
        platillos.add(new Platillos(R.drawable.camarones,"Camarones en Salsa","12.50","Camarones acompañados de salsa picante con limon"));
        platillos.add(new Platillos(R.drawable.lomo_cerdo,"Lomo de Cerdo Apanado","11.00","Lomo de cerdo acompañado de papas y ensalada"));
        platillos.add(new Platillos(R.drawable.sandwich,"Sandwich de Pollo","3.00","Sandwich de Pollo con Mayonesa"));
        platillos.add(new Platillos(R.drawable.sushi,"Sushi","6.75","Sushi de mariscos exoticos contiene calamar,camarones,pulpo entre otros"));
        return platillos;
    }
}