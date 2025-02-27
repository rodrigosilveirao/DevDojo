package com.rodrigorcs.logica.arraysmultidimensionais;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Negativo para o programa");
        int soma = 0;
        int contador = 0;

        while(true){
            int num = s.nextInt();

            if (num <= 0){
                break;
            }else{
                soma += num;
                contador ++;
            }
        }
        if (contador == 0){
            System.out.println("Digite algum numero.");
        } else {
            int  media = soma / contador;
            System.out.println("A media dos numeros digitados foi: " + media);
        }
    }
}

