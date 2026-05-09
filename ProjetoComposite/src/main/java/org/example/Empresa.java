package org.example;

public class Empresa {

    private MembroOrganizacao organograma;

    public void setOrganograma(MembroOrganizacao organograma) {
        this.organograma = organograma;
    }

    public String getOrganograma() {
        if (this.organograma == null) {
            throw new NullPointerException("Empresa sem organograma definido");
        }
        return this.organograma.getEstrutura();
    }
}
