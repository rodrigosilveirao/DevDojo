package com.rodrigorcs.condicionais.repeticao;
import java.util.Scanner;

public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        System.out.println("Digite um numero para ver os pares dentro dele. ");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        int numero = 1;
        while(i >= numero){
            System.out.println(numero);
            numero = numero += 2;

        }
    }
}
