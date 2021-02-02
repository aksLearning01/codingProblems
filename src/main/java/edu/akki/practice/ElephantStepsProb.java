package edu.akki.practice;

import java.util.Scanner;

/*
An elephant decided to visit his friend. It turned out that the elephant's house is located at point 0 and his friend's house is located at point  of the coordinate line. In one step the elephant can move 1, 2, 3, 4 or 5 positions forward.
        Determine, what is the minimum number of steps he need to make in order to get to his friend's house.*/

public class ElephantStepsProb {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp =sc.nextInt();
        System.out.println(find(inp));
    }

    public static int find(int n){
        int res=0;

        while(true){
           if(n%5==0){
               return n/5;
           }else if (n%5!=0 && n>5){
               return n/5 +find(n%5);
           }else if (n%4==0){
               return n/4;
           }else if (n%4!=0 && n>4){
               return n/4 +find(n%4);
           }else if (n%3==0){
               return n/3;
           }else if (n%3!=0 && n>3){
               return n/3 +find(n%3);
           }else if (n%2==0){
               return n/2;
           }else if (n%2!=0 && n>2){
               return n/2 +find(n%2);
           }else if (n%1==0){
               return n/1;
           }
       }

    }
}
