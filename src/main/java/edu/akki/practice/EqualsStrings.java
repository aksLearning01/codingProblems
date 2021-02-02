package edu.akki.practice;

import java.util.Arrays;
import java.util.Scanner;

public class EqualsStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while (n-- != 0) {
            String s1 = sc.next();
            String s2 = sc.next();
            System.out.println(checkEquals(s1, s2));
        }
    }

    private static String checkEquals(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        String p1 = new String(c1);
        String p2 = new String(c2);
        if (p1.equalsIgnoreCase(p2)) return "YES";
        else return "NO";
    }
}
