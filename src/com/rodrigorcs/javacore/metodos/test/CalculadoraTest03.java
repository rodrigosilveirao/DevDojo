package com.rodrigorcs.javacore.metodos.test;

import com.rodrigorcs.javacore.metodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(10,2);
        System.out.println(result);
        System.out.println("---------------------");
        calculadora.imprimeDivisaoDeDoisNumeros(4,0);
    }
}
