package br.edu.qi.filmplus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroUsuarioActivity extends AppCompatActivity {

    private EditText editTextNome, editTextEmail, editTextTelefone, editTextSenha;
    private Button buttonCadastrarUsuario;
    private Usuario objUsuario;
    private UsuarioDAO objUsuarioDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_usuario);
        getSupportActionBar().hide();

        editTextNome = findViewById(R.id.editTextNome);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextTelefone = findViewById(R.id.editTextTelefone);
        editTextSenha = findViewById(R.id.editTextSenha);
        buttonCadastrarUsuario = findViewById(R.id.buttonCadastrarUsuario);
        objUsuarioDAO = new UsuarioDAO(this);

        buttonCadastrarUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Usuario objUsuario = new Usuario();
                objUsuario.setNome(editTextNome.getText().toString());
                objUsuario.setEmail(editTextEmail.getText().toString());
                objUsuario.setTelefone(Long.parseLong(editTextTelefone.getText().toString()));
                objUsuario.setSenha(Integer.parseInt(editTextSenha.getText().toString()));
                objUsuarioDAO.cadastrarUsuarioBD(objUsuario);
            }
        });
    }
}
