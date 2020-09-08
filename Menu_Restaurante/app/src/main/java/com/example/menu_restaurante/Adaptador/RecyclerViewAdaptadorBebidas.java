package com.example.menu_restaurante.Adaptador;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.menu_restaurante.Modelo.Bebidas;
import com.example.menu_restaurante.R;

import java.util.List;

public class RecyclerViewAdaptadorBebidas extends RecyclerView.Adapter<RecyclerViewAdaptadorBebidas.ViewHolder>
implements View.OnClickListener {

    private View.OnClickListener listener;


    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imgBebida;
        TextView tv_nombre_platillo;
        TextView tv_precio_paltillo;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgBebida=(ImageView)itemView.findViewById(R.id.img_item);
            tv_nombre_platillo=(TextView)itemView.findViewById(R.id.tv_nombre);
            tv_precio_paltillo=(TextView)itemView.findViewById(R.id.tv_precio);
        }
    }

    public List<Bebidas> listadobebidas;

    public RecyclerViewAdaptadorBebidas(List<Bebidas> listadobebidas) {
        this.listadobebidas = listadobebidas;

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
        holder.imgBebida.setImageResource(listadobebidas.get(position).getImgBebida());
        holder.tv_nombre_platillo.setText(listadobebidas.get(position).getNombre());
        String precio=String.valueOf(listadobebidas.get(position).getPrecio());
        holder.tv_precio_paltillo.setText("$"+precio);
    }

    @Override
    public int getItemCount() {
        return listadobebidas.size();
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
