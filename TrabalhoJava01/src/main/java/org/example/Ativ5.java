package org.example;

import java.util.Scanner;

public class Ativ5 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Digite um ano: ");
        int year = read.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("Esse ano é bissexto.");
        } else{
            System.out.println("Esse ano não é bissexto.");
        }
    }
}