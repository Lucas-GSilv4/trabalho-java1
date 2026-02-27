package org.example;

import java.util.Scanner;

public class Ativ3 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Digite a 1° nota do aluno: ");
        double grade1 = read.nextDouble();
        System.out.println("Digite a 2° nota do aluno: ");
        double grade2 = read.nextDouble();
        double avg = (grade1 + grade2) / 2;
        if (avg > 7){
            System.out.println("A média do aluno foi "+ avg +" e conseguiu um bom aproveitamento.");
        } else{
            System.out.println("A média do aluno foi "+ avg +" e não conseguiu um bom aproveitamento.");
        }
    }
}