package org.example;

import java.util.Scanner;

public class Ativ22 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int paTotal = 0;
        System.out.println("Digite o primeiro termo da PA:");
        int paStart = read.nextInt();
        System.out.println("Digite a razão da PA:");
        int paRazao = read.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(paStart);
            paTotal = paTotal + paStart;
            paStart = paStart + paRazao;
        }
        System.out.println("Soma de todos os primeiros 10 valoreas da PA: "+ paTotal);
    }
}
