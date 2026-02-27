package org.example;

import java.util.Scanner;

public class Ativ8 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Escreva a quantidade de kilômetros que irá percorrer:");
        int km = read.nextInt();
        if (km < 200){
            double price = km * 0.50;
            System.out.println("O valor da viagem será "+ price +" reais");
        } else{
            double price = km * 0.45;
            System.out.println("O valor da viagem será "+ price +" reais");
        }
    }
}
