package org.example;

public class Beneficio {

    private String nome;
    private String categoria;

    public Beneficio(String nome, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }
}