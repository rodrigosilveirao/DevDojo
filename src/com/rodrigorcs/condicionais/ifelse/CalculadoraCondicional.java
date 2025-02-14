package com.rodrigorcs.condicionais.ifelse;

import java.util.Scanner;

public class CalculadoraCondicional {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite seu salario: ");
        int salario = s.nextInt();
        if (salario > 4500){
            System.out.println("Os 30% do salario é: " + 0.3 * salario);
        }else {
            System.out.println("Os 15% do salario é: " +0.15 * salario);
        }
    }

}
