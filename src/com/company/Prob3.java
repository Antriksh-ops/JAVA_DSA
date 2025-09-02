package com.company;

public class Prob3 {
    public static void main(String[] args) {
        int n = 4 , m = 4;
        for (int i = n; i > n - 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
