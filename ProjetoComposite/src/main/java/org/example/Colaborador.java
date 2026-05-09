package org.example;

public class Colaborador extends MembroOrganizacao{

    private String cargo;

    public Colaborador(String nome, String cargo) {
        super(nome);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String getEstrutura() {
        return "Funcionário: " + this.getNome() + " - cargo: " + this.cargo + "\n";
    }

}
