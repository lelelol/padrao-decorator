package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanoTreinoTest {

    @Test
    void deveRetornarCargaHorariaPlanoTreino() {
        PlanoTreino planoTreino = new PlanoTreinoBasico(1000.0f);

        assertEquals(1000.0f, planoTreino.getCargaHoraria());
    }

    @Test
    void deveRetornarCargaHorariaPlanoTreinoComCardio() {
        PlanoTreino planoTreino = new Cardio(new PlanoTreinoBasico(1000.0f));

        assertEquals(1100.0f, planoTreino.getCargaHoraria());
    }

    @Test
    void deveRetornarCargaHorariaPlanoTreinoComMusculacao() {
        PlanoTreino planoTreino = new Musculacao(new PlanoTreinoBasico(1000.0f));

        assertEquals(1200.0f, planoTreino.getCargaHoraria());
    }

    @Test
    void deveRetornarCargaHorariaPlanoTreinoComAlongamento() {
        PlanoTreino planoTreino = new Alongamento(new PlanoTreinoBasico(1000.0f));

        assertEquals(1050.0f, planoTreino.getCargaHoraria());
    }

    @Test
    void deveRetornarCargaHorariaPlanoTreinoComCardioMaisMusculacao() {
        PlanoTreino planoTreino = new Cardio(new Musculacao(new PlanoTreinoBasico(1000.0f)));

        assertEquals(1320.0f, planoTreino.getCargaHoraria());
    }

    @Test
    void deveRetornarCargaHorariaPlanoTreinoComCardioMaisAlongamento() {
        PlanoTreino planoTreino = new Cardio(new Alongamento(new PlanoTreinoBasico(1000.0f)));

        assertEquals(1155.0f, planoTreino.getCargaHoraria());
    }

    @Test
    void deveRetornarCargaHorariaPlanoTreinoComMusculacaoMaisAlongamento() {
        PlanoTreino planoTreino = new Musculacao(new Alongamento(new PlanoTreinoBasico(1000.0f)));

        assertEquals(1260.0f, planoTreino.getCargaHoraria());
    }

    @Test
    void deveRetornarCargaHorariaPlanoTreinoComCardioMaisMusculacaoMaisAlongamento() {
        PlanoTreino planoTreino = new Cardio(new Musculacao(new Alongamento(new PlanoTreinoBasico(1000.0f))));

        assertEquals(1386.0f, planoTreino.getCargaHoraria());
    }

    @Test
    void deveRetornarEstruturaPlanoTreino() {
        PlanoTreino planoTreino = new PlanoTreinoBasico();

        assertEquals("Básico", planoTreino.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPlanoTreinoComCardio() {
        PlanoTreino planoTreino = new Cardio(new PlanoTreinoBasico());

        assertEquals("Básico/Cardio", planoTreino.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPlanoTreinoComMusculacao() {
        PlanoTreino planoTreino = new Musculacao(new PlanoTreinoBasico());

        assertEquals("Básico/Musculação", planoTreino.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPlanoTreinoComAlongamento() {
        PlanoTreino planoTreino = new Alongamento(new PlanoTreinoBasico());

        assertEquals("Básico/Alongamento", planoTreino.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPlanoTreinoComCardioMaisMusculacao() {
        PlanoTreino planoTreino = new Cardio(new Musculacao (new PlanoTreinoBasico()));

        assertEquals("Básico/Musculação/Cardio", planoTreino.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPlanoTreinoComCardioMaisAlongamento() {
        PlanoTreino planoTreino = new Cardio(new Alongamento (new PlanoTreinoBasico()));

        assertEquals("Básico/Alongamento/Cardio", planoTreino.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPlanoTreinoComMusculacaoMaisAlongamento() {
        PlanoTreino planoTreino = new Musculacao(new Alongamento (new PlanoTreinoBasico()));

        assertEquals("Básico/Alongamento/Musculação", planoTreino.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPlanoTreinoComCardioMaisMusculacaoMaisAlongamento() {
        PlanoTreino planoTreino = new Cardio (new Musculacao(new Alongamento (new PlanoTreinoBasico())));

        assertEquals("Básico/Alongamento/Musculação/Cardio", planoTreino.getEstrutura());
    }

}