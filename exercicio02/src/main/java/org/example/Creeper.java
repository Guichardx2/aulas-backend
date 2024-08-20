package org.example;

public class Creeper extends Personagem {
    @Override
    public void atacar(Personagem alvo){
        if (vida == 0){
            System.out.println("Jogador morto não pode atacar ninguém pois está morto");
        }else{
            alvo.vida -= 8;
            this.vida = 0;
        }
    }
}
