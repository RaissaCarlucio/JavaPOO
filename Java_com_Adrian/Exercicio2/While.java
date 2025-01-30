package Exercicio2;

public class While {
    public static void main(String[] args) {

        int numero = 1;

        // Enquanto a afirmativa for verdadeira ele vai continuar rodando
        while(numero <=5)
        {
            System.out.println(numero);
            numero++;
        }

        // Só verifica no final, ele deixa vc rodar pelo menos 1x antes de verificar
        do {
            System.out.println(numero);
            numero++;
        }while(numero <=5);

    }
}
