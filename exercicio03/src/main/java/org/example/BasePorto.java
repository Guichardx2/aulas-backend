package org.example;

public class BasePorto {
    String nome;
    String[] barcosAtracados=  new String[5];

    public void atracarBarco (Barco barco){
        for (int i= 0; i < barcosAtracados.length; i++){
            barcosAtracados[i]= barco.nome;
        }
    }
    public void desatracarBarco (Barco barco){
        for (int i= 0; i < barcosAtracados.length; i++){
            barcosAtracados[i]= null;
        }
    }
}
