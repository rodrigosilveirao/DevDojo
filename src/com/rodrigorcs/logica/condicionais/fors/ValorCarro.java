package com.rodrigorcs.logica.condicionais.fors;

public class ValorCarro {
    public static void main(String[] args) {
       // double carro = 30000;
        for (int i = 1000; i <= 30000; i++) {
            if (i >= 1000){
                double QuantidadeParcelas = 30000 / i;
                System.out.println(QuantidadeParcelas);
                break;
            }
        }
    }
}
