package Aula4.Exercicio3;

public class Zumbi{

    double vida;
    String nome;

    double mostraVida(){
        return this.vida;
    }

    void transfereVida(Zumbi zumbiAlvo, double quantia){
        vida -= quantia;
        zumbiAlvo.vida += quantia;
    }

}
