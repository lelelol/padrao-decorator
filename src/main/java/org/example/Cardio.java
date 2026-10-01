package org.example;

public class Cardio extends PlanoTreinoDecorator {

    public Cardio(PlanoTreino planoTreino) {
        super(planoTreino);
    }

    public float getPercentualCargaHoraria() {
        return 10.0f;
    }

    public String getNomeEstrutura() {
        return "Cardio";
    }
}
