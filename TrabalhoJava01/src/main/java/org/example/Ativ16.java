package org.example;

public class Ativ16 {
    public static void main(String[] args) {
        for (int i = 30; i >= 1; i--){
            if (i % 4 == 0){
                System.out.println("["+ i +"]");
            } else{
                System.out.println(i);
            }
        }
        System.out.println("Acabou!");
    }
}
