package com.rodrigorcs.javacore.sobrercargametodos.test;

import com.rodrigorcs.javacore.sobrercargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("H x H" , "TV" , 24, "Acao");

        anime.imprime();
    }
}
