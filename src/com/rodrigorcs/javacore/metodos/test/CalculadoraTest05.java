package com.rodrigorcs.javacore.metodos.test;

import com.rodrigorcs.javacore.metodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);
    }
}
