package com.rodrigorcs.variaveis;

import java.util.Scanner;

public class ImparOuPar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = s.nextInt();
        if (numero % 2 == 0){
            System.out.println(numero + " é par");
        } else {
            System.out.println(numero + " é impar");
        }
    }
}
