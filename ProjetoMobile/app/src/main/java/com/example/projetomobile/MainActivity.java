package com.example.projetomobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    TextInputEditText username, senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.txtUsername);
        senha = findViewById(R.id.txtSenha);
    }

    public void verificacao(View view){
        if(username.getText().toString().equals("jioanny") && senha.getText().toString().equals("123")){
            Intent tela2 = new Intent(MainActivity.this,Listagem.class);
            startActivity(tela2);
        }

        else{
            Toast.makeText(getApplicationContext(), "Senha inválida!", Toast.LENGTH_LONG).show();
        }
    }
}
