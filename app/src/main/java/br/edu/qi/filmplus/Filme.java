package br.edu.qi.filmplus;

import java.io.Serializable;

public class Filme implements Serializable {

    private int id;
    private String nome;
    private String categoria;
    private int ano;
    private String sinopse;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + '\n' +
                "Categoria: " + categoria + '\n' +
                "Ano: "+ ano + "\n" +
                "Sinopse: "+sinopse;
    }
}
