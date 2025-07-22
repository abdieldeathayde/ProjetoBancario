package org.example;

public class Conta {
    String nomeTitular;
    private double saldo;

    void sacar(double valor) {
        this.saldo = this.saldo - valor ;
    }

    double getSaldo() {
        return this.saldo;
    }

    void setSaldo(double valor){
        this.saldo = valor;
    }

    void depositar (double valor) {}


    void transferir (double valor) {

    }




}
