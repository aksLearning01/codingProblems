package edu.akki.practice;

import java.util.Scanner;

public class AmanProb {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        Integer sum=0;
        for(int i=0;i<n;i++){
            Integer r= sc.nextInt();
            Integer x= sc.nextInt();

            sum= sum+print(r,x);
        }
        System.out.println(sum);
    }
    private static Integer print(Integer r,Integer x){
        Integer sum =0 ;
        if((22/7 * (2* r)) < (100*x)){
            sum=sum+1;
        }
        return sum;
    }
}
