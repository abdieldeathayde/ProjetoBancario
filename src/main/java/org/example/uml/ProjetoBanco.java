package org.example.uml;

public class ProjetoBanco {

    public static void main(String[] args) {
        Conta c1 = new ContaPoupanca();
        Conta c2 = new ContaPagamentos();

        c1.nomeTitular = "Abdiel";
        c1.numConta = 1;

        c2.nomeTitular = "João";
        c2.numConta = 2;

        c1.depositar(50);
        c2.depositar(50);

        System.out.println("Saldo c1: " + c1.getSaldo());
        System.out.println("Saldo c2: " + c2.getSaldo());

        c1.sacar(10);
        c2.sacar(10);

        System.out.println("Saldo c1 após o saque: " + c1.getSaldo());
        System.out.println("Saldo c2 após o saque: " + c2.getSaldo());


//        ContaPagamentos c3 = new ContaPagamentos();
//        c3.


//        System.out.println(c1.nomeTitular);
//        System.out.println(c1.getSaldo());

//        c1.depositar(50);
//
//
//        System.out.println("Saldo após depósito: " + c1.getSaldo());
//
//        c1.sacar(20);
//
//        System.out.println("Saldo após o saque: " + c1.getSaldo());



//        if (c1.transferir(c2, 40) == true) {
//            System.out.println("Tranferência realizada com sucesso");
//        } else {
//            System.out.println("Transferência não realizada = sem saldo");
//        }
//
//        System.out.println("Saldo de C1 após a transferência: " + c1.getSaldo());
//        System.out.println("Saldo de C2 após a transferência: " + c2.getSaldo());




//        c1.sacar(55);
//        System.out.println("Após o saque: " + c1.getSaldo());


    }
}

class Conta {

    public String nomeTitular;
    public int numConta;
    private double saldo;
    protected double taxaSaque = 1.0;


    public boolean depositar(double valor) {

        this.saldo += valor;
        return true;
    }

    public boolean sacar(double valor) {

        if (valor + this.taxaSaque <= this.saldo) {
            //permite o saque
            this.saldo = this.saldo - valor - taxaSaque;
            return true;
        } else {
            // não permite o saque
            return false;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public boolean transferir(Conta contaDestino, double valor) {

        if (this.sacar(valor) == true) {
            contaDestino.depositar(valor);
            return true;
        } else {
            return false;
        }
    }
}


class  ContaPagamentos extends Conta{

    public boolean sacar (double valor) {

        super.taxaSaque = 2.0;

        return super.sacar(valor);

    }
}

class ContaPoupanca extends Conta {

    public boolean sacar (double valor) {

        super.taxaSaque = 0.50;

        return super.sacar(valor);

    }
}