package com.example.prueba_menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewPostresAdapter extends RecyclerView.Adapter<RecyclerViewPostresAdapter.ViewHolder> {


    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView fotopostre;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            fotopostre=(ImageView) itemView.findViewById(R.id.muffin_1);
        }
    }

    public List<ModeloPostres>listapostres;

    public RecyclerViewPostresAdapter(List<ModeloPostres> listapostres) {
        this.listapostres = listapostres;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_postres,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
          holder.fotopostre.setImageResource(listapostres.get(position).getImgPostre());
    }

    @Override
    public int getItemCount() {
        return listapostres.size();
    }
}
