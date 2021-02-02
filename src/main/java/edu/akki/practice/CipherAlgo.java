package edu.akki.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CipherAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        List<Integer> result= new ArrayList<>();
        for (int i=0;i<testCases;i++) {
          String inp= sc.nextLine();
          String enc= sc.nextLine();
            result.add(check(inp,enc));
        }
       result.stream().forEach(System.out::println);
    }

    private static int check(String inp, String enc) {
        char[] c1= inp.toCharArray();
        char[] c2= enc.toCharArray();

        if(c1.length!=c2.length)
            return -1;
        int diff1=0, diff2=0;
        diff1= (int)c1[0]-(int)c2[0];
        for(int i=1;i<c1.length;i++){
             diff2= (int)c1[i]-(int)c2[i];
             if(diff1!=diff2){
                 return -1;
             }
        }
        return Math.abs(diff1);
    }

}
