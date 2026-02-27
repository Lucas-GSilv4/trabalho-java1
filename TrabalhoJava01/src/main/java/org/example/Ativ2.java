package org.example;

import java.util.Scanner;

public class Ativ2 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Digite o seu ano de nascimento: ");
        int birthYear = read.nextInt();
        int userAge = 2026 - birthYear;
        if (userAge >= 16){
            System.out.println("Você já pode votar.");
        } else {
            System.out.println("Você não pode votar ainda.");
        }
    }
}
