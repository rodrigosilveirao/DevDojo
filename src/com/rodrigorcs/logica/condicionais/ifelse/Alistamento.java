package com.rodrigorcs.logica.condicionais.ifelse;

import java.util.Scanner;

public class Alistamento {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Qual seu sexo? M para Masculino e F para Feminino");
        String sexo = s.next();

        System.out.println("Qual sua idade?");
        int idade = s.nextInt();
        if (sexo.equalsIgnoreCase("M") && idade >= 18 ){
            System.out.println(" Alistamentos obrigatorio. ");
        } else if (sexo.equalsIgnoreCase("F") && idade >= 18) {
            System.out.println("Deseja se alistar?");
        } else {
            System.out.println("Alistamentos não permitido. ");
        }
    }
}
