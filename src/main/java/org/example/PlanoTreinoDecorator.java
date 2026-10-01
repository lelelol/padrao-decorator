package org.example;

public abstract class PlanoTreinoDecorator implements PlanoTreino {

    private PlanoTreino planoTreino;
    public String estrutura;

    public PlanoTreinoDecorator(PlanoTreino planoTreino) {
        this.planoTreino = planoTreino;
    }

    public PlanoTreino getPlanoTreino() {
        return planoTreino;
    }

    public void setPlanoTreino(PlanoTreino planoTreino) {
        this.planoTreino = planoTreino;
    }

    public abstract float getPercentualCargaHoraria();

    public float getCargaHoraria() {
        return this.planoTreino.getCargaHoraria() * (1 + (this.getPercentualCargaHoraria() / 100));
    }

    public abstract String getNomeEstrutura();

    public String getEstrutura() {
        return this.planoTreino.getEstrutura() + "/" + this.getNomeEstrutura();
    }

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }
}


