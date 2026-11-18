package org.example;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<Funcionario> funcionarios = new ArrayList<>();

    public void concederBeneficio(String nomeFuncionario,
                                  String nomeBeneficio,
                                  String categoria) {
        Beneficio beneficio =
                BeneficioFactory.getBeneficio(nomeBeneficio, categoria);

        Funcionario funcionario =
                new Funcionario(nomeFuncionario, beneficio);

        funcionarios.add(funcionario);
    }

    public List<String> obterFuncionarios() {
        List<String> saida = new ArrayList<>();

        for (Funcionario funcionario : this.funcionarios) {
            saida.add(funcionario.obterFuncionario());
        }

        return saida;
    }
}