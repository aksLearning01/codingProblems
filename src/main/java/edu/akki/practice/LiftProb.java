package edu.akki.practice;

import java.util.Scanner;

public class LiftProb {

    private static int liftA = 0;
    private static int liftB = 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int call = sc.nextInt();
            System.out.println(findTheLiftCall(call));
        }
    }

    private static String findTheLiftCall(int call) {
        if (Math.abs(call - liftA) <= Math.abs(call - liftB)  && liftA<liftB) {
            liftA = call;
            return "A";
        }
        else{
            liftB = call;
            return "B";
        }
    }
}
