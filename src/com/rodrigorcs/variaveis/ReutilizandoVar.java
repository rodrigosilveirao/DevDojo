package com.rodrigorcs.variaveis;

import java.util.Scanner;

public class ReutilizandoVar {
    public static void main (String[] args){

        System.out.println("Digite seu salário");
        Scanner s = new Scanner(System.in);
        int salario = s.nextInt();

        double trinta= 30;
        double quinze = 15;
        double cinco = 5;

        double resultado = salario * (trinta / 100);

        System.out.println(resultado);

        resultado = salario * (quinze / 100);
        System.out.println(resultado);

        resultado = salario * (cinco/100);
        System.out.println(resultado);


    }
}
