package com.example.problema3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class VentasRealizadas extends AppCompatActivity {
    private ListView listVentas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_ventas_realizadas);
        listVentas=(ListView)findViewById(R.id.lv_ventas);

        ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,listarVentas());
        listVentas.setAdapter(adapter);
    }


    /* METODO PARA MOSTRAR Y OCULTAR MENU */
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.principal,menu);
        return true;
    }

    /*METODO QUE PERMITE CONTROLAR QUE HACE CADA OPCION DEL MENU*/
    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();
        if(id==R.id.item_registrar){
            Intent intent=new Intent(this,MainActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
    //Metodo para listar las Ventas realizadas
    public ArrayList<String> listarVentas(){
        //Creamos un array tipo string
        ArrayList<String> list_ventas=new ArrayList<>();
        //Sacamos las ventas realizando una consulta en la base de datos
        SQLiteDatabase db=obtenerBD("ventas",1);
        Cursor filas=db.rawQuery("SELECT * FROM ventas",null);
        // Mandamos a mostrar los datos en cada columna
        if (!filas.moveToFirst()) return list_ventas;
        do {
            Venta venta=new Venta();
            venta.setCodigo(filas.getString(2));
            venta.setFecha(filas.getString(0));
            venta.setVendedor(filas.getString(1));
            venta.setCantidad(filas.getInt(3));
            venta.setPrecioUnitario(filas.getDouble(4));
            venta.setIva(filas.getDouble(6));
            venta.setTotal(filas.getDouble(5));
            list_ventas.add(venta.toString());
        }while (filas.moveToNext());
        //Cerramos
        filas.close();
        //Retorna la lista de ventas realizadas
        return list_ventas;
    }

    public SQLiteDatabase obtenerBD(String bdname,int version){
        AdminSQLite adminSQ=new AdminSQLite(this,bdname,null, version);
        SQLiteDatabase  db=adminSQ.getWritableDatabase(); //Apertura en modo lectura y escritura
        return db;
    }

}