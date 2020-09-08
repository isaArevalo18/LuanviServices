package com.example.menu_restaurante;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.Login;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

public class LoginMain extends AppCompatActivity {

    private EditText txt_email, txt_contraseña;
    private ProgressDialog progressDialog;
    private String State_Sesion = "null";

    /////////////////////////  FACEBOOK /////////////////////////
    private LoginButton loginButton;
    CallbackManager  callbackManager;
    private int estado_facebook = 0;
    ///////////////////////////////////////////////////////////


    /////////////////////////  CORREO /////////////////////////
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListerner;
    DatabaseReference database;
    ///////////////////////////////////////////////////////////


    /////////////////////////  GOOGLE /////////////////////////
    GoogleSignInClient  mGoogleSignInClient;
    private int RC_SIGN_IN  = 0;
    //private GoogleApiClient googleApiClient; // VARIABLE GOLBAL
    // public static final int SIGN_IN_CODE=777;
    ///////////////////////////////////////////////////////////
    GoogleApiClient googleApiClient;
    //////////////////////////////////////////////////////////

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_main);

        txt_contraseña = (EditText) findViewById(R.id.edit_text_contraseña);
        txt_email = (EditText) findViewById(R.id.edit_text_email);
        ///////////////////////////////////////////////////////////




        ///////////////////////////INICIAMOS AUTENTICACION CON FIREBASE ////////////////////////////////
        mAuth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance().getReference();
        progressDialog = new ProgressDialog(this);


        ////////////////////////////GOOGLE ///////////////////////////////
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build();
        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);

        mAuthListerner = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user != null)
                {
                }
            }
        };



        ///////////////////////////FACEBOOK //////////////////////

        callbackManager = CallbackManager.Factory.create();
        loginButton = (LoginButton) findViewById(R.id.login_button);
        loginButton.setReadPermissions("email");
        // Callback registration

        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {

            @Override
            public void onSuccess(LoginResult loginResult) {

                Toast.makeText(LoginMain.this,"listo",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onCancel() {
                Toast.makeText(LoginMain.this,"cancel",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onError(FacebookException exception) {
                Toast.makeText(LoginMain.this,"error",Toast.LENGTH_LONG).show();
            }

        });
    }


    @Override
    protected void onStart() {
        super.onStart();
        mAuth.addAuthStateListener(mAuthListerner);

        GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(LoginMain.this);

        if(mAuth.getCurrentUser() != null)
        {
            Intent intent = new Intent(LoginMain.this,MainActivity.class);
            State_Sesion="correo";
            //Toast.makeText(this,"metodo : " +State_Sesion ,Toast.LENGTH_SHORT).show();
            intent.putExtra("sesion",State_Sesion);
            startActivity(intent);
            finish();
        }
        if (account != null)
        {
            Intent intent = new Intent(LoginMain.this,MainActivity.class);
            State_Sesion="gmail";
            //Toast.makeText(this,"metodo : " +State_Sesion ,Toast.LENGTH_SHORT).show();
            intent.putExtra("sesion",State_Sesion);
            startActivity(intent);
        }
    }

    public void btn_google_sesion2(View v)
    {
        try {

            signIn();
        }
        catch (Exception e)
        {
            Toast.makeText(this,"Error Funcion btn_google sesion",Toast.LENGTH_SHORT).show();
        }
    }

    private void signIn() {
        Intent signInIntent = mGoogleSignInClient.getSignInIntent();
        startActivityForResult(signInIntent, RC_SIGN_IN);
        Toast.makeText(this," singIn",Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        Toast.makeText(this,"estado facebook : "+estado_facebook ,Toast.LENGTH_SHORT).show();
        super.onActivityResult(requestCode, resultCode, data);
        if (estado_facebook == 0 )
        {
            callbackManager.onActivityResult(requestCode, resultCode, data);//liena facebokk
        }
        if (requestCode == RC_SIGN_IN)
        {
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            handleSignInResult(task);
        }
        else if (data != null){

            callbackManager.onActivityResult(requestCode, resultCode, data);//liena facebokk
            // Toast.makeText(this,"Error onActivityResult1",Toast.LENGTH_SHORT).show();
        }
    }
    private void handleSignInResult(Task<GoogleSignInAccount> completedTask) {
        try {
            GoogleSignInAccount account = completedTask.getResult(ApiException.class);
            AuthCredential credential = GoogleAuthProvider.getCredential(account.getIdToken(),null);
            mAuth.signInWithCredential(credential).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    Intent intent = new Intent(LoginMain.this,MainActivity.class);
                    State_Sesion="gmail";
                    //Toast.makeText(this,"metodo : " +State_Sesion ,Toast.LENGTH_SHORT).show();
                    intent.putExtra("sesion",State_Sesion);
                    startActivity(intent);
                    finish();
                }
            });

        } catch (ApiException e) {
            Toast.makeText(this,"Error onActivityResult2"+e.getStatusCode(),Toast.LENGTH_LONG).show();


        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (mAuthListerner != null)
        {
            mAuth.removeAuthStateListener(mAuthListerner);
        }

    }

    /////////////////////////////////////////////INGRESO Y REGISTRO CON CORREO////////////////////////////////////////////////////////
    public void btn_Registrarse(View vista)
    {

        String usuario = txt_email.getText().toString();
        String  contraseña = txt_contraseña.getText().toString();
        if(!usuario.isEmpty() && !contraseña.isEmpty())
        {
            if(contraseña.length() >= 6)
            {
                progressDialog.setMessage("Registrando Usuario");
                progressDialog.show();
                metodoRegistrar(usuario,contraseña);
            }
            else
            {
                Toast.makeText(this, "Ingrese mas de 6 Caracteres",Toast.LENGTH_SHORT).show();
            }
        }
        else
        {
            Toast.makeText(this, "Llene todos los Campos",Toast.LENGTH_SHORT).show();
        }
    }

    public void metodoRegistrar(String email, String password)
    {
        ////en uso//

        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            progressDialog.dismiss();
                            Intent intent = new Intent(LoginMain.this,MainActivity.class);
                            State_Sesion="correo";
                            //Toast.makeText(MainActivity.this,"metodo : " +State_Sesion ,Toast.LENGTH_SHORT).show();
                            intent.putExtra("sesion",State_Sesion);
                            startActivity(intent);
                            finish();
                        } else {
                            // If sign in fails, display a message to the user.
                            Toast.makeText(LoginMain.this, "Ingrese Correo Valido ",Toast.LENGTH_SHORT).show();
                            progressDialog.dismiss();
                        }

                    }
                });
    }

    public void btn_iniciarSesion(View vista)
    {

        String usuario = txt_email.getText().toString();
        String  contraseña = txt_contraseña.getText().toString();
        if(!usuario.isEmpty() && !contraseña.isEmpty())
        {
            progressDialog.setMessage("Iniciando Sesion");
            progressDialog.show();
            inicioSecion(usuario,contraseña);
        }
        else
        {
            Toast.makeText(this, "Llene todos los Campos",Toast.LENGTH_SHORT).show();
        }
    }

    private void inicioSecion(String usuario, String contraseña)
    {
        mAuth.signInWithEmailAndPassword(usuario , contraseña).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    progressDialog.dismiss();

                    Intent intent = new Intent(LoginMain.this,MainActivity.class);
                    State_Sesion="correo";
                    //Toast.makeText(MainActivity.this,"metodo : " +State_Sesion ,Toast.LENGTH_SHORT).show();
                    intent.putExtra("sesion",State_Sesion);
                    startActivity(intent);
                    finish();

                } else {
                    progressDialog.dismiss();
                    Toast.makeText(LoginMain.this, "Usuario no Encontrado",Toast.LENGTH_LONG).show();
                }
            }
        });
    }


}