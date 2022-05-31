package br.edu.qi.filmplus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class CadastroFilmeActivity extends AppCompatActivity {

    private EditText editNomeFilme, editCategoriaFilme, editAnoFilme, editSinopseFilme;
    private Button buttonCadastrarFilme;
    private FilmeDAO objFilmeDAO;
    private Filme objFilme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_filme);
        getSupportActionBar().hide();

        editNomeFilme = findViewById(R.id.editNomeFilme);
        editCategoriaFilme = findViewById(R.id.editCategoriaFilme);
        editAnoFilme = findViewById(R.id.editAnoFilme);
        editSinopseFilme = findViewById(R.id.editSinopseFilme);
        buttonCadastrarFilme = findViewById(R.id.buttonCadastrarFilme);
        objFilmeDAO = new FilmeDAO(this);
    }
}