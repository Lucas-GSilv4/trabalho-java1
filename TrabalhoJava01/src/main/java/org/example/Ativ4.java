package org.example;

import java.util.Scanner;

public class Ativ4 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num = read.nextInt();
        int isEven = num % 2;
        if (isEven == 0){
            System.out.println("Esse número é par.");
        } else{
            System.out.println("Esse número é ímpar.");
        }
    }
}
