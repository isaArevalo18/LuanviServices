package com.example.prueba_menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewPlatillosAdapter extends RecyclerView.Adapter<RecyclerViewPlatillosAdapter.ViewHolder> {


    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView fotoplatillo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            fotoplatillo=(ImageView) itemView.findViewById(R.id.camaron_1);
        }
    }

    public List<ModeloPlatillos>listaplatillo;

    public RecyclerViewPlatillosAdapter(List<ModeloPlatillos> listaplatillo) {
        this.listaplatillo = listaplatillo;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_platillos,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
          holder.fotoplatillo.setImageResource(listaplatillo.get(position).getImgPlatillo());
    }

    @Override
    public int getItemCount() {
        return listaplatillo.size();
    }
}
