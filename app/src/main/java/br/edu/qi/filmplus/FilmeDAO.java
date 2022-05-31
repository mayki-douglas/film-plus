package br.edu.qi.filmplus;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class FilmeDAO {

    private SQLiteDatabase bd_film_plus;
    private ConexaoBD conexaoBD;

    public FilmeDAO(Context context){
        this.conexaoBD = new ConexaoBD(context);
        this.bd_film_plus = conexaoBD.getWritableDatabase();
    }

    public ContentValues gerarValores(Filme objFilme){

        ContentValues values = new ContentValues();
        values.put("nome", objFilme.getNome());
        values.put("categoria", objFilme.getCategoria());
        values.put("ano", objFilme.getAno());
        values.put("sinopse", objFilme.getSinopse());

        return values;
    }

    public void cadastrarFilmeBD(Filme objFilme){
        this.bd_film_plus.insert("tb_filme", null, gerarValores(objFilme));
    }

    public void alterarFilmeBD(Filme objFilme){
        this.bd_film_plus.update("tb_filme", gerarValores(objFilme), "id = ?", new String[]{String.valueOf(objFilme.getId())});
    }

    public List<Filme> consultarFilmeBD(){
        List<Filme> encontrados = new ArrayList<>();
        String [] colunas = {"*"};

        Cursor cursor = bd_film_plus.query("tb_filme", colunas, null, null, null, null, null);
        while (cursor.moveToNext()){
            Filme objFilme = new Filme();
            objFilme.setId(cursor.getInt(0));
            objFilme.setNome(cursor.getString(1));
            objFilme.setCategoria(cursor.getString(2));
            objFilme.setAno(cursor.getInt(3));
            encontrados.add(objFilme);
        }
        return encontrados;
    }

    public void excluirFilmeBD(Filme objFilme){
        this.bd_film_plus.delete("tb_filme", "id = ?", new String[]{String.valueOf(objFilme.getId())});
    }
}
