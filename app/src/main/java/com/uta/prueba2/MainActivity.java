package com.uta.prueba2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTextUsuario, editTextContraseña;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextUsuario = findViewById(R.id.editTextUsuario);
        editTextContraseña = findViewById(R.id.editTextContraseña);

    }

    public  void Ingresar (View view) {

        String usuario = editTextUsuario.getText().toString();
        String contraseña = editTextContraseña.getText().toString();

        if (usuario.equals("admin") && contraseña.equals("admin")){
            Intent intent = new Intent(this,MainActivity_1.class);
            startActivity(intent);
        }


        String usuario2 = editTextUsuario.getText().toString();
        String contraseña2 = editTextContraseña.getText().toString();

        if (usuario2.equals("kevin") && contraseña2.equals("kevin")){
            Intent intent = new Intent(this,MainActivity_1.class);
            startActivity(intent);
        }


    }
}