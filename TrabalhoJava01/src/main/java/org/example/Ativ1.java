package org.example;

import java.util.Scanner;

public class Ativ1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Insira a velocidade do veículo em Km/h: ");
        int speed = read.nextInt();
        if (speed > 80){
            int overSpeed = speed - 80;
            double ticketValue = overSpeed * 5;
            System.out.println("O veículo foi multado em "+ ticketValue +" Reais.");
        } else {
            System.out.println("O veículo não foi multado");
        }
    }
}