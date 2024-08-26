package org.example;

public class PortoGrande extends BasePorto{
    @Override
    public void atracarBarco (Barco barco){
        if (barco.tamanho >= 10){
            barcosAtracados.add(barco.nome);
            System.out.println("Barco " + barco.nome + " chegou ao maior porto!");
        }
    }
}
