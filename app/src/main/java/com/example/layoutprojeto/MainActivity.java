package com.example.layoutprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.editUser = findViewById(R.id.edit_user);
        this.mViewHolder.editPassword = findViewById(R.id.edit_password);
        this.mViewHolder.buttonLogin = findViewById(R.id.button_login);
        this.mViewHolder.buttonRegisterLogin = findViewById(R.id.button_register_login);

        this.mViewHolder.buttonLogin.setOnClickListener(this);
        this.mViewHolder.buttonRegisterLogin.setOnClickListener(this);
    }

    public void onClick(View v){
        if (v.getId() == R.id.button_login){
            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.button_register_login) {
            Intent intent = new Intent(this, CadastroActivity.class);
            startActivity(intent);
        }
    }

    private static class ViewHolder {
        EditText editUser;
        EditText editPassword;
        Button buttonLogin;
        Button buttonRegisterLogin;
    }
}