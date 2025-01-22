package Aula4;

public class Conta {

    //Membros da Classe
    int numero;
    String nomeDoDono;
    float saldo;
    float limite;

    //Métodos
    void deposita(float quantia){
        saldo += quantia;
    }

    void saca(float quantia){
        float novoSaldo = saldo - quantia;
        saldo = novoSaldo;
    }



}
