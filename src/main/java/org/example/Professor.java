package org.example;

public class Professor extends Funcionario{
    private int horasDeAula;

    @Override
    public double getGastos() {
        return this.getSalario() + this.horasDeAula * 10;
    }

    public int getHorasDeAula() {
        return this.horasDeAula;
    }

    public void setHorasDeAula(int horasDeAula) {
        this.horasDeAula = horasDeAula;
    }

    public String getInfo() {
        String infoBasica = super.getInfo();
        String informacao = infoBasica + "horas de aula: " + this.horasDeAula;
        return informacao;
    }
}
