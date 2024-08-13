package org.example;

import java.util.Random;
import java.util.Scanner;

public class Exercicio00 {
    public static void main(String[] args) {
        //System.out.println("Hello World!");

        while(true){
            //Exercicio 0

            String primeiroNome;
            String segundoNome;

            //criando vetor de strings
            // String[] times = new String[45];
            String[] times = {"criciuma", "brasil", "gremio", "vasco"};

            //import do leitor
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite seu primeiro nome:");
            primeiroNome= scanner.nextLine();

            if (primeiroNome == "") return;

            System.out.println("Digite seu segundo nome:");
            segundoNome= scanner.nextLine();

            // import do gerador aleatório
            Random random= new Random();
            int numAleatorio= random.nextInt(10,99);

            int posicaoAleatoria = random.nextInt(times.length);
            String timeEscolhido= times[posicaoAleatoria];

            System.out.println("Seja bem vindo " + primeiroNome + segundoNome + numAleatorio + timeEscolhido);
git pull
        }
    }
}