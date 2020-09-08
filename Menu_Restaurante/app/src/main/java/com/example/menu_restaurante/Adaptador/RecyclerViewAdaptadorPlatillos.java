package com.example.menu_restaurante.Adaptador;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.menu_restaurante.Modelo.Platillos;
import com.example.menu_restaurante.R;

import java.util.List;

public class RecyclerViewAdaptadorPlatillos extends RecyclerView.Adapter<RecyclerViewAdaptadorPlatillos.ViewHolder>
implements View.OnClickListener{

    private View.OnClickListener listener;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPlatillo;
        TextView tv_nombre_platillo;
        TextView tv_precio_paltillo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //R.id.cambiar
            imgPlatillo=(ImageView)itemView.findViewById(R.id.img_item);
            tv_nombre_platillo=(TextView)itemView.findViewById(R.id.tv_nombre);
            tv_precio_paltillo=(TextView)itemView.findViewById(R.id.tv_precio);
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
        view.setOnClickListener(this);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imgPlatillo.setImageResource(listadoplatillos.get(position).getImgPlatillo());
        holder.tv_nombre_platillo.setText(listadoplatillos.get(position).getNombre());
        String precio=String.valueOf(listadoplatillos.get(position).getPrecio());
        holder.tv_precio_paltillo.setText("$"+precio);
    }

    @Override
    public int getItemCount() {
        return listadoplatillos.size();
    }

    //Metodos adicionales para añadir el evento onclick en el recyclerview

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
