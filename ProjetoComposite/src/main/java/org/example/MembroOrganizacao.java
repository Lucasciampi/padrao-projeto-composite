package org.example;

public abstract class MembroOrganizacao {

    private String nome;

    public MembroOrganizacao(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract String getEstrutura();

}
