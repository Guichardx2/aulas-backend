package org.example;

import java.util.ArrayList;

public class MusicCloud extends Playlist {
    ArrayList<String> musicasDisponiveis = new ArrayList<String>();

    public void adicionarMusica(String musica) {
        musicasDisponiveis.add(musica);
    }

    public void pesquisarMusica(String musica){
//        if (musicasDisponiveis.contains(musica)){
//            System.out.println("Música " + musica + " encontrada!");
//        } else {
//            System.out.println("Música não encontrada!");
//        }
        for (String musicaDisponivel : musicasDisponiveis) {
            if (musicaDisponivel.equals(musica)) {
                return;
            }
        }
        System.out.println("Música não encontrada! Digite uma musica válida.");
    }
}
