package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    @Test
    void deveRetornarOrganogramaEmpresa() {
        Departamento departamento1 = new Departamento("Tecnologia");

        Departamento departamento2 = new Departamento("Recursos Humanos");
        Colaborador colaborador21 = new Colaborador("Colaborador21", "Gestor de Pessoas");
        departamento2.addMembro(colaborador21);

        Departamento departamento3 = new Departamento("Financeiro");
        Colaborador colaborador31 = new Colaborador("Colaborador31", "Analista Financeiro");
        Colaborador colaborador32 = new Colaborador("Colaborador32", "Contador");
        departamento3.addMembro(colaborador31);
        departamento3.addMembro(colaborador32);

        Departamento organograma = new Departamento("Organograma da Empresa");
        organograma.addMembro(departamento1);
        organograma.addMembro(departamento2);
        organograma.addMembro(departamento3);

        Empresa empresa = new Empresa();
        empresa.setOrganograma(organograma);

        assertEquals("Departamento: Organograma da Empresa\n" +
                "Departamento: Tecnologia\n" +
                "Departamento: Recursos Humanos\n" +
                "Funcionário: Colaborador21 - cargo: Gestor de Pessoas\n" +
                "Departamento: Financeiro\n" +
                "Funcionário: Colaborador31 - cargo: Analista Financeiro\n" +
                "Funcionário: Colaborador32 - cargo: Contador\n", empresa.getOrganograma());

    }

    @Test
    void deveRetornarExecacaoEmpresaSemOrganograma() {
        try {
            Empresa empresa = new Empresa();
            empresa.getOrganograma();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Empresa sem organograma definido", e.getMessage());
        }
    }

}