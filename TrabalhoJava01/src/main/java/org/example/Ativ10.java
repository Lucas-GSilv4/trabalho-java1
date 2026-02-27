package org.example;

import java.util.Scanner;

public class Ativ10 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Digite a largura do terreno (em metro):");
        double larg = read.nextDouble();
        System.out.println("digite o comprimento do terreno (em metro):");
        double comp = read.nextDouble();
        double area = larg * comp;
        if (area < 100){
            System.out.println("TERRENO POPULAR.");
        } else if (area >= 100 && area <= 500){
            System.out.println("TERRENO MASTER.");
        } else{
            System.out.println("TERRENO VIP");
        }
    }
}
