package com.rodrigorcs.javacore.modificadoresestaticos;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private double velocidadeLimite = 250;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.velocidadeMaxima);
        System.out.println(this.velocidadeLimite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public void setVelocidadeLimite(double velocidadeLimite) {
        this.velocidadeLimite = velocidadeLimite;
    }
}
