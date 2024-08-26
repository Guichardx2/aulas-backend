package org.example;

public class Main {
    public static void main(String[] args) {
        Personagem jogador = new Personagem();
        jogador.nome= "Steve";
        jogador.vida= 5;

        Personagem inimigo = new Personagem();
        inimigo.nome="Herobrine";
        inimigo.vida= 100;

        Creeper verdao = new Creeper();
        verdao.vida= 50;


        jogador.atacar(inimigo);
        verdao.atacar(jogador);

        System.out.print("Steve ");
        jogador.verificaSeEstaVivo();
        System.out.print("Herobrine ");
        inimigo.verificaSeEstaVivo();
        System.out.print("Creeper ");
        verdao.verificaSeEstaVivo();
//        System.out.println("Jogador " + jogador.nome + "/ vida: " + jogador.vida);
//        System.out.println("Inimigo " + inimigo.nome + "/ vida: " + inimigo.vida);
        System.out.println("Steve " + jogador.vida + " vida");
        System.out.println("Herobrine " + inimigo.vida + " vida");
        System.out.println("Creeper " + verdao.vida + " vida");
    }
}