package org.example;

import java.util.Scanner;

public class Ativ11 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Digite o nome do funcionário:");
        String name = read.nextLine();
        System.out.println("Digite o salário do funcionário:");
        double payment = read.nextDouble();
        System.out.println("Digite quantos anos este funcionário trabalha na empresa:");
        int year = read.nextInt();
        if (year < 3){
            double increase = ((payment / 100) * 3) + payment;
            System.out.println("Nome: "+ name);
            System.out.println("Antigo salário: "+ payment);
            System.out.println("Anos na empresa: "+ year);
            System.out.println("Novo salário: "+ increase);
        } else if (year <= 10){
            double increase = ((payment / 100) * 12.5) + payment;
            System.out.println("Nome: "+ name);
            System.out.println("Antigo salário: "+ payment);
            System.out.println("Anos na empresa: "+ year);
            System.out.println("Novo salário: "+ increase);
        } else{
            double increase = ((payment / 100) * 20) + payment;
            System.out.println("Nome: "+ name);
            System.out.println("Antigo salário: "+ payment);
            System.out.println("Anos na empresa: "+ year);
            System.out.println("Novo salário: "+ increase);
        }
    }
}