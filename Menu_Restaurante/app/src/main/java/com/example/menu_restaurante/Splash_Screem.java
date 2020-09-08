package com.example.menu_restaurante;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class Splash_Screem extends AppCompatActivity {
    private Window ventana;

    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash__screem);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash_Screem.this , LoginMain.class);
                startActivity(intent);
                finish();
            }
        },3000);
    }
}