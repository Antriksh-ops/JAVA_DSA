/*
package com.company;

public class Prob4 {
    public static void main(String[] args) {
        int n = 4;
        int m = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
*/
package com.company;

public class Prob4 {
    public static void main(String[] args) {
        int n = 4;
        int m = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
