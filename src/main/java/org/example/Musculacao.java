package org.example;

public class Musculacao extends PlanoTreinoDecorator {

    public Musculacao(PlanoTreino planoTreino) {
        super(planoTreino);
    }

    public float getPercentualCargaHoraria() {
        return 20.0f;
    }

    public String getNomeEstrutura() {
        return "Musculação";
    }
}
