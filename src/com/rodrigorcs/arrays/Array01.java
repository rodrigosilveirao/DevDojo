package com.rodrigorcs.arrays;
import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {
        double[] notas = new double[4];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 4 ; i++) {
            System.out.println("Digite suas nota: " + (i + 1));
            notas[i] = s.nextDouble();
        }
        double media = 0 ;
        for (int i = 0; i < notas.length; i++) {
            media = media + notas[i];
            System.out.println("Nota: " + (i+1) +": " + notas[i]);
        }
        media = media / notas.length;
        System.out.println(media);
    }
}
