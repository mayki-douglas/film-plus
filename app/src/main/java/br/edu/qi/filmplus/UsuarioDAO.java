package br.edu.qi.filmplus;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class UsuarioDAO {

    private SQLiteDatabase bd_film_plus;
    private ConexaoBD conexaoBD;

    public UsuarioDAO(Context context){
        this.conexaoBD = new ConexaoBD(context);
        this.bd_film_plus = conexaoBD.getWritableDatabase();
    }

    public ContentValues gerarValores(Usuario objUsuario){

        ContentValues values = new ContentValues();
        values.put("nome", objUsuario.getNome());
        values.put("email", objUsuario.getEmail());
        values.put("telefone", objUsuario.getTelefone());
        values.put("senha", objUsuario.getSenha());

        return values;
    }

    public void cadastrarUsuarioBD(Usuario objUsuario){
        this.bd_film_plus.insert("tb_usuario", null, gerarValores(objUsuario));
    }


    public void excluirUsuarioBD(Usuario objUsuario){
        this.bd_film_plus.delete("tb_usuario", "id = ?", new String[]{String.valueOf(objUsuario.getId())});
    }
}
