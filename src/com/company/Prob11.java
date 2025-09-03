package com.company;

public class Prob11 {
    public static void main(String[] args) {
        int n = 5;
        int m = 5;
        for (int i = 1; i <= n ; i++) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // first half
            int count = 2;
            for (int j = i; j >= 1 ; j--) {
                System.out.print(j);
            }

            //  second half
            for (int j = 2; j <= i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
