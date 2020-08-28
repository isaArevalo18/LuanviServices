package com.example.prueba_menu;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewBebidasAdapter extends RecyclerView.Adapter<RecyclerViewBebidasAdapter.ViewHolder> {


    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView fotobebida;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            fotobebida=(ImageView) itemView.findViewById(R.id.coctel_1);
        }
    }

    public List<ModeloBebidas>listabebidas;

    public RecyclerViewBebidasAdapter(List<ModeloBebidas> listabebidas) {
        this.listabebidas = listabebidas;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bebidas,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
          holder.fotobebida.setImageResource(listabebidas.get(position).getImgBebida());
    }

    @Override
    public int getItemCount() {
        return listabebidas.size();
    }
}
