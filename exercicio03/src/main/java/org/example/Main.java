package org.example;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Barco> listaDeBarcos = new ArrayList<Barco>();

        //Criando barcos
        Barco barco1 = new Barco();
        barco1.nome= "BlackBeard";
        barco1.tamanho=12;

        Barco barco2 = new Barco();
        barco2.nome= "BlackFlag";
        barco2.tamanho=20;

        Barco barco3 = new Barco();
        barco3.nome= "PeppaPig";
        barco3.tamanho=7;

        Barco barco4 = new Barco();
        barco4.nome= "CaptainHook";
        barco4.tamanho=5;

        Barco barco5 = new Barco();
        barco5.nome= "Kraken Jr";
        barco5.tamanho=2;

        listaDeBarcos.add(barco1);
        listaDeBarcos.add(barco2);
        listaDeBarcos.add(barco3);
        listaDeBarcos.add(barco4);
        listaDeBarcos.add(barco5);

        //criando os portos
        PortoPequeno portoPequeno = new PortoPequeno();
        portoPequeno.nome="Small";

        PortoGrande portoGrande = new PortoGrande();
        portoGrande.nome="Big";

        for (Barco barco : listaDeBarcos){
            portoPequeno.atracarBarco(barco);
            portoGrande.atracarBarco(barco);
        }
    }
}