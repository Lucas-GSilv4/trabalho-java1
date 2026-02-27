package org.example;

public class Ativ20 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 500; i >= 0; i-= 50){
            total = total + i;
        }
        System.out.println(total);
    }
}
