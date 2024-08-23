package org.example;

import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

public class exercicio01 {
    public static void main(String[] args) {
        while(true){
            String op1;
            String op2;

            Scanner leitor = new Scanner(System.in);

            Random aleatorio= new Random();

            // Array de filmes de Sci-fi Drama
            String[] sciFiDrama = {"Interstellar", "Arrival", "Ex Machina", "Her", "2001: Uma Odisseia no Espaço"};

            // Array de filmes de Sci-fi Comédia
            String[] sciFiComedia = {"Galaxy Quest", "O Quinto Elemento", "Back to the Future", "Men in Black", "Spaceballs"};

            // Array de filmes Medieval Comédia
            String[] medievalComedia = {"Monty Python e o Cálice Sagrado", "A Princesa Prometida", "O Nome da Rosa", "Shrek", "Alexandre e o Dia Maravilhoso"};

            // Array de filmes Medieval Drama
            String[] medievalDrama = {"Gladiador", "O Último dos Moicanos", "O Nome da Rosa", "Braveheart", "A 13ª Guerreira"};

            //array de Sci-fi Drama
            int posicaoAleatoriaScifiDrama = aleatorio.nextInt(sciFiDrama.length);
            String scifiDramaEscolhido = sciFiDrama[posicaoAleatoriaScifiDrama];

            //array de Sci-fi Comédia
            int posicaoAleatoriaScifiComedia = aleatorio.nextInt(sciFiComedia.length);
            String sciFiComediaEscolhido =  sciFiComedia[posicaoAleatoriaScifiComedia];

            //Array de Medieval Comédia
            int posicaoAleatoriaMedComedia = aleatorio.nextInt(medievalComedia.length);
            String medComediaEscolhido =  medievalComedia[posicaoAleatoriaMedComedia];

            //Array de Medieval Drama
            int posicaoAleatoriaMedDrama = aleatorio.nextInt(medievalDrama.length);
            String medDramaEscolhido= medievalDrama[posicaoAleatoriaMedDrama];


            System.out.println("Qual ambientação você prefere?");
            System.out.println("1- Sci-fi\n" + "2- Medieval");
            op1= leitor.nextLine(); //ou nextInt

            System.out.println("Qual gênero você prefere?");
            System.out.println("1-Comédia\n" + "2- Drama");
            op2= leitor.nextLine(); //ou nextInt

            if (op1.equals("") || op2.equals("")){
                return;
            }else{
                if (Objects.equals(op1, "1") && Objects.equals(op2, "1")){
                    System.out.printf("Recomendamos este filme para você: %s%n", sciFiComediaEscolhido);
                }else if (Objects.equals(op1, "1") && Objects.equals(op2, "2")){
                    System.out.printf("Recomendamos este filme para você: %s%n", scifiDramaEscolhido);
                }else if (Objects.equals(op1, "2") && Objects.equals(op2, "1")){
                    System.out.printf("Recomendamos este filme para você: %s%n", medComediaEscolhido);
                }else if (Objects.equals(op1, "2") && Objects.equals(op2, "2")){
                    System.out.printf("Recomendamos este filme para você: %s%n", medDramaEscolhido);
                }
            }
        }
    }
}
