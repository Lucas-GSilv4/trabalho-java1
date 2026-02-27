package org.example;

import java.util.Scanner;

public class Ativ21 {
    public static void main(String[] args) {
        int total = 0;
        Scanner read = new Scanner(System.in);
        for (int i = 1; i <= 7; i++){
            System.out.println("Digite o "+ i +"º número:");
            int num = read.nextInt();
            total = total + num;
        }
        System.out.println("A soma entre os valores acima é "+ total);
    }
}
