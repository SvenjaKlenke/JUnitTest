package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @Test
    void addieren_vergleichen() {
        //given
        int a = 5;
        int b = 8;
        int x = 13;
        //when
        int ergebnis = Main.addieren(a,b);
        //then
        assertEquals(x, ergebnis);
    }

    @Test
    void grosserWert_return_true() {
        //given
        int addi = 50;
        //when
        boolean wert = Main.grosserWert(addi);
        //then
        assertTrue(wert);
    }
}