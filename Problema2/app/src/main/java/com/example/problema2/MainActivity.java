package com.example.problema2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {
    private EditText notas;
    private boolean resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notas=(EditText)findViewById(R.id.txt_nota);
        // creamos un array para almacenar los datos
        String [] lts_archivos=fileList();
    // validamos que se encuentre el archivo
        if(validarArchivo(lts_archivos,"notas.txt")){
            try{
                //Creamos un flujo de caracteres
                InputStreamReader arch=new InputStreamReader(openFileInput("notas.txt"));
                //almacenará la entrada del archivo especificado
                BufferedReader br=new BufferedReader(arch);
                //Leemos linea por lina
                String lineaTexto=br.readLine();
                String textoCompleto="";
                //si es diferente de nullo entonces leemos el archivo
                while (lineaTexto!=null){
                    textoCompleto=textoCompleto+lineaTexto+"\n";
                    lineaTexto=br.readLine();
                }
                br.close();
                arch.close();
                //mandamos a mostrar lo que contiene el archivo
                notas.setText(textoCompleto);
            }catch (Exception e){
                Toast.makeText(this,"Error"+e,Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void grabarDatos(View view){
        try {
            //Ingresamos los datos dentro del archivo notas
            OutputStreamWriter arh=new OutputStreamWriter(openFileOutput("notas.txt",Activity.MODE_PRIVATE));
            //Nos permite escribir
            arh.write(notas.getText().toString());
            //limpiar
            arh.flush();
            //cerrar
            arh.close();
            //Mensaje emergente
            Toast.makeText(this,"Datos Grabados Correctamente",Toast.LENGTH_LONG).show();
        }catch (Exception e){
            Toast.makeText(this,"Error"+e,Toast.LENGTH_LONG).show();
        }
        
    };

    public boolean validarArchivo(String archivos[],String buscar){
        //validamos que el archivo se encuentre
        for (int i = 0; i < archivos.length; i++) {
            resultado=(buscar.equals(archivos[i]))?true:false;
        }
        return resultado;
    }
}