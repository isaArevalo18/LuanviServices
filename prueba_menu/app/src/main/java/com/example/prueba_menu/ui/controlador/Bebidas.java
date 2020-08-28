package com.example.prueba_menu.ui.controlador;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.prueba_menu.ModeloBebidas;
import com.example.prueba_menu.R;
import com.example.prueba_menu.RecyclerViewBebidasAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Bebidas#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Bebidas extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private RecyclerView recyclerViewBebidas;
    private RecyclerViewBebidasAdapter recyclerViewBebidasAdapter;
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Bebidas() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Bebidas.
     */
    // TODO: Rename and change types and number of parameters
    public static Bebidas newInstance(String param1, String param2) {
        Bebidas fragment = new Bebidas();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_bebidas, container, false);
        recyclerViewBebidas=(RecyclerView)v.findViewById(R.id.recycler_bebidas);
        LinearLayoutManager llm=new LinearLayoutManager(getActivity());
        recyclerViewBebidas.setLayoutManager(llm);
        recyclerViewBebidasAdapter=new RecyclerViewBebidasAdapter(obtenerBebidas());
        recyclerViewBebidas.setAdapter(recyclerViewBebidasAdapter);
        return v;

    }

    public List<ModeloBebidas>obtenerBebidas(){
       List<ModeloBebidas>bebidas=new ArrayList<>();
        bebidas.add(new ModeloBebidas(R.drawable.jugo_natural));
       bebidas.add(new ModeloBebidas(R.drawable.coctel));
        bebidas.add(new ModeloBebidas(R.drawable.cupcakes_festival));

       return bebidas;
    }
}