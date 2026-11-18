package org.example;

import java.util.HashMap;
import java.util.Map;

public class BeneficioFactory {

    private static Map<String, Beneficio> beneficios = new HashMap<>();

    public static Beneficio getBeneficio(String nome, String categoria) {
        String chave = nome + "-" + categoria;

        Beneficio beneficio = beneficios.get(chave);

        if (beneficio == null) {
            beneficio = new Beneficio(nome, categoria);
            beneficios.put(chave, beneficio);
        }

        return beneficio;
    }

    public static int getTotalBeneficios() {
        return beneficios.size();
    }
}