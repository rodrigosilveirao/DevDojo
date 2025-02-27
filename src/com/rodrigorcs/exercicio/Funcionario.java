package com.rodrigorcs.exercicio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

    public void imprimirSalario() {
        System.out.println(this.nome);
        System.out.println(this.idade + " anos.");
        if (salario != null) {
            return;
        }
            for (int i = 0; i < salario.length; i++) {
                System.out.println("Salário " + (i + 1) + ": " + salario[i]);
            }
    }

    public void media() {

        if (salario != null) { // verificando se tem string antes de exec o codigo
            return;
        }

        double soma = 0;
            for (int i = 0; i < salario.length; i++) {
                soma += salario[i];
            }
            double media = soma / salario.length;
            System.out.println(media);
    }
}


