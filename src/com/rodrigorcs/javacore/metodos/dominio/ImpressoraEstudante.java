package com.rodrigorcs.javacore.metodos.dominio;

public class ImpressoraEstudante {
    public static void imprime(Estudante estudante) {

        System.out.println("---------------");

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
