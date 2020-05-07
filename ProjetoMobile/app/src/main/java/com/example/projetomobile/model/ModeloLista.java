package com.example.projetomobile.model;

public class ModeloLista {
    private String descricao;
    private int foto;

    public ModeloLista(String descricao, int foto) {
        this.descricao = descricao;
        this.foto = foto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
