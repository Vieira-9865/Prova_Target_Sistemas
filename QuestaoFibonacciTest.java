package src;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuestaoFibonacciTest {

    @Test
    public void testFibonacci() {
        // Testa números que pertencem à sequência de Fibonacci
        assertTrue(questao_Fibonacci.isFibonacci(0));
        assertTrue(questao_Fibonacci.isFibonacci(1));
        assertTrue(questao_Fibonacci.isFibonacci(2));
        assertTrue(questao_Fibonacci.isFibonacci(3));
        assertTrue(questao_Fibonacci.isFibonacci(5));
        assertTrue(questao_Fibonacci.isFibonacci(8));
        assertTrue(questao_Fibonacci.isFibonacci(13));
    }

    @Test
    public void testNaoFibonacci() {
        // Testa números que não pertencem à sequência de Fibonacci
        assertFalse(questao_Fibonacci.isFibonacci(4));
        assertFalse(questao_Fibonacci.isFibonacci(6));
        assertFalse(questao_Fibonacci.isFibonacci(7));
        assertFalse(questao_Fibonacci.isFibonacci(9));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNumeroNegativo() {
        // Testa exceção para número negativo
        questao_Fibonacci.isFibonacci(-1);
    }
}
