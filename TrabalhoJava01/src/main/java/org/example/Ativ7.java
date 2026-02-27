package org.example;

import java.util.Objects;
import java.util.Scanner;

public class Ativ7 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String name = read.nextLine();
        System.out.println("Digite seu sexo (Masculino/Feminino):");
        String sex = read.nextLine();
        System.out.println("Digite o valor da compra:");
        double purchasePrice = read.nextDouble();
        if (Objects.equals(sex, "Masculino") || Objects.equals(sex, "masculino")){
            double discount = (purchasePrice / 100) * 8;
            System.out.println("Nome do cliente: "+ name);
            System.out.println("Sexo do cliente : "+ sex);
            System.out.println("Valor da compra: "+ purchasePrice);
            System.out.println("Valor com desconto: "+ (purchasePrice - discount));
        } else if (Objects.equals(sex, "Feminino") || Objects.equals(sex, "feminino")){
            double discount = (purchasePrice / 100) * 13;
            System.out.println("Nome do cliente: "+ name);
            System.out.println("Sexo do cliente : "+ sex);
            System.out.println("Valor da compra: "+ purchasePrice);
            System.out.println("Valor com desconto: "+ (purchasePrice - discount));
        } else{
            System.out.println("Sexo inválido, por favor digite um sexo válido ou escreva corretamente.");
        }
    }
}