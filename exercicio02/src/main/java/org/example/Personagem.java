
package org.example;

public class Personagem {
    String nome;
    Integer vida= 10;

    public void verificaSeEstaVivo(){
        if (vida > 0){
            System.out.println("Está vivo");
        } else{
            System.out.println("Está morto");
        }
    }

    public void atacar(Personagem alvo){
        System.out.println(this.nome + " atacou " + alvo.nome);
        if (vida == 0){
            System.out.println("Jogador morto não pode atacar ninguém pois está morto");
        }else{
            alvo.vida -= 5;
            this.vida += 5;
        }
    }

    public void setarNome(String nome){
        this.nome= nome;
    }
}
