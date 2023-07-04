package com.agenda;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class HorarioTest {

    @Test
    public void dadoMesmaHoraeMinuto_OHorarioDeveSerIgual() {

        int hora = 11;
        int minuto = 35;

        Horario horario1 = new Horario(hora, minuto);
        Horario horario2 = new Horario(hora, minuto);

        assertTrue(horario1.equals(horario2));
    }

    @Test
    public void dadoObjetoDiferente_OHorarioNaoDeveSerIgual() {

        Horario horario = new Horario(11, 35);

        assertFalse(horario.equals(new Object()));
    }

    @Test
    public void dadoMesmaHoraeMinutoDiferente_OHorarioNaoDeveSerIgual() {

        int hora = 11;

        Horario horario1 = new Horario(hora, 35);
        Horario horario2 = new Horario(hora, 33);

        assertFalse(horario1.equals(horario2));
    }

    @Test
    public void dadoHoraDiferenteeMinutoIgual_OHorarioNaoDeveSerIgual() {

        int minuto = 35;

        Horario horario1 = new Horario(11, minuto);
        Horario horario2 = new Horario(12, minuto);

        assertFalse(horario1.equals(horario2));
    }
}
