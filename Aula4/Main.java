package Aula4;

public class Main {
    public static void main(String[] args) {

        //Criando uma nova instancia da Conta!
        //E tribuindo a uma variavel do tipo Conta!
        Conta c = new Conta();
        c.nomeDoDono = "Joaquina";
        c.saldo = 1000;

        System.out.println("O dono da classe eh: " + c.nomeDoDono + " e o saldo eh: " + c.saldo);

        //Depositando R$ 100,00
        c.deposita(100);
        System.out.println(c.saldo);

        //Sacando R$ 50,00
        c.saca(50);
        System.out.println(c.saldo);

    }
}
