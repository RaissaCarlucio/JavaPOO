package Exercicio2;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        System.out.println("Bem vindo ao menu!");
        System.out.println("Digite 1 para aparecer a frase 1");
        System.out.println("Digite 2 para aparecer a frase 2");
        System.out.println("Digite 3 para sair do menu");

        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Frase 1");
                break;
            case 2:
                System.out.println("Frase 2");
                break;
            case 3:
                System.out.println("Saindo do menu...");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
        }

        scanner.close();
    }
}