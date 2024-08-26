package org.example;

public class Creeper extends Personagem {
    @Override
    public void atacar(Personagem alvo){
        System.out.println(this.nome + " atacou " + alvo.nome);
        if (vida <= 0){
            System.out.println("Jogador morto não pode atacar");
        }else{
            alvo.vida -= this.ataque;
            this.vida = 0;
        }
    }
}
