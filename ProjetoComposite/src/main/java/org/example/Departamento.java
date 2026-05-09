package org.example;

import java.util.ArrayList;
import java.util.List;

public class Departamento extends MembroOrganizacao {

    private List<MembroOrganizacao> membros;

    public Departamento(String nome) {
        super(nome);
        this.membros = new ArrayList<MembroOrganizacao>();
    }

    public void addMembro(MembroOrganizacao membro) {
        this.membros.add(membro);
    }

    @Override
    public String getEstrutura() {
        String saida = "Departamento: " + this.getNome() + "\n";
        for (MembroOrganizacao membro : membros) {
            saida += membro.getEstrutura();
        }
        return saida;
    }

}
