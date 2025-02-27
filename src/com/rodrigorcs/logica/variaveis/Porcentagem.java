package com.rodrigorcs.logica.variaveis;

import java.util.Scanner;

public class Porcentagem {
    public static void main (String[] args){

        System.out.println("Digite seu salário para ver quanto será de aumento.");
        Scanner s = new Scanner(System.in);
        double porcentagemInicial = 0.2;
        int salario = s.nextInt();

        double resultado = salario + (porcentagemInicial * salario);

        System.out.println("O Acrecimo foi de: " + salario + " para " + resultado);
    }
}
