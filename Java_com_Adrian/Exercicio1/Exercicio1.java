package Java_com_Adrian.Exercicio1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Inicializa o Scanner

        System.out.print("Digite um número: ");
        int numero = teclado.nextInt(); // Lê um inteiro do teclado
        System.out.println("");

        System.out.println("Você digitou: " + numero);

    }
}
