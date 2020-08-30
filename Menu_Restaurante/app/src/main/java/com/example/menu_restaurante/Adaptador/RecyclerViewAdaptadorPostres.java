package com.example.menu_restaurante.Adaptador;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.menu_restaurante.Modelo.Postres;
import com.example.menu_restaurante.R;

import java.util.List;

public class RecyclerViewAdaptadorPostres extends RecyclerView.Adapter<RecyclerViewAdaptadorPostres.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPostre;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //R.id.cambiar
            imgPostre=(ImageView)itemView.findViewById(R.id.img_item);
        }
    }

    public List<Postres> listadopostres;

    public RecyclerViewAdaptadorPostres(List<Postres> listadopostres) {
        this.listadopostres = listadopostres;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Revisar el modelo item
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview,parent,false);
       ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imgPostre.setImageResource(listadopostres.get(position).getImgPostre());
    }

    @Override
    public int getItemCount() {
        return listadopostres.size();
    }
}
