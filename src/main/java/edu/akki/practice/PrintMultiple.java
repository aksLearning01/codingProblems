package edu.akki.practice;

import java.util.Scanner;

public class PrintMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp =sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(inp*i);
        }
    }
}
