package edu.akki.practice;

import java.util.Scanner;

public class CharSumProb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
            System.out.println(calcWt(s));
    }

    private static long calcWt(String s) {
        char[] c= s.toCharArray();
        long sum= s.chars().map((x)->(int)x -96).sum();
        return sum;
    }
}
