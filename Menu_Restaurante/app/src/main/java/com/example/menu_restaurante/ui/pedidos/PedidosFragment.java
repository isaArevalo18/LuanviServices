package com.example.menu_restaurante.ui.pedidos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.menu_restaurante.Modelo.Carrito;
import com.example.menu_restaurante.R;
import com.example.menu_restaurante.utils.CarritoStatic;

public class PedidosFragment extends Fragment {

    private PedidosViewModel slideshowViewModel;
    private TextView tvt_item_carrito;
    private TextView tvt_pedido_total;
    private ListView list_carrito;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        slideshowViewModel =
                ViewModelProviders.of(this).get(PedidosViewModel.class);
        View root = inflater.inflate(R.layout.fragment_pedidos, container, false);
        final TextView textView = root.findViewById(R.id.tvt_texto);
        slideshowViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText("Carrito");
            }
        });

        tvt_item_carrito=(TextView)root.findViewById(R.id.tvt_texto);
        list_carrito=(ListView)root.findViewById(R.id.list_carrito);
        tvt_pedido_total=(TextView)root.findViewById(R.id.tvt_total);
        if (CarritoStatic.listpedido.size()>0){
            ArrayAdapter<Carrito> adapter=new ArrayAdapter<>(getActivity(),R.layout.item_carrito,CarritoStatic.listpedido);
            list_carrito.setAdapter(adapter);
            tvt_pedido_total.setText("Total: $"+GenerarTotal());

        }else{
            Toast.makeText(getActivity(),"No ha cargado ningun producto al carrito",Toast.LENGTH_SHORT).show();
        }
       

        return root;
    }
    
    public String GenerarTotal(){
      String total="";
      double valor=0;

        for (Carrito pedido: CarritoStatic.listpedido) {
            valor=valor+Double.parseDouble(pedido.getPrecio());
        }

        total=String.valueOf(valor);

        return  total;

    }
    

}