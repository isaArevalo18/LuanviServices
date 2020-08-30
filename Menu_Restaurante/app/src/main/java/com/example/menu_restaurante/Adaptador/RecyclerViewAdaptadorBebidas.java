package com.example.menu_restaurante.Adaptador;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.menu_restaurante.Modelo.Bebidas;
import com.example.menu_restaurante.R;

import java.util.List;

public class RecyclerViewAdaptadorBebidas extends RecyclerView.Adapter<RecyclerViewAdaptadorBebidas.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imgBebida;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgBebida=(ImageView)itemView.findViewById(R.id.img_bebida);
        }
    }

    public List<Bebidas> listadobebidas;

    public RecyclerViewAdaptadorBebidas(List<Bebidas> listadobebidas) {
        this.listadobebidas = listadobebidas;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bebidas,parent,false);
       ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imgBebida.setImageResource(listadobebidas.get(position).getImgBebida());
    }

    @Override
    public int getItemCount() {
        return listadobebidas.size();
    }
}
