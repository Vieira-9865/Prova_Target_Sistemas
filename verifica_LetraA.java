package src;

import java.util.Scanner;

public class verifica_LetraA {

    public static int contarLetrasA(String texto) {
        // Verifica se o texto é nulo ou vazio e lança uma exceção
        if (texto == null || texto.isEmpty()) {
            throw new IllegalArgumentException("A string não pode ser nula ou vazia.");
        }

        int contador = 0;


        for (char caractere : texto.toCharArray()) {
            // Se tiver a ou A
            if (caractere == 'a' || caractere == 'A') {
                contador++;  // Entra na contagem
            }
        }

        return contador;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string para verificar a quantidade de letras A: ");
        String input = scanner.nextLine();

        int count = contarLetrasA(input);
        System.out.println("A letra A aparece " + count + " vezes nesta string.");
    }
}
