package org.example;

import org.example.Conta;

public class ContaCorrente extends Conta {

    private double limite;

    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

//    public double getSaldoComLimite() {
//        return this.saldo + this.limite;
//    }

    @Override
    double getSaldo() {
        return this.limite + super.getSaldo();
    }
}
