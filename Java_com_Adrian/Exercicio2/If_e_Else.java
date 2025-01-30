package Exercicio2;

import java.util.Scanner;

public class If_e_Else {
    public static void main(String[] args) {

     int valor = 8;
     int valor2 = 7;

     if(valor == 8){
         System.out.println("Valor = 8");
     }

     if(valor2 == 9)
     {
         System.out.println("Valor2 = 9");
     }
     else
     {
         System.out.println("Valor2 != 9");
     }

        System.out.println(" ");

     Scanner input = new Scanner(System.in);
     double nota1, nota2, nota3, media;

     System.out.println("Digite o valor da nota1: ");
     nota1 = input.nextDouble();

     System.out.println("Digite o valor da nota2: ");
     nota2 = input.nextDouble();

     System.out.println("Digite o valor da nota3: ");
     nota3 = input.nextDouble();

     media = ((nota1 + nota2 + nota3)/3);
     System.out.println("Valor da media e: " + media);

     if(media >=7)
     {
         System.out.println("Aluno aprovado");
     }
     else
     {
         System.out.println("Aluno reprovado");
     }

    }
}
