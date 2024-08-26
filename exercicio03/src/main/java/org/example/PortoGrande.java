package org.example;

public class PortoGrande extends BasePorto{
    @Override
    public void atracarBarco (Barco barco){
        if (barco.tamanho >= 10){
            for (int i= 0; i < barcosAtracados.length; i++){
                barcosAtracados[i]= barco.nome;
            }
        }else{
            System.out.println("Barco granddeddd de mais para atracar aqui!");
        }
    }
}
