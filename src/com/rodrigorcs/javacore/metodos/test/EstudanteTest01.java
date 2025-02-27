package com.rodrigorcs.javacore.metodos.test;

import com.rodrigorcs.javacore.metodos.dominio.Estudante;
import com.rodrigorcs.javacore.metodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Octavia";
        estudante01.idade = 21;
        estudante01.sexo = 'F';

        estudante02.nome = "Dante";
        estudante02.idade = 25;
        estudante02.sexo = 'M';

        ImpressoraEstudante.imprime(estudante01);
        ImpressoraEstudante.imprime(estudante02);
    }
}
