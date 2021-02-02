package edu.akki.practice;

import java.util.Scanner;

public class BrickProb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = sc.nextInt();
        int i = 1;
        String winner = "";

        while (res > 0) {
            res = res - i;
            if(res <= 0){
                winner = "Patlu";
                break;
            }
            res = res - 2*i;
            if(res <= 0) {
                winner = "Motu";
                break;
            }
            i++;
        }
        System.out.println(winner);
    }

}
