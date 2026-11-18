import org.example.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    @Test
    void deveRetornarFuncionarios() {
        Empresa empresa = new Empresa();

        empresa.concederBeneficio("Jose", "Vale-Refeição", "Alimentação");
        empresa.concederBeneficio("Maria", "Vale-Refeição", "Alimentação");
        empresa.concederBeneficio("Ana", "Plano de Saúde", "Saúde");
        empresa.concederBeneficio("Joao", "Vale-Transporte", "Transporte");

        List<String> saida = Arrays.asList(
                "Funcionario{nome='Jose', beneficio='Vale-Refeição', categoria='Alimentação'}",
                "Funcionario{nome='Maria', beneficio='Vale-Refeição', categoria='Alimentação'}",
                "Funcionario{nome='Ana', beneficio='Plano de Saúde', categoria='Saúde'}",
                "Funcionario{nome='Joao', beneficio='Vale-Transporte', categoria='Transporte'}"
        );

        assertEquals(saida, empresa.obterFuncionarios());
    }

    @Test
    void deveRetornarTotalBeneficios() {
        Empresa empresa = new Empresa();

        empresa.concederBeneficio("Jose", "Vale-Refeição", "Alimentação");
        empresa.concederBeneficio("Maria", "Vale-Refeição", "Alimentação");
        empresa.concederBeneficio("Ana", "Plano de Saúde", "Saúde");
        empresa.concederBeneficio("Joao", "Vale-Transporte", "Transporte");

        assertEquals(3, BeneficioFactory.getTotalBeneficios());
    }
}