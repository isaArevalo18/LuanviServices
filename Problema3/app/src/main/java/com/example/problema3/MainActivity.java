package com.example.problema3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.tabs.TabItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText fecha,vendedor,codigo,cantidad, precio;
    Button limpiar, guardar;
    String fecha_venta,vendedor_venta,codigo_venta;
    int cantidad_venta=0;
    double precioU=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fecha=findViewById(R.id.txt_fecha);
        vendedor=findViewById(R.id.txt_vendedor);
        codigo=findViewById(R.id.txt_codigo);
        cantidad=findViewById(R.id.txt_cantidad);
        precio=findViewById(R.id.txt_precio);

    }

    /* METODO PARA MOSTRAR Y OCULTAR MENU */
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.principal,menu);
        return true;
    }

    /*METODO QUE PERMITE CONTROLAR QUE HACE CADA OPCION DEL MENU*/
    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();
        if(id==R.id.item_listar){
            Intent intent=new Intent(this,VentasRealizadas.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    public void registrarVenta(View view){
        //Validacion para que se llenen todos los campos de la venta
        if(fecha.getText().toString().equals("") || vendedor.getText().toString().equals("")
                || cantidad.getText().toString().equals("") || precio.getText().toString().equals("")){
            
            Toast.makeText(this,"LLene todos los campos,Por Favor",Toast.LENGTH_LONG).show();
        }else{
            //Si los datos estan completos se procede a enviar los datos a la base
            fecha_venta=fecha.getText().toString();
            vendedor_venta=vendedor.getText().toString();
            codigo_venta=codigo.getText().toString();
            cantidad_venta=Integer.parseInt(cantidad.getText().toString());
            precioU=Double.parseDouble(precio.getText().toString());

            SQLiteDatabase db=obtenerBD("ventas",1);
            ContentValues registro=new ContentValues();
            //Inserccion de datos
            registro.put("fecha",fecha_venta);
            registro.put("vendedor",vendedor_venta);
            registro.put("codigo",codigo_venta);
            registro.put("cantidad",cantidad_venta);
            registro.put("precio",precioU);
            registro.put("total",precioU*cantidad_venta);
            registro.put("iva",(precioU*cantidad_venta)*0.12);
            db.insert("ventas",null,registro);
            Toast.makeText(this,"Venta Registrada con Exito",Toast.LENGTH_LONG).show();
        }

    }

    public void limpiarCampos(View view){
        fecha.setText("");
        vendedor.setText("");
        codigo.setText("");
        cantidad.setText("");
        precio.setText("");
    }


    public SQLiteDatabase obtenerBD(String bdname,int version){
        AdminSQLite adminSQ=new AdminSQLite(this,bdname,null, version);
        SQLiteDatabase  db=adminSQ.getWritableDatabase(); //Apertura en modo lectura y escritura
        return db;
    }

}