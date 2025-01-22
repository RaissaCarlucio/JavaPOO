package Aula4.Exercicio1;

public class Main {
    public static void main(String[] args) {
        // z é um ponteiro para o objeto Zumbi
        Zumbi z = new Zumbi();

        z.alimentar(30);
        z.perderVida(40);
        z.alimentar(30);
    }
}
