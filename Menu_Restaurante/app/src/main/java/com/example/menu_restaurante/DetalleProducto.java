package com.example.menu_restaurante;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.menu_restaurante.Modelo.Carrito;
import com.example.menu_restaurante.ui.pedidos.PedidosFragment;
import com.example.menu_restaurante.utils.CarritoStatic;

public class DetalleProducto extends AppCompatActivity {
    ImageView img_producto;
    TextView tv_nombre_producto;
    TextView tv_precio_producto;
    TextView tv_descripcion;
    Button btn_carrito;
    private String nombre;
    private String precio;
   FragmentTransaction fragmentTransaction;
   Fragment fragmentpedidos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_producto);
        img_producto = (ImageView) findViewById(R.id.img_fotoproducto);
        tv_nombre_producto = (TextView) findViewById(R.id.tv_nombreproducto);
        tv_precio_producto = (TextView) findViewById(R.id.tv_precioproducto);
        tv_descripcion = (TextView) findViewById(R.id.tv_descripcionproducto);
        btn_carrito = (Button) findViewById(R.id.btn_agregar_carrito);
        //Cargamos los datos de detalles del producto
        img_producto.setImageResource(getIntent().getIntExtra("imagen", 0));
        tv_nombre_producto.setText(getIntent().getStringExtra("nombre"));
        tv_precio_producto.setText("Precio: $" + getIntent().getStringExtra("precio"));
        tv_descripcion.setText("Detalle: " + getIntent().getStringExtra("descripcion"));
        nombre=getIntent().getStringExtra("nombre");
        precio=getIntent().getStringExtra("precio");


    }

    public void AñadirCarrito(View view){
      CarritoStatic.listpedido.add(new Carrito(nombre,precio));
      Toast.makeText(this,"Producto Añadido al Carrito con Exito",Toast.LENGTH_SHORT).show();
      finish();
    }
}