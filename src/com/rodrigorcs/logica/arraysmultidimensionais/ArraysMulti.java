package com.rodrigorcs.logica.arraysmultidimensionais;

import java.util.Scanner;

public class ArraysMulti {
    public static void main(String[] args) {

        int resultado = 1; // feito fora do escopo para ser usado mais abaixo

        int [] [] arrayMult1 = new int[3][3];
        Scanner s = new Scanner(System.in);
        System.out.println("Digite os valores: ");

        // coletar valores do array
        for (int i = 0; i < arrayMult1.length; i++) {
            for (int j = 0; j < arrayMult1[i].length; j++) {
                arrayMult1[i][j] = s.nextInt();
            }
        }

        //imprir os valores e multiplicar se i for igual a j no caso [0][0]
        for (int i = 0; i < arrayMult1.length; i++) {
            for (int j = 0; j < arrayMult1[i].length; j++) {
                System.out.println("["+ i + "] [" + j + "]" + arrayMult1[i][j]);
                if (i == j){
                    resultado *= arrayMult1[i][j];
                }
            }
        }
        System.out.println("Ao multiplicar [0][0] * [1][1] * [2][2] teremos = " + resultado);
    }
}
