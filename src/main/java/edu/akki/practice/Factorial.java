package edu.akki.practice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));


    }

    public static int fact(int n) {
        if (n == 1) return 1;
        while (n >= 1) {
            return n * fact(n - 1);
        }
        return 1;
    }
}
