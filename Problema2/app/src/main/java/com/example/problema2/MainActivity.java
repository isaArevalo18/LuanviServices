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

        String [] lts_archivos=fileList();

        if(validarArchivo(lts_archivos,"notas.txt")){
            try{
                InputStreamReader arch=new InputStreamReader(openFileInput("notas.txt"));
                BufferedReader br=new BufferedReader(arch);
                String lineaTexto=br.readLine();
                String textoCompleto="";
                while (lineaTexto!=null){
                    textoCompleto=textoCompleto+lineaTexto+"\n";
                    lineaTexto=br.readLine();
                }
                br.close();
                arch.close();
                notas.setText(textoCompleto);
            }catch (Exception e){
                Toast.makeText(this,"Error"+e,Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void grabarDatos(View view){
        try {
            OutputStreamWriter arh=new OutputStreamWriter(openFileOutput("notas.txt",Activity.MODE_PRIVATE));
            arh.write(notas.getText().toString());
            arh.flush();
            arh.close();
            Toast.makeText(this,"Datos Grabados Correctamente",Toast.LENGTH_LONG).show();
        }catch (Exception e){
            Toast.makeText(this,"Error"+e,Toast.LENGTH_LONG).show();
        }
        finish();
    };

    public boolean validarArchivo(String archivos[],String buscar){
        for (int i = 0; i < archivos.length; i++) {
            resultado=(buscar.equals(archivos[i]))?true:false;
        }
        return resultado;
    }
}