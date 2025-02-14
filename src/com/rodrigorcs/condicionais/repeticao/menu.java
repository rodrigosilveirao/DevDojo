package com.rodrigorcs.condicionais.repeticao;
import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int opcao = 0;
        while(opcao != 3){
            System.out.println("Digite 1 para calcular imposto / 2 para depositar salario / 3 para sair. ");
            int i = s.nextInt();
            if (i == 1){
                System.out.println("Calcular imposto");
            } else if (i == 2) {
                System.out.println("Depositar salario");
            } else {
                System.out.println("Finalizando!");
                break;
            }
        }
    }
}
