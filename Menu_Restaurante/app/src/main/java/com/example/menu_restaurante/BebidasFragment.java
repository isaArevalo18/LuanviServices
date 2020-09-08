package com.example.menu_restaurante;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

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

        adaptadorBebidas.setOnClicKListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),DetalleProducto.class);
                intent.putExtra("imagen",obtenerbebidas().get(recyclerViewBebidas.getChildAdapterPosition(view)).getImgBebida());
                intent.putExtra("nombre",obtenerbebidas().get(recyclerViewBebidas.getChildAdapterPosition(view)).getNombre());
                intent.putExtra("precio",obtenerbebidas().get(recyclerViewBebidas.getChildAdapterPosition(view)).getPrecio());
                intent.putExtra("descripcion",obtenerbebidas().get(recyclerViewBebidas.getChildAdapterPosition(view)).getDescripcion());
                startActivity(intent);
            }
        });


        return root;
    }


    public List<Bebidas>obtenerbebidas(){
        List<Bebidas>bebidas=new ArrayList<>();
        bebidas.add(new Bebidas(R.drawable.cafe,"Cafe","2.50","Cafe cubano molido"));
        bebidas.add(new Bebidas(R.drawable.coctel_jordano,"Coctel Jordano","6.80","Con vocka,ron y jugo de naranja"));
        bebidas.add(new Bebidas(R.drawable.coctel,"Coltel Simple","5.00","Coctel de sandia con vocka"));
        bebidas.add(new Bebidas(R.drawable.jugo_natural,"Jugo Natural","2.00","Jugo natural de varias frutas"));
        bebidas.add(new Bebidas(R.drawable.vino_tinto,"Vino Tinto","2.50","Vino Italiano cosecha 2005"));
        return bebidas;
    }
}