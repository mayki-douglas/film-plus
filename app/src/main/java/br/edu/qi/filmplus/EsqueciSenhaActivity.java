package br.edu.qi.filmplus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class EsqueciSenhaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esqueci_senha);
        getSupportActionBar().hide();
    }
}