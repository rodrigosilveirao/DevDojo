package com.rodrigorcs.condicionais.repeticao;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Digite o login: ");
        final String usuario = s.next();;
        System.out.println("Digite sua senha: ");
        final String senha = s.next();
        System.out.println("Cadastrado com sucesso. Faca login");

        while (true){
            String user = s.next();
            String password = s.next();
            if (user.equalsIgnoreCase(usuario) && password.equalsIgnoreCase(senha) ){
                System.out.println("Acesso permitido ");
                break;
            }else {
                System.out.println("Acesso negado");
            }
        }
    }
}