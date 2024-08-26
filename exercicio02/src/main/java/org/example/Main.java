package org.example;

public class Main {
    public static void main(String[] args) {
        Personagem jogador = new Personagem();
        jogador.nome= "Steve";
        jogador.vida= 15;
        jogador.ataque = 20;

        Personagem inimigo = new Personagem();
        inimigo.nome="Herobrine";
        inimigo.vida= 100;
        inimigo.ataque= 80;

        Creeper verdao = new Creeper();
        verdao.nome= "Verdão";
        verdao.vida= 50;
        verdao.ataque=50;

        System.out.println("Status: ");
        System.out.println("Steve /" +  jogador.vida +  " vida / " + "ataque " + jogador.ataque);
        System.out.println("Herobrine /" + inimigo.vida + " vida / " + "ataque " + inimigo.ataque);
        System.out.println("Creeper /" + verdao.vida + " vida / " + "ataque " + verdao.ataque);

        System.out.println("==================================");

        System.out.println("Início:");

        jogador.atacar(inimigo);
        System.out.print("Steve ");
        jogador.verificaSeEstaVivo();
        System.out.print("Herobrine está com " + inimigo.vida + " de vida, porém, ");
        inimigo.verificaSeEstaVivo();

        System.out.println("==================================");

        verdao.atacar(jogador);
        System.out.print("Creeper ");
        verdao.verificaSeEstaVivo();
        System.out.print("Steve está com " + jogador.vida + " de vida, então, ");
        jogador.verificaSeEstaVivo();
    }
}