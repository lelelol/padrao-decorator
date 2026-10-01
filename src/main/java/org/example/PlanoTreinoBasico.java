package org.example;

public class PlanoTreinoBasico implements PlanoTreino {

    public float cargaHoraria;

    public PlanoTreinoBasico() {
    }

    public PlanoTreinoBasico(float cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public float getCargaHoraria() {
        return cargaHoraria;
    }

    public String getEstrutura() {
        return "Básico";
    }

}
