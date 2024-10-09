package src;

import static org.junit.Assert.*;
import org.junit.Test;

public class VerificaLetraATest {

    @Test
    public void testContarLetrasA() {
        // Testa strings que contêm letras 'a' e 'A'
        assertEquals(3, verifica_LetraA.contarLetrasA("banana"));
        assertEquals(1, verifica_LetraA.contarLetrasA("maçã"));
        assertEquals(0, verifica_LetraA.contarLetrasA("teste"));
        assertEquals(6, verifica_LetraA.contarLetrasA("A casa é uma casa"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStringNula() {
        // Testa exceção para string nula

        verifica_LetraA.contarLetrasA(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStringVazia() {
        // Testa exceção para string vazia
        verifica_LetraA.contarLetrasA("");
    }
}
