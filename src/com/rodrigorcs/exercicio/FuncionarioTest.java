package com.rodrigorcs.exercicio;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Dante";
        funcionario.idade = 21;
        funcionario.salario = new double[] {1200, 1512, 500};

        funcionario.imprimirSalario();

        funcionario.media();
    }
}
