package com.rodrigorcs.logica.condicionais.fors;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numero = s.nextInt();
        for (int i = 1; i <= 10; i++ ) {
            System.out.println(i * numero);
        }
    }
}
