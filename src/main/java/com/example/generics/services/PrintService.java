package com.example.generics.services;

import java.util.ArrayList;
import java.util.List;

/*Deseja-se fazer um programa que leia uma quantidade N, e depois N nomes de pessoas. Ao final
* imprima esses números de forma organizada e conforme exemplo.
* Em seguida, informar qual for o primeiro valor informado.*/
public class PrintService<T> {
    /*Jeito ruim
    Objeto aceita qualquer tipo Int/String/Double*/

    //Jeito certo, pois se usaro <T> só pode ser instanciado por 1 tipo
    private List<T> list = new ArrayList<>();


    public void addValue(T value){
        list.add(value);
    }

    public T firts(){
        if(list.isEmpty()){
            throw new IllegalStateException("List is empty");
        }
        //pegando primeiro posição da lista.
        return list.get(0);
    }

    public void print(){
        System.out.print("[");
        if(!list.isEmpty()){
            System.out.print(list.get(0));
        }
        for(int i = 1; i < list.size(); i++){
            System.out.print(", " + list.get(i));
        }
        System.out.print("]");
    }

}
