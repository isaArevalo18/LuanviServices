package com.example.menu_restaurante.Adaptador;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.menu_restaurante.Modelo.Platillos;
import com.example.menu_restaurante.R;

import java.util.List;

public class RecyclerViewAdaptadorPlatillos extends RecyclerView.Adapter<RecyclerViewAdaptadorPlatillos.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPlatillo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //R.id.cambiar
            imgPlatillo=(ImageView)itemView.findViewById(R.id.img_item);
        }
    }

    public List<Platillos> listadoplatillos;

    public RecyclerViewAdaptadorPlatillos(List<Platillos> listadoplatillos) {
        this.listadoplatillos = listadoplatillos;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview,parent,false);
       ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imgPlatillo.setImageResource(listadoplatillos.get(position).getImgPlatillo());
    }

    @Override
    public int getItemCount() {
        return listadoplatillos.size();
    }
}
