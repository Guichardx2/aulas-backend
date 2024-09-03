package org.example;
import java.util.ArrayList;
import java.util.List;

public class BasePorto {
    String nome;
    List<String> barcosAtracados =  new ArrayList<String>();

    public void atracarBarco (Barco barco){

        barcosAtracados.add(barco.nome);
    }
    public void desatracarBarco (Barco barco){

        barcosAtracados.remove(barco.nome);
    }
}
