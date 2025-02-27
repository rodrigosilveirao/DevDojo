package com.rodrigorcs.javacore.classes.test;

import com.rodrigorcs.javacore.classes.dominio.Carro;

public class TestCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "911";
        carro1.marca = "Porshe";
        carro1.ano = 2020;

        Carro carro2 = new Carro();
        carro2.nome = "M3";
        carro2.marca = "BMW";
        carro2.ano = 2020;

        System.out.println(carro1.nome + carro2.nome);
    }
}
