package edu.akki.practice;

import java.util.Scanner;

public class VcPairProb {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int tc = sc.nextInt();

        for(int i=0;i<tc;i++){
              int n = sc.nextInt();
              sc.nextLine();
              String s= sc.nextLine();
            System.out.println(find(s));
        }
    }

    private static int find(String s) {
        int res=0;
        char[] c= s.toCharArray();
        for(int i=0;i<c.length-1;i++){
            if(c[i]!=('a') && c[i]!=('e') && c[i]!=('i') && c[i]!=('o') && c[i]!=('u')){
                if(c[i+1]==('a') || c[i+1]==('e') || c[i+1]==('i') || c[i+1]==('o') || c[i+1]==('u')){
                    res++;
                }
            }
        }
        return res;
    }
}
