package com.example.menu_restaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleProducto extends AppCompatActivity {
    ImageView img_producto;
    TextView tv_nombre_producto;
    TextView tv_precio_producto;
    TextView tv_descripcion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_producto);
        img_producto=(ImageView)findViewById(R.id.img_fotoproducto);
        tv_nombre_producto = (TextView)findViewById(R.id.tv_nombreproducto);
        tv_precio_producto=(TextView)findViewById(R.id.tv_precioproducto);
        tv_descripcion=(TextView)findViewById(R.id.tv_descripcionproducto);

        //Cargamos los datos de detalles del producto
        img_producto.setImageResource(getIntent().getIntExtra("imagen",0));
        tv_nombre_producto.setText(getIntent().getStringExtra("nombre"));
        tv_precio_producto.setText("Precio: $"+getIntent().getStringExtra("precio"));
        tv_descripcion.setText("Detalle: "+getIntent().getStringExtra("descripcion"));
    }
}