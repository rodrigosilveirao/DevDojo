package com.rodrigorcs.logica.condicionais.switchcase;
import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {
        System.out.println("Digite um dia para ver se é dia útil: ");
        Scanner s = new Scanner(System.in);
        byte dia = s.nextByte();
        switch (dia){
            case 1:
                System.out.println("Domingo não é dia útil.");
                break;
            case 2:
                System.out.println("Segunda é dia útil.");
                break;
            case 3:
                System.out.println("Terça é dia útil.");
                break;
            case 4:
                System.out.println("Quarta é dia útil.");
                break;
            case 5:
                System.out.println("Quinta é dia útil.");
                break;
            case 6:
                System.out.println("Sexta é dia útil.");
                break;
            case 7:
                System.out.println("Sabado não é dia útil.");
                break;
            default:
                System.out.println("Dia inválido.");
        }
    }
}
