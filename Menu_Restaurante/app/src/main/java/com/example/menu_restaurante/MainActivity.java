package com.example.menu_restaurante;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.Profile;
import com.facebook.login.LoginManager;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    //////////////////GOOGLE//////////////
    GoogleSignInClient mGoogleSignInClient;
    private CallbackManager callbackManager;


    //////////////////CORREO//////////////
    private FirebaseAuth mAuth;
    private String Sesion_tipo = "null";

    public TextView correo, usuario;

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        View headerView = navigationView.getHeaderView(0);
        correo = headerView.findViewById(R.id.txt_correo);
        usuario = headerView.findViewById(R.id.txt_usuario);

        //////////////////GOOGLE//////////////
        mAuth = FirebaseAuth.getInstance();
        Sesion_tipo = getIntent().getStringExtra("sesion");
        Toast.makeText(this,"metodo : "+Sesion_tipo,Toast.LENGTH_SHORT).show();

        //////////////////CORREO//////////////
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();
        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);

        cargar_datos_usuario();

    }

    public void cerarSecion(View v)
    {
        try {
            if (Sesion_tipo.equals("gmail"))
            {
                //Toast.makeText(this,"gmail",Toast.LENGTH_SHORT).show();
                mGoogleSignInClient.signOut().addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        FirebaseAuth.getInstance().signOut();
                        Intent intent = new Intent(MainActivity.this,LoginMain.class);
                        startActivity(intent);
                    }
                });
            }
            if (Sesion_tipo.equals("correo"))
            {
                //Toast.makeText(this,"correo",Toast.LENGTH_SHORT).show();
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(MainActivity.this,LoginMain.class);
                startActivity(intent);
            }

        }catch (Exception e)
        {
            Toast.makeText(MainActivity.this,"Error en el Cierre de Sesion",Toast.LENGTH_SHORT).show();
        }
    }

    public void cargar_datos_usuario ()
    {
        // este metodo va en el oncreate
        GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(this);
        if (acct != null) {
            String personName = acct.getDisplayName();
            String personEmail = acct.getEmail();

            //aqui seteas los datos a los campos que te pedi

            usuario.setText(personName);
            correo.setText(personEmail);
        }
        if (mAuth.getCurrentUser() != null )
        {
            String name_message = "Bienvenido";
            String email_user = mAuth.getCurrentUser().getEmail().toString();
            String name = mAuth.getCurrentUser().getDisplayName(); // prueba este si no te sale el nombre carga solo el name_message :v

            //aqui seteas los datos a los campos que te pedi

            if (name.isEmpty()){
                usuario.setText(name_message);
            }else{
                usuario.setText(name);
            }
            correo.setText(email_user);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}