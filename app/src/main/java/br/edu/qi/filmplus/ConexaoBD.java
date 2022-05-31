package br.edu.qi.filmplus;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ConexaoBD extends SQLiteOpenHelper {

    private static final String name = "bd_film_plus";
    private static final int version = 1;

    public ConexaoBD(@Nullable Context context) {
        super(context, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase bd_film_plus) {
        bd_film_plus.execSQL("create table tb_usuario(id integer not null primary key autoincrement," +
                "nome varchar(100), email varchar(100), telefone long(15), senha bigint(30))");
        bd_film_plus.execSQL("create table tb_filme(id integer not null primary key autoincrement," +
                "nome varchar(100), categoria varchar(50), ano bigint(4), sinopse varchar(200))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
