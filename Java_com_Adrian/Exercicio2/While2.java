package Exercicio2;

import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int op;

        do {
            System.out.println("---------------");
            System.out.println("Menu principal");
            System.out.println("---------------");
            System.out.println("Selecione uma das opções abaixo:");
            System.out.println("1 - Aluno");
            System.out.println("2 - Professor");
            System.out.println("3 - Coordenador");
            System.out.println("0 - Sair");

            op = input.nextInt();

            if (op==0)
                break;

            switch(op)
            {
                case 1:
                    System.out.println("Você selecionou a opção aluno");
                    break;
                case 2:
                    System.out.println("Você selecionou a opção professor");
                    break;
                case 3:
                    System.out.println("Você selecionou a opção coordenador");
                    break;
                default:
                    System.out.println("Você selecionou uma opção invalida.");
            }

        }while(true);
        System.out.println("Saindo do menu...");
    }
}
