package edu.akki.practice;

import java.util.Scanner;

public class DurationProb {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            int sh = sc.nextInt();
            int sm = sc.nextInt();

            int eh= sc.nextInt();
            int em=sc.nextInt();

            System.out.println(calculateTime(sh,sm,eh,em));
        }
    }

    private static String calculateTime(int sh, int sm, int eh, int em) {
         long startingTime = sm + (sh%60)*60;
         long endingTime = em+ (eh%60)*60;

         long diff = endingTime-startingTime;
         long h= diff/60;
         long m= diff%60;
         StringBuffer sb= new StringBuffer();
         sb.append(h).append(" ").append(m);
         return sb.toString();
    }
}
