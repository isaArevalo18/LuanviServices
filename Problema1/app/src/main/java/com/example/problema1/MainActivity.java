package com.example.problema1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {
    private EditText etnombre,etcontenido;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnombre=(EditText)findViewById(R.id.txt_nombre);
        etcontenido=(EditText)findViewById(R.id.txt_contenido);
    }
    public void Guardar(View view) throws IOException {
        String nombre = etnombre.getText().toString();
        String contenido = etcontenido.getText().toString();
        //Guarda de manera temporal la ruta de la tarjeta
        File tarjeta = Environment.getExternalStorageDirectory();// recuperamos la ruta
        //nos muestra donde se guarda el archivo
        Toast.makeText(this, tarjeta.getPath(),Toast.LENGTH_SHORT).show();
        //Ruta archivo
        File rutafile= new File(tarjeta.getPath(),nombre);
        //Crear
        OutputStreamWriter crearFile= new OutputStreamWriter(openFileOutput(nombre, Activity.MODE_PRIVATE));
       //Escribir el contenido
        crearFile.write(contenido);
        //limpiar
        crearFile.flush();
        //cerrar el archivo
        crearFile.close();
        Toast.makeText(this,"Guardado Correctamente", Toast.LENGTH_SHORT).show();
        etnombre.setText("");
        etcontenido.setText("");
    }
    public void  consultar(View view) throws IOException {
        //Variable para recuperar el nombre
        String nombre=etnombre.getText().toString();
        File tarjeta=Environment.getExternalStorageDirectory();
        File rutaFile= new File(tarjeta.getPath(),nombre);
        //leer el archivo
        InputStreamReader abrirfile= new InputStreamReader(openFileInput(nombre));
        BufferedReader leerFile=new BufferedReader(abrirfile);
        //Leer linea por linea el archivo
        String linea=leerFile.readLine();
            String completo="";
            while (linea!=null){
                completo = completo+linea + "\n";
                linea = leerFile.readLine();
            }
            leerFile.close();
            abrirfile.close();
            etcontenido.setText(completo);
    }
}
