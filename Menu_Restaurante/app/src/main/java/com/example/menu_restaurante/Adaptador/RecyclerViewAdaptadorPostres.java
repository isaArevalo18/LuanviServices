package com.example.menu_restaurante.Adaptador;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.menu_restaurante.Modelo.Postres;
import com.example.menu_restaurante.R;

import java.util.List;

public class RecyclerViewAdaptadorPostres extends RecyclerView.Adapter<RecyclerViewAdaptadorPostres.ViewHolder>
implements View.OnClickListener{

    private View.OnClickListener listener;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPostre;
        TextView tv_nombre_platillo;
        TextView tv_precio_paltillo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //R.id.cambiar
            imgPostre=(ImageView)itemView.findViewById(R.id.img_item);
            tv_nombre_platillo=(TextView)itemView.findViewById(R.id.tv_nombre);
            tv_precio_paltillo=(TextView)itemView.findViewById(R.id.tv_precio);
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
        view.setOnClickListener(this);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imgPostre.setImageResource(listadopostres.get(position).getImgPostre());
        holder.tv_nombre_platillo.setText(listadopostres.get(position).getNombre());
        String precio=String.valueOf(listadopostres.get(position).getPrecio());
        holder.tv_precio_paltillo.setText("$"+precio);
    }

    @Override
    public int getItemCount() {
        return listadopostres.size();
    }

    public void setOnClicKListener(View.OnClickListener listener){
        this.listener=listener;
    }

    @Override
    public void onClick(View view) {
        if (listener!=null){
            listener.onClick(view);
        }
    }
}
