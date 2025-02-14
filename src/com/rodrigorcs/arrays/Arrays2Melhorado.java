package com.rodrigorcs.arrays;
import java.util.Scanner;

public class Arrays2Melhorado {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int[] array3 = new int[3];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < array1.length; i++) {
            array1[i] = s.nextInt();
            array2[i] = s.nextInt();
            array3[i] = array1[i] * array2[i];
            System.out.println(array3[i]);
        }
    }
}
