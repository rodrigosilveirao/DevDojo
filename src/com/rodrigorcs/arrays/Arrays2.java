package com.rodrigorcs.arrays;
import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int[] array3 = new int[3];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < array1.length; i++) {
            array1[i] = s.nextInt();
        }

        for (int i = 0; i < array2.length; i++) {
            array2[i] = s.nextInt();
        }

        for (int i = 0; i < array2.length; i++) {
            array3[i] = array1[i] * array2[i];
            System.out.println(array3[i]);
        }
    }
}
