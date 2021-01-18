package edu.akki.practice;

import java.util.Scanner;

public class Anagrams {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String inp1 = "";
        String inp2 = "";
        for (int i = 0; i < n; i++) {
            if (sc.hasNextLine()) {
                inp1 = sc.nextLine();
            }
            if (sc.hasNextLine()) {
                inp2 = sc.nextLine();

                int count1[] = new int[26];
                int count2[] = new int[26];

                for (int p = 0; p < inp1.length(); p++) {
                    count1[inp1.charAt(p) - 'a']++;
                }

                for (int q = 0; q < inp2.length(); q++) {
                    count2[inp2.charAt(q) - 'a']++;
                }

                int res = 0;
                for (int c = 0; c < 26; c++) {
                    res = res + Math.abs(count1[c] - count2[c]);
                }
                System.out.println(res);
            }
        }

    }
}