package com.example.layoutprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProcuraArtistasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_procura_artistas);

        Button buttonPesquisarArtista01 = (Button) findViewById(R.id.buttonPesquisarArtista01);
        Button buttonPesquisarArtista02 = (Button) findViewById(R.id.buttonPesquisarArtista02);

        buttonPesquisarArtista01.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ProcuraArtistasActivity.this, PerfilUsuarioActivity.class);
                startActivity(intent);
            }
        });

        buttonPesquisarArtista02.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ProcuraArtistasActivity.this, PerfilUsuarioActivity.class);
                startActivity(intent);
            }
        });
    }
}
