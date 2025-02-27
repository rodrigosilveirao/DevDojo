package com.rodrigorcs.logica.condicionais.ifelse;

import java.util.Scanner;

public class Login {
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Digite usuario para cadastrar: ");
        String login = s.nextLine();
        if (login == null || login.isEmpty()){
            System.out.println("Digite um login valido");
        } else if (login.equalsIgnoreCase("admin") || login.equalsIgnoreCase("admnistrador")){
            System.out.println("Somente ADM's podem criar login de admnistrador. ");
        }
        else {
            System.out.println("Cadastro concluido.");
        }
    }
}
