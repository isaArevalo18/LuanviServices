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
        adaptadorPostres.setOnClicKListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),DetalleProducto.class);
                intent.putExtra("imagen",obtenerpostres().get(recyclerViewPostres.getChildAdapterPosition(view)).getImgPostre());
                intent.putExtra("nombre",obtenerpostres().get(recyclerViewPostres.getChildAdapterPosition(view)).getNombre());
                intent.putExtra("precio",obtenerpostres().get(recyclerViewPostres.getChildAdapterPosition(view)).getPrecio());
                intent.putExtra("descripcion",obtenerpostres().get(recyclerViewPostres.getChildAdapterPosition(view)).getDescripcion());
                startActivity(intent);
            }
        });
        return root;
    }

    public List<Postres> obtenerpostres(){
        List<Postres>postres=new ArrayList<>();
        postres.add(new Postres(R.drawable.flan_celestial,"Flan Celestial ","1.50","Flan de Vainilla acompañado de chocolate derretido"));
        postres.add(new Postres(R.drawable.cupcakes_festival,"Cupcakes Festival","2.00","Cupcake de chocolate con grajeas y crema de coco"));
        postres.add(new Postres(R.drawable.muffin_amoroso,"Mufin Amoroso","3.50","Mufin acompañado de crema sabor a vainilla"));
        postres.add(new Postres(R.drawable.pastel_fresa,"Pastel de Fresa","5.50","Pastel de fresas silvestres con crema de vainilla y cereza"));
        postres.add(new Postres(R.drawable.postre_vainilla,"Postre de Vainilla","200","Postre de vainilla acompañado con fresa y crema de manzana"));
        postres.add(new Postres(R.drawable.rosca,"Rosca","2.50","Rosca de chocolate acompañada de una tasa de cafe"));
        return postres;
    }
}