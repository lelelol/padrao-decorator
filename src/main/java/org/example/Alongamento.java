package org.example;

public class Alongamento extends PlanoTreinoDecorator {

    public Alongamento(PlanoTreino planoTreino) {
        super(planoTreino);
    }

    public float getPercentualCargaHoraria() {
        return 5.0f;
    }

    public String getNomeEstrutura() {
        return "Alongamento";
    }
}
