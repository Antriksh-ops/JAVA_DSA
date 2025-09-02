package com.company;

public class Prob2 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
                if(i > 1 && j > 1 ){
                    for (int k = 0; k < 2; k++) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
