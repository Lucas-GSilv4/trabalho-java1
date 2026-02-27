package org.example;

import java.util.Scanner;

public class Ativ6 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Digite o seu ano de nascimento:");
        int birthYear = read.nextInt();
        int userAge = 2026 - birthYear;
        if (userAge > 18){
            System.out.println("Já se passaram "+ (userAge - 18) +" anos do alistamento.");
        } else{
            System.out.println("Faltam "+ (18 - userAge) +" para o seu alistamento.");
        }
    }
}
