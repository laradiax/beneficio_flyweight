package org.example;

public class Funcionario {

    private String nome;
    private Beneficio beneficio;

    public Funcionario(String nome, Beneficio beneficio) {
        this.nome = nome;
        this.beneficio = beneficio;
    }

    public String obterFuncionario() {
        return "Funcionario{" +
                "nome='" + this.nome + '\'' +
                ", beneficio='" + beneficio.getNome() + '\'' +
                ", categoria='" + beneficio.getCategoria() + '\'' +
                '}';
    }
}