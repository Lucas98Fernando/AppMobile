package com.example.layoutprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button buttonCriarEvento = (Button) findViewById(R.id.buttonCriarEvento);
        Button buttonProcurarEvento = (Button) findViewById(R.id.buttonProcurarEvento);
        Button buttonEditarPerfil = (Button) findViewById(R.id.buttonEditarPerfil);
        Button buttonProcurarArtista = (Button) findViewById(R.id.buttonProcurarArtista);

        buttonCriarEvento.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (v.getId() == R.id.buttonCriarEvento) {
                    Intent intent = new Intent(HomeActivity.this, CriarEventoActivity.class);
                    startActivity(intent);
                }
            }
        });


        buttonProcurarEvento.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, EventosActivity.class);
                startActivity(intent);
            }
        });

        buttonEditarPerfil.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, PerfilUsuarioActivity.class);
                startActivity(intent);
            }
        });

        buttonProcurarArtista.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ProcuraArtistasActivity.class);
                startActivity(intent);
            }
        });
    }
}
