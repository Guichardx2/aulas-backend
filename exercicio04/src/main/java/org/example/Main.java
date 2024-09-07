package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner e ArrayList de musicas disponiveis
        Scanner scanner = new Scanner(System.in);
        MusicCloud cloud = new MusicCloud();

        //Criando musicas
        String nomeMusica = "";
        String artistaMusica= "";
        Boolean musicaPerguntada = false;
        Boolean musicaPesquisada = false;

        System.out.println("===========================================");
        System.out.println("Vamos começar adicionando 5 músicas que você mais escuta!");

        for (int i=0; i < 5; i ++) {

            //Iniciando criação de musicas
            if (!musicaPerguntada){
                System.out.println("Digite o nome da música: ");
                nomeMusica = scanner.nextLine().toUpperCase();

                System.out.println("Digite o nome do artista: ");
                artistaMusica = scanner.nextLine().toUpperCase();
                musicaPerguntada = true;

            } else {
                System.out.println("===========================================");
                System.out.println("Digite o nome de outra música: ");
                nomeMusica = scanner.nextLine().toUpperCase();

                System.out.println("Quem canta esta música: ");
                artistaMusica = scanner.nextLine().toUpperCase();

            }

            //Adiciona as musicas como disponiveis
            if (cloud.musicasDisponiveis.contains(nomeMusica)) {
                System.out.println("===========================================");
                System.out.println("Essa música já foi adicionada! Digite outra música: ");
                nomeMusica = scanner.nextLine().toUpperCase();

                System.out.println("Quam canta esta música: ");
                artistaMusica = scanner.nextLine().toUpperCase();

            }else {
                Musica music = new Musica(nomeMusica, artistaMusica);
                cloud.adicionarMusica(music.getNome()); // ou nomeMusica
            }
        }

        //Criando playlist
        System.out.println("===========================================");
        Playlist playlist = new Playlist();
        System.out.println("Vamos dar um nome a sua playlist: ");
        playlist.nome = scanner.nextLine();

        //Pesquisando musicas
        for (int j=0; j < cloud.musicasDisponiveis.size(); j ++) {

            if (!musicaPesquisada){
                System.out.println("===========================================");
                System.out.println("Que tal adicionar algumas músicas a sua playlist? ");
                System.out.println("Digite o nome da música: ");
                String search = scanner.nextLine().toUpperCase();

                if (cloud.musicasDisponiveis.contains(search)){
                    cloud.pesquisarMusica(search);
                    playlist.musicas.add(search);
                    System.out.println("Música " + search + " encontrada! Adicionando na playlist...");
                    System.out.println("Música adicionada em " + playlist.nome + " com sucesso!");
                    System.out.println("===========================================");
                    musicaPesquisada= true;

                } else if (search.isEmpty()) {
                    System.out.println("===========================================");
                    System.out.println("Sua playlist ficou assim: ");
                    System.out.println(playlist.musicas);
                    System.out.println("===========================================");
                }else {
                    System.out.println("Música não encontrada, digite outra música! ");
                }

            } else if (musicaPesquisada) {
                System.out.println("Digite o nome de outra música que queira adicionar, por favor: ");
                String search = scanner.nextLine().toUpperCase();

                if (cloud.musicasDisponiveis.contains(search)) {
                    cloud.pesquisarMusica(search);
                    playlist.musicas.add(search);
                    System.out.println("Música " + search + " encontrada! Adicionando na playlist...");
                    System.out.println("Música adicionada em " + playlist.nome + "com sucesso!");
                    System.out.println("===========================================");

                } else if (search.isEmpty()) {
                    System.out.println("===========================================");
                    System.out.println("Sua playlist ficou assim: ");
                    System.out.println(playlist.musicas);
                    System.out.println("===========================================");
                }else {
                    System.out.println("Música não encontrada, digite outra música! ");
                }
            }
        }
        System.out.println("===========================================");
        System.out.println("Sua playlist ficou assim: ");
        System.out.println(playlist.musicas);
        System.out.println("===========================================");
    }
}