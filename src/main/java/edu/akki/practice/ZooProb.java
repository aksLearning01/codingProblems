package edu.akki.practice;

import java.util.Scanner;

public class ZooProb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp=sc.nextLine();
        System.out.println(checkForZoo(inp));

    }

    public static String checkForZoo(String x) {
        long no_of_z = x.chars().filter(p -> p == 'z').count();
        long no_of_o = x.chars().filter(p -> p == 'o').count();

        if (no_of_o == 2 * no_of_z) {
            return "yes";
        } else {
            return "no";
        }
    }
}
