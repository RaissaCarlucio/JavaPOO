package Aula4.Exercicio1;

public class Zumbi
{
    String nomeZumbi;
    double vida = 50;
    boolean alimentado = true;

    //Métodos
    void alimentar(double vida)
    {
        if(alimentado)
        {
            System.out.println("Já estou alimentado!");
        }
        else
        {
            //Está com fome. Irá se alimentar
            System.out.println("Sinto cheiro de sangue");
            this.vida += vida;
            System.out.println("Acabei de alimentar: " + vida + " pontos de vida");
            System.out.println("Agora estou com: " + this.vida + " pontos de vida" );
            if(this.vida >= 100)   //Adotando o critério de que se o zumbi estiver com
                alimentado = true; // mais de 100 de vida, ele estará alimentado
        }
    }

    void perderVida(double vida)
    {
        this.vida -= vida;
        if(this.vida < 100)
            alimentado = false;
    }
}



