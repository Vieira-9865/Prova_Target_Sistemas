package src;

import java.util.Scanner;

public class questao_Fibonacci {
    
    public static boolean isFibonacci(int numero) {

        // Se for negativo
        if (numero < 0) {
            throw new IllegalArgumentException("O número deve ser não negativo.");
        }
        // Os números 0 e 1 são da sequência de Fibonacci
        if (numero == 0 || numero == 1) {
            return true;
        }

        int anterior = 0;
        int atual = 1;
        int proximo = anterior + atual;
    
        // Gera a sequência até que o próximo número seja maior ou igual ao número fornecido
        while (proximo < numero) {
            anterior = atual;
            atual = proximo;
            proximo = anterior + atual;
        }

        return proximo == numero;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        try {
            if (isFibonacci(numero)) {
                System.out.println("Este número " + numero + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println("Este número " + numero + " não pertence à sequência de Fibonacci.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();  // Fecha o scanner
        }
    }
}
