package org.example;

import java.util.Scanner;

public class Ativ9 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Digite o comprimento do primeiro segmento:");
        int seg1 = read.nextInt();
        System.out.println("Digite o comprimento do segundo segmento:");
        int seg2 = read.nextInt();
        System.out.println("Digite o comprimento do terceiro segmento:");
        int seg3 = read.nextInt();

        if ((seg1 < seg2 + seg3) && (seg2 < seg1 + seg3) && (seg3 < seg1 + seg2)){
            System.out.println("As três retas formam um triângulo.");
            if (seg1 == seg2 && seg2 == seg3){
                System.out.println("Equilátero.");
            } else if (seg1 != seg2 && seg2 != seg3){
                System.out.println("Escaleno.");
            } else{
                System.out.println("Isósceles.");
            }
        } else{
            System.out.println("As retas não formam um triângulo.");
        }
    }
}
