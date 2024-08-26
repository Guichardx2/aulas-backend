package org.example;

public class PortoPequeno extends BasePorto{
    @Override
    public void atracarBarco (Barco barco){
        if (barco.tamanho <= 10){
            barcosAtracados.add(barco.nome);
            System.out.println("Barco " + barco.nome + " atracou no menor porto!");
        }else{
            System.out.println("Barco " + barco.nome + " é grande de mais para atracar no porto pequeno! Estamos redirecionando para outro porto...");
        }
    }
}
