package org.example;

import java.util.Scanner;

public class Ativ17 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        int start = read.nextInt();
        System.out.println("Digite o último valor:");
        int finish = read.nextInt();
        System.out.println("Digite o incremento:");
        int inc = read.nextInt();

        while (start <= finish){
            System.out.println(start);
            start = start + inc;
        }
    }
}
