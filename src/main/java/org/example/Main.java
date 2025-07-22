package org.example;

public class Main {
    public static void main(String[] args) {
//        Carro unoDeFirma = new Carro();
//        unoDeFirma.cor = "branco";
//        unoDeFirma.qtdPortas = 2;
//
//        unoDeFirma.acelerar();
//
//        unoDeFirma.frear();
//
//        Carro sandero = new Carro();
//        sandero.cor = "prata";
//        sandero.qtdPortas = 4;

//        Conta conta1 = new Conta();
//
//        conta1.nomeTitular = "João";
//        conta1.saldo = 100.00;
//
//        System.out.println("O cliente " + conta1.nomeTitular + " possui " + conta1.saldo + " de saldo na sua conta.");
//
//        conta1.sacar(50);
//
//        System.out.println("O cliente " + conta1.nomeTitular + " possui agora " + conta1.getSaldo() + " de saldo na sua conta");
//        ContaCorrente cc = new ContaCorrente();
//        ContaPoupanca cp = new ContaPoupanca();
//
//        cc.nomeTitular = "João";
//        cc.setSaldo(50);
//
//        cc.setLimite(100);
//
//        System.out.println(cc.getSaldo());
//        System.out.println(cc.getLimite());
////        System.out.println(cc.getSaldoComLimite());
//
//        cp.nomeTitular = "Maria";
//        cp.setSaldo(75);
//        System.out.println(cp.getSaldo());

//        ContaCorrente cc = new ContaCorrente();
//        cc.nomeTitular = "Abdiel";
//        cc.setSaldo(100);
//        cc.setLimite(20);
//
//        System.out.println(cc.getSaldo());
//
//        Conta conta = cc;
//
//        conta.sacar(10);
//
//        System.out.println(cc.getSaldo());
//        System.out.println(conta.getSaldo());



        GeradorRelatorio relatorio = new GeradorRelatorio();

        Funcionario f= new Funcionario();
        f.setNome("Abdiel");
        f.setSalario(100);

        relatorio.adiciona(f);

        Professor prof = new Professor();

        prof.setNome("Rodrigo");
        prof.setSalario(200);

        relatorio.adiciona(prof);


       // cp.setLimite();

    }
}